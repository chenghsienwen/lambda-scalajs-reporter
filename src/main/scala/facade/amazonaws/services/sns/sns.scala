package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object sns {
  type ActionsList = js.Array[action]
  type Binary = js.Array[Byte]
  type DelegatesList = js.Array[delegate]
  type ListOfEndpoints = js.Array[Endpoint]
  type ListOfPlatformApplications = js.Array[PlatformApplication]
  type ListString = js.Array[String]
  type MapStringToString = js.Dictionary[String]
  type MessageAttributeMap = js.Dictionary[MessageAttributeValue]
  type PhoneNumber = String
  type PhoneNumberList = js.Array[PhoneNumber]
  type SubscriptionAttributesMap = js.Dictionary[attributeValue]
  type SubscriptionsList = js.Array[Subscription]
  type TopicAttributesMap = js.Dictionary[attributeValue]
  type TopicsList = js.Array[Topic]
  type account = String
  type action = String
  type attributeName = String
  type attributeValue = String
  type authenticateOnUnsubscribe = String
  type boolean = Boolean
  type delegate = String
  type endpoint = String
  type label = String
  type message = String
  type messageId = String
  type messageStructure = String
  type nextToken = String
  type protocol = String
  type string = String
  type subject = String
  type subscriptionARN = String
  type token = String
  type topicARN = String
  type topicName = String
}

