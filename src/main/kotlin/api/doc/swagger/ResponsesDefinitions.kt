package api.doc.swagger

/**
 * Created by kk on 17/4/5.
 */
class ResponsesDefinitions {

    private var responseMap:MutableMap<String, Response> = mutableMapOf()

    fun Put(name:String, response: Response) : ResponsesDefinitions {
        responseMap.put(name, response)
        return this
    }
}