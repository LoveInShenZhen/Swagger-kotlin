package api.doc.swagger

/**
 * Created by kk on 17/4/5.
 */

// TODO: 自定义Json序列化器 

class SecurityDefinitions {

    // A single security scheme definition, mapping a "name" to the scheme it defines.
    private val secSchemeMap = mutableMapOf<String, SecurityScheme>()

    fun Put(name: String, scheme: SecurityScheme): SecurityDefinitions {
        secSchemeMap.put(name, scheme)
        return this
    }
}