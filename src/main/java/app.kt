import org.http4k.client.ApacheClient
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status.Companion.OK

import org.http4k.format.Jackson
import org.http4k.format.Jackson.asJsonArray
import org.http4k.format.Jackson.asJsonObject
import org.http4k.format.Jackson.asJsonValue
import org.http4k.format.Jackson.asPrettyJsonString
import org.http4k.format.Jackson.json


fun main(args: Array<String>) {
    println ("poopsdsds chute")

    val request = Request(Method.GET, "https://www.reddit.com/user/tankorsmash.json")
    val client = ApacheClient()

    val response: Response = client(request)
    val json_data = response.body.toString().asJsonObject()

//    val json_data =
//            listOf(
//            "string key" to "string val".asJsonValue(),
//            "123" to 123.asJsonValue()
//    ).asJsonObject()

//    println(json_data["string key"])

    println("the length of response is ${json_data.asPrettyJsonString()}")

}
