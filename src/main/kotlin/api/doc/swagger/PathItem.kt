package api.doc.swagger

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by kk on 17/4/5.
 */
class PathItem {

    // Allows for an external definition of this path item. The referenced structure MUST be in the format of a
    // Path Item Object. If there are conflicts between the referenced definition and this Path Item's definition,
    // the behavior is undefined.
    @JsonProperty("${'$'}ref")
    var ref: String? = null

    // A definition of a GET operation on this path.
    var get: Operation? = null

    // A definition of a PUT operation on this path.
    var put: Operation? = null

    // 	A definition of a POST operation on this path.
    var post: Operation? = null

    // A definition of a DELETE operation on this path.
    var delete: Operation? = null

    // A definition of a OPTIONS operation on this path.
    var options: Operation? = null

    // A definition of a HEAD operation on this path.
    var head: Operation? = null

    // A definition of a PATCH operation on this path.
    var patch: Operation? = null

    // A list of parameters that are applicable for all the operations described under this path.
    // These parameters can be overridden at the operation level, but cannot be removed there.
    // The list MUST NOT include duplicated parameters. A unique parameter is defined by a combination of a name and location.
    // The list can use the Reference Object to link to parameters that are defined at the Swagger Object's parameters.
    // There can be one "body" parameter at most.
    var parameters: MutableList<Any> = mutableListOf()

    fun AddParameter(parameter: Parameter): PathItem {
        // TODO:
        this.parameters.add(parameter)
        return this
    }

    fun AddParameter(reference: Reference): PathItem {
        // TODO:
        this.parameters.add(reference)
        return this
    }
}