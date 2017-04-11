package api.doc.swagger

/**
 * Created by kk on 17/4/5.
 */
class Operation {

    // A list of tags for API documentation control.
    // Tags can be used for logical grouping of operations by resources or any other qualifier.
    var tags: MutableList<String> = mutableListOf()

    // A short summary of what the operation does. For maximum readability in the swagger-ui,
    // this field SHOULD be less than 120 characters.
    var summary: String? = null

    // A verbose explanation of the operation behavior. GFM syntax can be used for rich text representation.
    var description: String? = null

    // Additional external documentation for this operation.
    var externalDocs: ExternalDocumentation? = null

    // Unique string used to identify the operation. The id MUST be unique among all operations described in the API.
    // Tools and libraries MAY use the operationId to uniquely identify an operation, therefore,
    // it is recommended to follow common programming naming conventions.
    var operationId: String = ""

    // A list of MIME types the operation can consume. This overrides the consumes definition at the Swagger Object.
    // An empty value MAY be used to clear the global definition. Value MUST be as described under Mime Types.
    var consumes: MutableSet<String> = mutableSetOf()

    // A list of MIME types the operation can produce. This overrides the produces definition at the Swagger Object.
    // An empty value MAY be used to clear the global definition. Value MUST be as described under Mime Types.
    var produces: MutableSet<String> = mutableSetOf()

    // A list of parameters that are applicable for this operation. If a parameter is already defined at the Path Item,
    // the new definition will override it, but can never remove it. The list MUST NOT include duplicated parameters.
    // A unique parameter is defined by a combination of a name and location. The list can use the Reference Object to
    // link to parameters that are defined at the Swagger Object's parameters. There can be one "body" parameter at most.
    var parameters: MutableList<Any> = mutableListOf()

    // Required. The list of possible responses as they are returned from executing this operation.
    var responses: Responses = Responses()

    // The transfer protocol for the operation. Values MUST be from the list: "http", "https", "ws", "wss".
    // The value overrides the Swagger Object schemes definition.
    var schemes: MutableSet<String> = mutableSetOf()

    // Declares this operation to be deprecated. Usage of the declared operation should be refrained.
    // Default value is false.
    var deprecated: Boolean = false

    // A declaration of which security schemes are applied for this operation.
    // The list of values describes alternative security schemes that can be used
    // (that is, there is a logical OR between the security requirements).
    // This definition overrides any declared top-level security.
    // To remove a top-level security declaration, an empty array can be used.
    var security: SecurityRequirement? = null

    fun AddParameter(parameter: Parameter): Operation {
        // TODO:
        this.parameters.add(parameter)
        return this
    }

    fun AddParameter(reference: Reference): Operation {
        // TODO:
        this.parameters.add(reference)
        return this
    }
}