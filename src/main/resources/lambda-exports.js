require("lambda-scalajs-reporter-fastopt.js");

function makeLambda(scalaCallObject) {
    return function(event, context) {
        try {
            var msg = scalaCallObject.apply(event, context);
            context.done(null, msg);
        } catch (err) {
            context.done(err.toString(), null);
        }
    };
}

exports.handler = makeLambda(InvokeSuccess);
exports.failing = makeLambda(InvokeFail);
