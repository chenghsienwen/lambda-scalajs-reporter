inputFile=$1
lambdaPath=$2
version=0.0.1
commit=$(echo `git rev-list --parents -n 1 HEAD`|cut -c1-7)
lambdaFunction="lambda-scalajs-hello"
if [ -z "$inputFile" ]; then
    inputFile=${lambdaFunction}_${version}_${commit}.zip
fi
if [ -z "$lambdaPath" ]; then
    lambdaPath='htc-advertising-ad-dev/monitor/lambda/'
fi
if [ -z  "node_modules" ]; then
    echo npm install
fi
if [ -f $inputFile ]; then
  rm -rf $inputFile
fi
sbt fastOptJS
sed -i 's/$g.require/require/g' `find target -name *-fastopt.js`
cp `find target -name *-fastopt.js` ./
cp `find target -name *-jsdeps.js` index.js
zip -r $inputFile index.js `find *-fastopt.js`
sleep 5
echo aws s3 cp $inputFile s3://$lambdaPath
aws s3 cp $inputFile s3://$lambdaPath
#upload path
echo upload to: https://s3.amazonaws.com/htc-advertising-ad-dev/monitor/lambda/$inputFile

rm -f `find *-fastopt.js`
rm -f index.js
rm -f $inputFile
