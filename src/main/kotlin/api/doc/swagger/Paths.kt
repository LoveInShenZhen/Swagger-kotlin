package api.doc.swagger

/**
 * Created by kk on 17/4/5.
 */

// TODO: 实现自定义的Json序列化器

//@JsonSerialize
class Paths {

    // A relative path to an individual endpoint. The field name MUST begin with a slash.
    // The path is appended to the basePath in order to construct the full URL. Path templating is allowed.
    // example:
    //
    // {
    //   "/pets": {
    //     "get": {
    //       "description": "Returns all pets from the system that the user has access to",
    //       "produces": [
    //         "application/json"
    //       ],
    //       "responses": {
    //         "200": {
    //           "description": "A list of pets.",
    //           "schema": {
    //             "type": "array",
    //             "items": {
    //               "$ref": "#/definitions/pet"
    //             }
    //           }
    //         }
    //       }
    //     }
    //   }
    // }
    private val pathItems: MutableMap<String, PathItem> = mutableMapOf()

    fun Put(path: String, pathItem: PathItem): Paths {
        pathItems.put(path, pathItem)
        return this
    }

}