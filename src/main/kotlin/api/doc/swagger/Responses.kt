package api.doc.swagger

/**
 * Created by kk on 17/4/5.
 */

// TODO: 参考文档的定义, 实现自定义的json序列化器

class Responses {

    // Response Object | Reference Object
    // The documentation of responses other than the ones declared for specific HTTP response codes.
    // It can be used to cover undeclared responses.
    // Reference Object can be used to link to a response that is defined at the Swagger Object's responses section.

    private var responseMap:MutableMap<String, Any> = mutableMapOf()

    fun Put(httpStatusCode:String, response: Response) : Responses {
        responseMap.put(httpStatusCode, response)
        return this
    }

    fun Put(httpStatusCode: String, reference: Reference):Responses {
        responseMap.put(httpStatusCode, reference)
        return this
    }

    fun PutDefault(response: Response) : Responses {
        responseMap.put("default", response)
        return this
    }

    fun PutDefault(reference: Reference) : Responses {
        responseMap.put("default", reference)
        return this
    }
}