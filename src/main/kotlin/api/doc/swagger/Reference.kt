package api.doc.swagger

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Created by kk on 17/4/5.
 */
class Reference {

    // The reference string.
    @JsonProperty("${'$'}ref")
    var ref: String = ""

}