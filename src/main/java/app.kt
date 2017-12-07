import org.http4k.client.ApacheClient
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status.Companion.OK
import org.http4k.server.Jetty
import org.http4k.server.asServer


fun main(args: Array<String>) {
    println ("poopsdsds chute")

    val request = Request(Method.GET, "http://buildupthebase.com")
    val client = ApacheClient()

    val response: Response = client(request)

    println("the length of response is ${response.body.length}")

}
