package api.doc.swagger

/**
 * Created by kk on 17/4/5.
 */

// TODO: 自定义Json序列化器

class Scopes {

    private val scopeMap = mutableMapOf<String, String>()

    fun Put(name:String, scopeValue:String):Scopes {
        scopeMap.put(name, scopeValue)
        return this
    }
}