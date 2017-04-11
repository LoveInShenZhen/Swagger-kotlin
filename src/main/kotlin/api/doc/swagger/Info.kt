package api.doc.swagger

/**
 * Created by kk on 17/4/5.
 */
class Info {

    // Required. The title of the application.
    var title: String = ""

    // A short description of the application. GFM syntax can be used for rich text representation.
    var description: String? = null

    // The Terms of Service for the API.
    var termsOfService: String? = null

    // The contact information for the exposed API.
    var contact: Contact? = null

    // The license information for the exposed API.
    var license: License? = null

    // Required Provides the version of the application API (not to be confused with the specification version).
    var version: String = ""
}