package api.doc.swagger

/**
 * Created by kk on 17/4/7.
 */
class SecurityScheme {

    // Required. The type of the security scheme. Valid values are "basic", "apiKey" or "oauth2".
    var type:String = ""

    // 	A short description for security scheme.
    var description:String? = null

    // Required. The name of the header or query parameter to be used.
    var name:String = ""

    // Required The location of the API key. Valid values are "query" or "header".
    var `in`:String = ""

    // Required. The flow used by the OAuth2 security scheme. Valid values are "implicit", "password", "application" or "accessCode".
    var flow:String = ""

    // Required. The authorization URL to be used for this flow. This SHOULD be in the form of a URL.
    var authorizationUrl:String = ""

    // Required. The token URL to be used for this flow. This SHOULD be in the form of a URL.
    var tokenUrl:String = ""

    // Required. The available scopes for the OAuth2 security scheme.
    var Scopes:Map<String, String>? = null
}