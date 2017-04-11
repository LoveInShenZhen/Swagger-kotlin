package api.doc.swagger

/**
 * Created by kk on 17/4/6.
 */
class Response {

    // Required. A short description of the response. GFM syntax can be used for rich text representation.
    var description: String = ""

    // A definition of the response structure. It can be a primitive, an array or an object.
    // If this field does not exist, it means no content is returned as part of the response.
    // As an extension to the Schema Object, its root type value may also be "file".
    // This SHOULD be accompanied by a relevant produces mime-type.
    var schema: Schema? = null

    // A list of headers that are sent with the response.
    var headers: Headers? = null

    // An example of the response message.
    var examples: Example? = null
}