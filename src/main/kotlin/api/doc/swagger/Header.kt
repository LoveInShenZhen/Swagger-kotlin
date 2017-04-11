package api.doc.swagger

/**
 * Created by kk on 17/4/6.
 */
class Header {

    var description: String? = null

    // Required. The type of the object. The value MUST be one of "string", "number", "integer", "boolean", or "array".
    var type: String = ""

    // The extending format for the previously mentioned type. See Data Type Formats for further details.
    var format: String? = null

    // Required if type is "array". Describes the type of items in the array.
    var items: Items? = null

    // Determines the format of the array if type array is used. Possible values are:
    // csv - comma separated values foo,bar.
    // ssv - space separated values foo bar.
    // tsv - tab separated values foo\tbar.
    // pipes - pipe separated values foo|bar.
    // Default value is csv.
    var collectionFormat: String = "csv"

    // Declares the value of the header that the server will use if none is provided.
    // (Note: "default" has no meaning for required headers.)
    // See https://tools.ietf.org/html/draft-fge-json-schema-validation-00#section-6.2.
    // Unlike JSON Schema this value MUST conform to the defined type for the header.
    var default: Any? = null

    var maximum: Number? = null

    var exclusiveMaximum: Boolean? = null

    var minimum: Number? = null

    var exclusiveMinimum: Boolean? = null

    var maxLength: Int? = null

    var minLength: Int? = null

    var pattern: String? = null

    var maxItems: Int? = null

    var minItems: Int? = null

    var uniqueItems: Boolean? = null

    var enum: List<Any>? = null

    var multipleOf: Number? = null
}