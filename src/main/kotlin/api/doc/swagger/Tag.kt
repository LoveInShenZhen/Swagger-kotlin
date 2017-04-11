package api.doc.swagger

/**
 * Created by kk on 17/4/5.
 */
class Tag {

    // Required. The name of the tag.
    var name:String = ""

    // A short description for the tag. GFM syntax can be used for rich text representation.
    var description:String? = null

    // Additional external documentation for this tag.
    var externalDocs:ExternalDocumentation? = null

}