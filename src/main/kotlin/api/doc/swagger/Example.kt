package api.doc.swagger

/**
 * Created by kk on 17/4/5.
 */

// TODO: 自定义的Json序列化器

class Example {

    private val sampleMap = mutableMapOf<String, Any>()

    fun Put(mimeType: String, sample: Any): Example {
        sampleMap.put(mimeType, sample)
        return this
    }

}