package api.doc.swagger

/**
 * Created by kk on 17/4/5.
 */
class SecurityRequirement {

    private val reqirementMap = mutableMapOf<String, List<String>>()

    fun Put(name: String, vararg requirements: String): SecurityRequirement {
        reqirementMap.put(name, requirements.asList())
        return this
    }
}