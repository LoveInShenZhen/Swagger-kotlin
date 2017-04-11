package api.doc.swagger

/**
 * Created by kk on 17/4/5.
 */
class Items {

    // Required. The internal type of the array.
    // The value MUST be one of "string", "number", "integer", "boolean", or "array". Files and models are not allowed.
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

    var default:Any? = null

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