package sns {
  @js.native
  trait Sns extends js.Object {
    def addPermission(params: AddPermissionInput, callback: Callback[js.Object]): Unit = js.native
    def addPermission(params: AddPermissionInput): Request[js.Object] = js.native
    def checkIfPhoneNumberIsOptedOut(params: CheckIfPhoneNumberIsOptedOutInput, callback: Callback[CheckIfPhoneNumberIsOptedOutResponse]): Unit = js.native
    def checkIfPhoneNumberIsOptedOut(params: CheckIfPhoneNumberIsOptedOutInput): Request[CheckIfPhoneNumberIsOptedOutResponse] = js.native
    def confirmSubscription(params: ConfirmSubscriptionInput, callback: Callback[ConfirmSubscriptionResponse]): Unit = js.native
    def confirmSubscription(params: ConfirmSubscriptionInput): Request[ConfirmSubscriptionResponse] = js.native
    def createPlatformApplication(params: CreatePlatformApplicationInput, callback: Callback[CreatePlatformApplicationResponse]): Unit = js.native
    def createPlatformApplication(params: CreatePlatformApplicationInput): Request[CreatePlatformApplicationResponse] = js.native
    def createPlatformEndpoint(params: CreatePlatformEndpointInput, callback: Callback[CreateEndpointResponse]): Unit = js.native
    def createPlatformEndpoint(params: CreatePlatformEndpointInput): Request[CreateEndpointResponse] = js.native
    def createTopic(params: CreateTopicInput, callback: Callback[CreateTopicResponse]): Unit = js.native
    def createTopic(params: CreateTopicInput): Request[CreateTopicResponse] = js.native
    def deleteEndpoint(params: DeleteEndpointInput, callback: Callback[js.Object]): Unit = js.native
    def deleteEndpoint(params: DeleteEndpointInput): Request[js.Object] = js.native
    def deletePlatformApplication(params: DeletePlatformApplicationInput, callback: Callback[js.Object]): Unit = js.native
    def deletePlatformApplication(params: DeletePlatformApplicationInput): Request[js.Object] = js.native
    def deleteTopic(params: DeleteTopicInput, callback: Callback[js.Object]): Unit = js.native
    def deleteTopic(params: DeleteTopicInput): Request[js.Object] = js.native
    def getEndpointAttributes(params: GetEndpointAttributesInput, callback: Callback[GetEndpointAttributesResponse]): Unit = js.native
    def getEndpointAttributes(params: GetEndpointAttributesInput): Request[GetEndpointAttributesResponse] = js.native
    def getPlatformApplicationAttributes(params: GetPlatformApplicationAttributesInput, callback: Callback[GetPlatformApplicationAttributesResponse]): Unit = js.native
    def getPlatformApplicationAttributes(params: GetPlatformApplicationAttributesInput): Request[GetPlatformApplicationAttributesResponse] = js.native
    def getSMSAttributes(params: GetSMSAttributesInput, callback: Callback[GetSMSAttributesResponse]): Unit = js.native
    def getSMSAttributes(params: GetSMSAttributesInput): Request[GetSMSAttributesResponse] = js.native
    def getSubscriptionAttributes(params: GetSubscriptionAttributesInput, callback: Callback[GetSubscriptionAttributesResponse]): Unit = js.native
    def getSubscriptionAttributes(params: GetSubscriptionAttributesInput): Request[GetSubscriptionAttributesResponse] = js.native
    def getTopicAttributes(params: GetTopicAttributesInput, callback: Callback[GetTopicAttributesResponse]): Unit = js.native
    def getTopicAttributes(params: GetTopicAttributesInput): Request[GetTopicAttributesResponse] = js.native
    def listEndpointsByPlatformApplication(params: ListEndpointsByPlatformApplicationInput, callback: Callback[ListEndpointsByPlatformApplicationResponse]): Unit = js.native
    def listEndpointsByPlatformApplication(params: ListEndpointsByPlatformApplicationInput): Request[ListEndpointsByPlatformApplicationResponse] = js.native
    def listPhoneNumbersOptedOut(params: ListPhoneNumbersOptedOutInput, callback: Callback[ListPhoneNumbersOptedOutResponse]): Unit = js.native
    def listPhoneNumbersOptedOut(params: ListPhoneNumbersOptedOutInput): Request[ListPhoneNumbersOptedOutResponse] = js.native
    def listPlatformApplications(params: ListPlatformApplicationsInput, callback: Callback[ListPlatformApplicationsResponse]): Unit = js.native
    def listPlatformApplications(params: ListPlatformApplicationsInput): Request[ListPlatformApplicationsResponse] = js.native
    def listSubscriptions(params: ListSubscriptionsInput, callback: Callback[ListSubscriptionsResponse]): Unit = js.native
    def listSubscriptions(params: ListSubscriptionsInput): Request[ListSubscriptionsResponse] = js.native
    def listSubscriptionsByTopic(params: ListSubscriptionsByTopicInput, callback: Callback[ListSubscriptionsByTopicResponse]): Unit = js.native
    def listSubscriptionsByTopic(params: ListSubscriptionsByTopicInput): Request[ListSubscriptionsByTopicResponse] = js.native
    def listTopics(params: ListTopicsInput, callback: Callback[ListTopicsResponse]): Unit = js.native
    def listTopics(params: ListTopicsInput): Request[ListTopicsResponse] = js.native
    def optInPhoneNumber(params: OptInPhoneNumberInput, callback: Callback[OptInPhoneNumberResponse]): Unit = js.native
    def optInPhoneNumber(params: OptInPhoneNumberInput): Request[OptInPhoneNumberResponse] = js.native
    def publish(params: PublishInput, callback: Callback[PublishResponse]): Unit = js.native
    def publish(params: PublishInput): Request[PublishResponse] = js.native
    def removePermission(params: RemovePermissionInput, callback: Callback[js.Object]): Unit = js.native
    def removePermission(params: RemovePermissionInput): Request[js.Object] = js.native
    def setEndpointAttributes(params: SetEndpointAttributesInput, callback: Callback[js.Object]): Unit = js.native
    def setEndpointAttributes(params: SetEndpointAttributesInput): Request[js.Object] = js.native
    def setPlatformApplicationAttributes(params: SetPlatformApplicationAttributesInput, callback: Callback[js.Object]): Unit = js.native
    def setPlatformApplicationAttributes(params: SetPlatformApplicationAttributesInput): Request[js.Object] = js.native
    def setSMSAttributes(params: SetSMSAttributesInput, callback: Callback[SetSMSAttributesResponse]): Unit = js.native
    def setSMSAttributes(params: SetSMSAttributesInput): Request[SetSMSAttributesResponse] = js.native
    def setSubscriptionAttributes(params: SetSubscriptionAttributesInput, callback: Callback[js.Object]): Unit = js.native
    def setSubscriptionAttributes(params: SetSubscriptionAttributesInput): Request[js.Object] = js.native
    def setTopicAttributes(params: SetTopicAttributesInput, callback: Callback[js.Object]): Unit = js.native
    def setTopicAttributes(params: SetTopicAttributesInput): Request[js.Object] = js.native
    def subscribe(params: SubscribeInput, callback: Callback[SubscribeResponse]): Unit = js.native
    def subscribe(params: SubscribeInput): Request[SubscribeResponse] = js.native
    def unsubscribe(params: UnsubscribeInput, callback: Callback[js.Object]): Unit = js.native
    def unsubscribe(params: UnsubscribeInput): Request[js.Object] = js.native
  }

  @js.native
  trait AddPermissionInput extends js.Object {
    var TopicArn: topicARN
    var Label: label
    var AWSAccountId: DelegatesList
    var ActionName: ActionsList
  }

  object AddPermissionInput {
    def apply(
      TopicArn: js.UndefOr[topicARN] = js.undefined,
      Label: js.UndefOr[label] = js.undefined,
      AWSAccountId: js.UndefOr[DelegatesList] = js.undefined,
      ActionName: js.UndefOr[ActionsList] = js.undefined
    ): AddPermissionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TopicArn" -> TopicArn.map { x => x: js.Any }),
        ("Label" -> Label.map { x => x: js.Any }),
        ("AWSAccountId" -> AWSAccountId.map { x => x: js.Any }),
        ("ActionName" -> ActionName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddPermissionInput]
    }
  }

  /**
   * <p>Indicates that the user has been denied access to the requested resource.</p>
   */
  @js.native
  trait AuthorizationErrorExceptionException extends js.Object {
    var message: string
  }

  /**
   * <p>The input for the <code>CheckIfPhoneNumberIsOptedOut</code> action.</p>
   */
  @js.native
  trait CheckIfPhoneNumberIsOptedOutInput extends js.Object {
    var phoneNumber: PhoneNumber
  }

  object CheckIfPhoneNumberIsOptedOutInput {
    def apply(
      phoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): CheckIfPhoneNumberIsOptedOutInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("phoneNumber" -> phoneNumber.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CheckIfPhoneNumberIsOptedOutInput]
    }
  }

  /**
   * <p>The response from the <code>CheckIfPhoneNumberIsOptedOut</code> action.</p>
   */
  @js.native
  trait CheckIfPhoneNumberIsOptedOutResponse extends js.Object {
    var isOptedOut: boolean
  }

  object CheckIfPhoneNumberIsOptedOutResponse {
    def apply(
      isOptedOut: js.UndefOr[boolean] = js.undefined
    ): CheckIfPhoneNumberIsOptedOutResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("isOptedOut" -> isOptedOut.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CheckIfPhoneNumberIsOptedOutResponse]
    }
  }

  /**
   * <p>Input for ConfirmSubscription action.</p>
   */
  @js.native
  trait ConfirmSubscriptionInput extends js.Object {
    var TopicArn: topicARN
    var Token: token
    var AuthenticateOnUnsubscribe: authenticateOnUnsubscribe
  }

  object ConfirmSubscriptionInput {
    def apply(
      TopicArn: js.UndefOr[topicARN] = js.undefined,
      Token: js.UndefOr[token] = js.undefined,
      AuthenticateOnUnsubscribe: js.UndefOr[authenticateOnUnsubscribe] = js.undefined
    ): ConfirmSubscriptionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TopicArn" -> TopicArn.map { x => x: js.Any }),
        ("Token" -> Token.map { x => x: js.Any }),
        ("AuthenticateOnUnsubscribe" -> AuthenticateOnUnsubscribe.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmSubscriptionInput]
    }
  }

  /**
   * <p>Response for ConfirmSubscriptions action.</p>
   */
  @js.native
  trait ConfirmSubscriptionResponse extends js.Object {
    var SubscriptionArn: subscriptionARN
  }

  object ConfirmSubscriptionResponse {
    def apply(
      SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
    ): ConfirmSubscriptionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubscriptionArn" -> SubscriptionArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfirmSubscriptionResponse]
    }
  }

  /**
   * <p>Response from CreateEndpoint action.</p>
   */
  @js.native
  trait CreateEndpointResponse extends js.Object {
    var EndpointArn: String
  }

  object CreateEndpointResponse {
    def apply(
      EndpointArn: js.UndefOr[String] = js.undefined
    ): CreateEndpointResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EndpointArn" -> EndpointArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEndpointResponse]
    }
  }

  /**
   * <p>Input for CreatePlatformApplication action.</p>
   */
  @js.native
  trait CreatePlatformApplicationInput extends js.Object {
    var Name: String
    var Platform: String
    var Attributes: MapStringToString
  }

  object CreatePlatformApplicationInput {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Platform: js.UndefOr[String] = js.undefined,
      Attributes: js.UndefOr[MapStringToString] = js.undefined
    ): CreatePlatformApplicationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Platform" -> Platform.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlatformApplicationInput]
    }
  }

  /**
   * <p>Response from CreatePlatformApplication action.</p>
   */
  @js.native
  trait CreatePlatformApplicationResponse extends js.Object {
    var PlatformApplicationArn: String
  }

  object CreatePlatformApplicationResponse {
    def apply(
      PlatformApplicationArn: js.UndefOr[String] = js.undefined
    ): CreatePlatformApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PlatformApplicationArn" -> PlatformApplicationArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlatformApplicationResponse]
    }
  }

  /**
   * <p>Input for CreatePlatformEndpoint action.</p>
   */
  @js.native
  trait CreatePlatformEndpointInput extends js.Object {
    var PlatformApplicationArn: String
    var Token: String
    var CustomUserData: String
    var Attributes: MapStringToString
  }

  object CreatePlatformEndpointInput {
    def apply(
      PlatformApplicationArn: js.UndefOr[String] = js.undefined,
      Token: js.UndefOr[String] = js.undefined,
      CustomUserData: js.UndefOr[String] = js.undefined,
      Attributes: js.UndefOr[MapStringToString] = js.undefined
    ): CreatePlatformEndpointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PlatformApplicationArn" -> PlatformApplicationArn.map { x => x: js.Any }),
        ("Token" -> Token.map { x => x: js.Any }),
        ("CustomUserData" -> CustomUserData.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlatformEndpointInput]
    }
  }

  /**
   * <p>Input for CreateTopic action.</p>
   */
  @js.native
  trait CreateTopicInput extends js.Object {
    var Name: topicName
  }

  object CreateTopicInput {
    def apply(
      Name: js.UndefOr[topicName] = js.undefined
    ): CreateTopicInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTopicInput]
    }
  }

  /**
   * <p>Response from CreateTopic action.</p>
   */
  @js.native
  trait CreateTopicResponse extends js.Object {
    var TopicArn: topicARN
  }

  object CreateTopicResponse {
    def apply(
      TopicArn: js.UndefOr[topicARN] = js.undefined
    ): CreateTopicResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TopicArn" -> TopicArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTopicResponse]
    }
  }

  /**
   * <p>Input for DeleteEndpoint action.</p>
   */
  @js.native
  trait DeleteEndpointInput extends js.Object {
    var EndpointArn: String
  }

  object DeleteEndpointInput {
    def apply(
      EndpointArn: js.UndefOr[String] = js.undefined
    ): DeleteEndpointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EndpointArn" -> EndpointArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEndpointInput]
    }
  }

  /**
   * <p>Input for DeletePlatformApplication action.</p>
   */
  @js.native
  trait DeletePlatformApplicationInput extends js.Object {
    var PlatformApplicationArn: String
  }

  object DeletePlatformApplicationInput {
    def apply(
      PlatformApplicationArn: js.UndefOr[String] = js.undefined
    ): DeletePlatformApplicationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PlatformApplicationArn" -> PlatformApplicationArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePlatformApplicationInput]
    }
  }

  @js.native
  trait DeleteTopicInput extends js.Object {
    var TopicArn: topicARN
  }

  object DeleteTopicInput {
    def apply(
      TopicArn: js.UndefOr[topicARN] = js.undefined
    ): DeleteTopicInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TopicArn" -> TopicArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTopicInput]
    }
  }

  /**
   * <p>Endpoint for mobile app and device.</p>
   */
  @js.native
  trait Endpoint extends js.Object {
    var EndpointArn: String
    var Attributes: MapStringToString
  }

  object Endpoint {
    def apply(
      EndpointArn: js.UndefOr[String] = js.undefined,
      Attributes: js.UndefOr[MapStringToString] = js.undefined
    ): Endpoint = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EndpointArn" -> EndpointArn.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Endpoint]
    }
  }

  /**
   * <p>Exception error indicating endpoint disabled.</p>
   */
  @js.native
  trait EndpointDisabledExceptionException extends js.Object {
    var message: string
  }

  /**
   * <p>Input for GetEndpointAttributes action.</p>
   */
  @js.native
  trait GetEndpointAttributesInput extends js.Object {
    var EndpointArn: String
  }

  object GetEndpointAttributesInput {
    def apply(
      EndpointArn: js.UndefOr[String] = js.undefined
    ): GetEndpointAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EndpointArn" -> EndpointArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEndpointAttributesInput]
    }
  }

  /**
   * <p>Response from GetEndpointAttributes of the EndpointArn.</p>
   */
  @js.native
  trait GetEndpointAttributesResponse extends js.Object {
    var Attributes: MapStringToString
  }

  object GetEndpointAttributesResponse {
    def apply(
      Attributes: js.UndefOr[MapStringToString] = js.undefined
    ): GetEndpointAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEndpointAttributesResponse]
    }
  }

  /**
   * <p>Input for GetPlatformApplicationAttributes action.</p>
   */
  @js.native
  trait GetPlatformApplicationAttributesInput extends js.Object {
    var PlatformApplicationArn: String
  }

  object GetPlatformApplicationAttributesInput {
    def apply(
      PlatformApplicationArn: js.UndefOr[String] = js.undefined
    ): GetPlatformApplicationAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PlatformApplicationArn" -> PlatformApplicationArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPlatformApplicationAttributesInput]
    }
  }

  /**
   * <p>Response for GetPlatformApplicationAttributes action.</p>
   */
  @js.native
  trait GetPlatformApplicationAttributesResponse extends js.Object {
    var Attributes: MapStringToString
  }

  object GetPlatformApplicationAttributesResponse {
    def apply(
      Attributes: js.UndefOr[MapStringToString] = js.undefined
    ): GetPlatformApplicationAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPlatformApplicationAttributesResponse]
    }
  }

  /**
   * <p>The input for the <code>GetSMSAttributes</code> request.</p>
   */
  @js.native
  trait GetSMSAttributesInput extends js.Object {
    var attributes: ListString
  }

  object GetSMSAttributesInput {
    def apply(
      attributes: js.UndefOr[ListString] = js.undefined
    ): GetSMSAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("attributes" -> attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSMSAttributesInput]
    }
  }

  /**
   * <p>The response from the <code>GetSMSAttributes</code> request.</p>
   */
  @js.native
  trait GetSMSAttributesResponse extends js.Object {
    var attributes: MapStringToString
  }

  object GetSMSAttributesResponse {
    def apply(
      attributes: js.UndefOr[MapStringToString] = js.undefined
    ): GetSMSAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("attributes" -> attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSMSAttributesResponse]
    }
  }

  /**
   * <p>Input for GetSubscriptionAttributes.</p>
   */
  @js.native
  trait GetSubscriptionAttributesInput extends js.Object {
    var SubscriptionArn: subscriptionARN
  }

  object GetSubscriptionAttributesInput {
    def apply(
      SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
    ): GetSubscriptionAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubscriptionArn" -> SubscriptionArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSubscriptionAttributesInput]
    }
  }

  /**
   * <p>Response for GetSubscriptionAttributes action.</p>
   */
  @js.native
  trait GetSubscriptionAttributesResponse extends js.Object {
    var Attributes: SubscriptionAttributesMap
  }

  object GetSubscriptionAttributesResponse {
    def apply(
      Attributes: js.UndefOr[SubscriptionAttributesMap] = js.undefined
    ): GetSubscriptionAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSubscriptionAttributesResponse]
    }
  }

  /**
   * <p>Input for GetTopicAttributes action.</p>
   */
  @js.native
  trait GetTopicAttributesInput extends js.Object {
    var TopicArn: topicARN
  }

  object GetTopicAttributesInput {
    def apply(
      TopicArn: js.UndefOr[topicARN] = js.undefined
    ): GetTopicAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TopicArn" -> TopicArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTopicAttributesInput]
    }
  }

  /**
   * <p>Response for GetTopicAttributes action.</p>
   */
  @js.native
  trait GetTopicAttributesResponse extends js.Object {
    var Attributes: TopicAttributesMap
  }

  object GetTopicAttributesResponse {
    def apply(
      Attributes: js.UndefOr[TopicAttributesMap] = js.undefined
    ): GetTopicAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTopicAttributesResponse]
    }
  }

  /**
   * <p>Indicates an internal service error.</p>
   */
  @js.native
  trait InternalErrorExceptionException extends js.Object {
    var message: string
  }

  /**
   * <p>Indicates that a request parameter does not comply with the associated constraints.</p>
   */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    var message: string
  }

  /**
   * <p>Indicates that a request parameter does not comply with the associated constraints.</p>
   */
  @js.native
  trait InvalidParameterValueExceptionException extends js.Object {
    var message: string
  }

  /**
   * <p>Input for ListEndpointsByPlatformApplication action.</p>
   */
  @js.native
  trait ListEndpointsByPlatformApplicationInput extends js.Object {
    var PlatformApplicationArn: String
    var NextToken: String
  }

  object ListEndpointsByPlatformApplicationInput {
    def apply(
      PlatformApplicationArn: js.UndefOr[String] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): ListEndpointsByPlatformApplicationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PlatformApplicationArn" -> PlatformApplicationArn.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEndpointsByPlatformApplicationInput]
    }
  }

  /**
   * <p>Response for ListEndpointsByPlatformApplication action.</p>
   */
  @js.native
  trait ListEndpointsByPlatformApplicationResponse extends js.Object {
    var Endpoints: ListOfEndpoints
    var NextToken: String
  }

  object ListEndpointsByPlatformApplicationResponse {
    def apply(
      Endpoints: js.UndefOr[ListOfEndpoints] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): ListEndpointsByPlatformApplicationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Endpoints" -> Endpoints.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEndpointsByPlatformApplicationResponse]
    }
  }

  /**
   * <p>The input for the <code>ListPhoneNumbersOptedOut</code> action.</p>
   */
  @js.native
  trait ListPhoneNumbersOptedOutInput extends js.Object {
    var nextToken: string
  }

  object ListPhoneNumbersOptedOutInput {
    def apply(
      nextToken: js.UndefOr[string] = js.undefined
    ): ListPhoneNumbersOptedOutInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPhoneNumbersOptedOutInput]
    }
  }

  /**
   * <p>The response from the <code>ListPhoneNumbersOptedOut</code> action.</p>
   */
  @js.native
  trait ListPhoneNumbersOptedOutResponse extends js.Object {
    var phoneNumbers: PhoneNumberList
    var nextToken: string
  }

  object ListPhoneNumbersOptedOutResponse {
    def apply(
      phoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined,
      nextToken: js.UndefOr[string] = js.undefined
    ): ListPhoneNumbersOptedOutResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("phoneNumbers" -> phoneNumbers.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPhoneNumbersOptedOutResponse]
    }
  }

  /**
   * <p>Input for ListPlatformApplications action.</p>
   */
  @js.native
  trait ListPlatformApplicationsInput extends js.Object {
    var NextToken: String
  }

  object ListPlatformApplicationsInput {
    def apply(
      NextToken: js.UndefOr[String] = js.undefined
    ): ListPlatformApplicationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPlatformApplicationsInput]
    }
  }

  /**
   * <p>Response for ListPlatformApplications action.</p>
   */
  @js.native
  trait ListPlatformApplicationsResponse extends js.Object {
    var PlatformApplications: ListOfPlatformApplications
    var NextToken: String
  }

  object ListPlatformApplicationsResponse {
    def apply(
      PlatformApplications: js.UndefOr[ListOfPlatformApplications] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): ListPlatformApplicationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PlatformApplications" -> PlatformApplications.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPlatformApplicationsResponse]
    }
  }

  /**
   * <p>Input for ListSubscriptionsByTopic action.</p>
   */
  @js.native
  trait ListSubscriptionsByTopicInput extends js.Object {
    var TopicArn: topicARN
    var NextToken: nextToken
  }

  object ListSubscriptionsByTopicInput {
    def apply(
      TopicArn: js.UndefOr[topicARN] = js.undefined,
      NextToken: js.UndefOr[nextToken] = js.undefined
    ): ListSubscriptionsByTopicInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TopicArn" -> TopicArn.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSubscriptionsByTopicInput]
    }
  }

  /**
   * <p>Response for ListSubscriptionsByTopic action.</p>
   */
  @js.native
  trait ListSubscriptionsByTopicResponse extends js.Object {
    var Subscriptions: SubscriptionsList
    var NextToken: nextToken
  }

  object ListSubscriptionsByTopicResponse {
    def apply(
      Subscriptions: js.UndefOr[SubscriptionsList] = js.undefined,
      NextToken: js.UndefOr[nextToken] = js.undefined
    ): ListSubscriptionsByTopicResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Subscriptions" -> Subscriptions.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSubscriptionsByTopicResponse]
    }
  }

  /**
   * <p>Input for ListSubscriptions action.</p>
   */
  @js.native
  trait ListSubscriptionsInput extends js.Object {
    var NextToken: nextToken
  }

  object ListSubscriptionsInput {
    def apply(
      NextToken: js.UndefOr[nextToken] = js.undefined
    ): ListSubscriptionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSubscriptionsInput]
    }
  }

  /**
   * <p>Response for ListSubscriptions action</p>
   */
  @js.native
  trait ListSubscriptionsResponse extends js.Object {
    var Subscriptions: SubscriptionsList
    var NextToken: nextToken
  }

  object ListSubscriptionsResponse {
    def apply(
      Subscriptions: js.UndefOr[SubscriptionsList] = js.undefined,
      NextToken: js.UndefOr[nextToken] = js.undefined
    ): ListSubscriptionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Subscriptions" -> Subscriptions.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSubscriptionsResponse]
    }
  }

  @js.native
  trait ListTopicsInput extends js.Object {
    var NextToken: nextToken
  }

  object ListTopicsInput {
    def apply(
      NextToken: js.UndefOr[nextToken] = js.undefined
    ): ListTopicsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTopicsInput]
    }
  }

  /**
   * <p>Response for ListTopics action.</p>
   */
  @js.native
  trait ListTopicsResponse extends js.Object {
    var Topics: TopicsList
    var NextToken: nextToken
  }

  object ListTopicsResponse {
    def apply(
      Topics: js.UndefOr[TopicsList] = js.undefined,
      NextToken: js.UndefOr[nextToken] = js.undefined
    ): ListTopicsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Topics" -> Topics.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTopicsResponse]
    }
  }

  /**
   * <p>The user-specified message attribute value. For string data types, the value attribute has the same restrictions on the content as the message body. For more information, see <a href="http://docs.aws.amazon.com/sns/latest/api/API_Publish.html">Publish</a>.</p> <p>Name, type, and value must not be empty or null. In addition, the message body should not be empty or null. All parts of the message attribute, including name, type, and value, are included in the message size restriction, which is currently 256 KB (262,144 bytes). For more information, see <a href="http://docs.aws.amazon.com/sns/latest/dg/SNSMessageAttributes.html">Using Amazon SNS Message Attributes</a>.</p>
   */
  @js.native
  trait MessageAttributeValue extends js.Object {
    var DataType: String
    var StringValue: String
    var BinaryValue: Binary
  }

  object MessageAttributeValue {
    def apply(
      DataType: js.UndefOr[String] = js.undefined,
      StringValue: js.UndefOr[String] = js.undefined,
      BinaryValue: js.UndefOr[Binary] = js.undefined
    ): MessageAttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DataType" -> DataType.map { x => x: js.Any }),
        ("StringValue" -> StringValue.map { x => x: js.Any }),
        ("BinaryValue" -> BinaryValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MessageAttributeValue]
    }
  }

  /**
   * <p>Indicates that the requested resource does not exist.</p>
   */
  @js.native
  trait NotFoundExceptionException extends js.Object {
    var message: string
  }

  /**
   * <p>Input for the OptInPhoneNumber action.</p>
   */
  @js.native
  trait OptInPhoneNumberInput extends js.Object {
    var phoneNumber: PhoneNumber
  }

  object OptInPhoneNumberInput {
    def apply(
      phoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): OptInPhoneNumberInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("phoneNumber" -> phoneNumber.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptInPhoneNumberInput]
    }
  }

  /**
   * <p>The response for the OptInPhoneNumber action.</p>
   */
  @js.native
  trait OptInPhoneNumberResponse extends js.Object {

  }

  object OptInPhoneNumberResponse {
    def apply(

    ): OptInPhoneNumberResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptInPhoneNumberResponse]
    }
  }

  /**
   * <p>Platform application object.</p>
   */
  @js.native
  trait PlatformApplication extends js.Object {
    var PlatformApplicationArn: String
    var Attributes: MapStringToString
  }

  object PlatformApplication {
    def apply(
      PlatformApplicationArn: js.UndefOr[String] = js.undefined,
      Attributes: js.UndefOr[MapStringToString] = js.undefined
    ): PlatformApplication = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PlatformApplicationArn" -> PlatformApplicationArn.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlatformApplication]
    }
  }

  /**
   * <p>Exception error indicating platform application disabled.</p>
   */
  @js.native
  trait PlatformApplicationDisabledExceptionException extends js.Object {
    var message: string
  }

  /**
   * <p>Input for Publish action.</p>
   */
  @js.native
  trait PublishInput extends js.Object {
    var Subject: subject
    var MessageStructure: messageStructure
    var PhoneNumber: String
    var MessageAttributes: MessageAttributeMap
    var Message: message
    var TargetArn: String
    var TopicArn: topicARN
  }

  object PublishInput {
    def apply(
      Subject: js.UndefOr[subject] = js.undefined,
      MessageStructure: js.UndefOr[messageStructure] = js.undefined,
      PhoneNumber: js.UndefOr[String] = js.undefined,
      MessageAttributes: js.UndefOr[MessageAttributeMap] = js.undefined,
      Message: js.UndefOr[message] = js.undefined,
      TargetArn: js.UndefOr[String] = js.undefined,
      TopicArn: js.UndefOr[topicARN] = js.undefined
    ): PublishInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Subject" -> Subject.map { x => x: js.Any }),
        ("MessageStructure" -> MessageStructure.map { x => x: js.Any }),
        ("PhoneNumber" -> PhoneNumber.map { x => x: js.Any }),
        ("MessageAttributes" -> MessageAttributes.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("TargetArn" -> TargetArn.map { x => x: js.Any }),
        ("TopicArn" -> TopicArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublishInput]
    }
  }

  /**
   * <p>Response for Publish action.</p>
   */
  @js.native
  trait PublishResponse extends js.Object {
    var MessageId: messageId
  }

  object PublishResponse {
    def apply(
      MessageId: js.UndefOr[messageId] = js.undefined
    ): PublishResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MessageId" -> MessageId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublishResponse]
    }
  }

  /**
   * <p>Input for RemovePermission action.</p>
   */
  @js.native
  trait RemovePermissionInput extends js.Object {
    var TopicArn: topicARN
    var Label: label
  }

  object RemovePermissionInput {
    def apply(
      TopicArn: js.UndefOr[topicARN] = js.undefined,
      Label: js.UndefOr[label] = js.undefined
    ): RemovePermissionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TopicArn" -> TopicArn.map { x => x: js.Any }),
        ("Label" -> Label.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemovePermissionInput]
    }
  }

  /**
   * <p>Input for SetEndpointAttributes action.</p>
   */
  @js.native
  trait SetEndpointAttributesInput extends js.Object {
    var EndpointArn: String
    var Attributes: MapStringToString
  }

  object SetEndpointAttributesInput {
    def apply(
      EndpointArn: js.UndefOr[String] = js.undefined,
      Attributes: js.UndefOr[MapStringToString] = js.undefined
    ): SetEndpointAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EndpointArn" -> EndpointArn.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetEndpointAttributesInput]
    }
  }

  /**
   * <p>Input for SetPlatformApplicationAttributes action.</p>
   */
  @js.native
  trait SetPlatformApplicationAttributesInput extends js.Object {
    var PlatformApplicationArn: String
    var Attributes: MapStringToString
  }

  object SetPlatformApplicationAttributesInput {
    def apply(
      PlatformApplicationArn: js.UndefOr[String] = js.undefined,
      Attributes: js.UndefOr[MapStringToString] = js.undefined
    ): SetPlatformApplicationAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PlatformApplicationArn" -> PlatformApplicationArn.map { x => x: js.Any }),
        ("Attributes" -> Attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetPlatformApplicationAttributesInput]
    }
  }

  /**
   * <p>The input for the SetSMSAttributes action.</p>
   */
  @js.native
  trait SetSMSAttributesInput extends js.Object {
    var attributes: MapStringToString
  }

  object SetSMSAttributesInput {
    def apply(
      attributes: js.UndefOr[MapStringToString] = js.undefined
    ): SetSMSAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("attributes" -> attributes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetSMSAttributesInput]
    }
  }

  /**
   * <p>The response for the SetSMSAttributes action.</p>
   */
  @js.native
  trait SetSMSAttributesResponse extends js.Object {

  }

  object SetSMSAttributesResponse {
    def apply(

    ): SetSMSAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetSMSAttributesResponse]
    }
  }

  /**
   * <p>Input for SetSubscriptionAttributes action.</p>
   */
  @js.native
  trait SetSubscriptionAttributesInput extends js.Object {
    var SubscriptionArn: subscriptionARN
    var AttributeName: attributeName
    var AttributeValue: attributeValue
  }

  object SetSubscriptionAttributesInput {
    def apply(
      SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined,
      AttributeName: js.UndefOr[attributeName] = js.undefined,
      AttributeValue: js.UndefOr[attributeValue] = js.undefined
    ): SetSubscriptionAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubscriptionArn" -> SubscriptionArn.map { x => x: js.Any }),
        ("AttributeName" -> AttributeName.map { x => x: js.Any }),
        ("AttributeValue" -> AttributeValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetSubscriptionAttributesInput]
    }
  }

  /**
   * <p>Input for SetTopicAttributes action.</p>
   */
  @js.native
  trait SetTopicAttributesInput extends js.Object {
    var TopicArn: topicARN
    var AttributeName: attributeName
    var AttributeValue: attributeValue
  }

  object SetTopicAttributesInput {
    def apply(
      TopicArn: js.UndefOr[topicARN] = js.undefined,
      AttributeName: js.UndefOr[attributeName] = js.undefined,
      AttributeValue: js.UndefOr[attributeValue] = js.undefined
    ): SetTopicAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TopicArn" -> TopicArn.map { x => x: js.Any }),
        ("AttributeName" -> AttributeName.map { x => x: js.Any }),
        ("AttributeValue" -> AttributeValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetTopicAttributesInput]
    }
  }

  /**
   * <p>Input for Subscribe action.</p>
   */
  @js.native
  trait SubscribeInput extends js.Object {
    var TopicArn: topicARN
    var Protocol: protocol
    var Endpoint: endpoint
  }

  object SubscribeInput {
    def apply(
      TopicArn: js.UndefOr[topicARN] = js.undefined,
      Protocol: js.UndefOr[protocol] = js.undefined,
      Endpoint: js.UndefOr[endpoint] = js.undefined
    ): SubscribeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TopicArn" -> TopicArn.map { x => x: js.Any }),
        ("Protocol" -> Protocol.map { x => x: js.Any }),
        ("Endpoint" -> Endpoint.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribeInput]
    }
  }

  /**
   * <p>Response for Subscribe action.</p>
   */
  @js.native
  trait SubscribeResponse extends js.Object {
    var SubscriptionArn: subscriptionARN
  }

  object SubscribeResponse {
    def apply(
      SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
    ): SubscribeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubscriptionArn" -> SubscriptionArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscribeResponse]
    }
  }

  /**
   * <p>A wrapper type for the attributes of an Amazon SNS subscription.</p>
   */
  @js.native
  trait Subscription extends js.Object {
    var SubscriptionArn: subscriptionARN
    var Endpoint: endpoint
    var Protocol: protocol
    var Owner: account
    var TopicArn: topicARN
  }

  object Subscription {
    def apply(
      SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined,
      Endpoint: js.UndefOr[endpoint] = js.undefined,
      Protocol: js.UndefOr[protocol] = js.undefined,
      Owner: js.UndefOr[account] = js.undefined,
      TopicArn: js.UndefOr[topicARN] = js.undefined
    ): Subscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubscriptionArn" -> SubscriptionArn.map { x => x: js.Any }),
        ("Endpoint" -> Endpoint.map { x => x: js.Any }),
        ("Protocol" -> Protocol.map { x => x: js.Any }),
        ("Owner" -> Owner.map { x => x: js.Any }),
        ("TopicArn" -> TopicArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subscription]
    }
  }

  /**
   * <p>Indicates that the customer already owns the maximum allowed number of subscriptions.</p>
   */
  @js.native
  trait SubscriptionLimitExceededExceptionException extends js.Object {
    var message: string
  }

  /**
   * <p>Indicates that the rate at which requests have been submitted for this action exceeds the limit for your account.</p>
   */
  @js.native
  trait ThrottledExceptionException extends js.Object {
    var message: string
  }

  /**
   * <p>A wrapper type for the topic's Amazon Resource Name (ARN). To retrieve a topic's attributes, use <code>GetTopicAttributes</code>.</p>
   */
  @js.native
  trait Topic extends js.Object {
    var TopicArn: topicARN
  }

  object Topic {
    def apply(
      TopicArn: js.UndefOr[topicARN] = js.undefined
    ): Topic = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TopicArn" -> TopicArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Topic]
    }
  }

  /**
   * <p>Indicates that the customer already owns the maximum allowed number of topics.</p>
   */
  @js.native
  trait TopicLimitExceededExceptionException extends js.Object {
    var message: string
  }

  /**
   * <p>Input for Unsubscribe action.</p>
   */
  @js.native
  trait UnsubscribeInput extends js.Object {
    var SubscriptionArn: subscriptionARN
  }

  object UnsubscribeInput {
    def apply(
      SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
    ): UnsubscribeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SubscriptionArn" -> SubscriptionArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnsubscribeInput]
    }
  }
}
