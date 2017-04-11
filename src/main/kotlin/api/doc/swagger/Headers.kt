package api.doc.swagger

/**
 * Created by kk on 17/4/5.
 */

// TODO: 参考文档实现自定义的Json序列化器
class Headers {

    private val headers = mutableMapOf<String, Header>()

    fun Put(headerName: String, headerObj: Header): Headers {
        headers.put(headerName, headerObj)
        return this
    }
}