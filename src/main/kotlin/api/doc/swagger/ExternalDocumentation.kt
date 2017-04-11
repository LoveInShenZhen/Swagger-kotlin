package api.doc.swagger

/**
 * Created by kk on 17/4/5.
 */
class ExternalDocumentation {

    // A short description of the target documentation. GFM syntax can be used for rich text representation.
    var description: String? = null

    // Required. The URL for the target documentation. Value MUST be in the format of a URL.
    var url: String = ""
}