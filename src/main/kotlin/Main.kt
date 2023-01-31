import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse


/* Canvas Token : 10742~K6jARCPU2szlPBT1nX2emMWyRfxRgC6qZoo1NV1fZ53JFjKivY0xfxHWvxwGmDyf */
fun main() {
    val client = HttpClient.newBuilder().build();

    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://uia.instructure.com/api/v1/courses/"))
        .header("Authorization", "Bearer 10742~K6jARCPU2szlPBT1nX2emMWyRfxRgC6qZoo1NV1fZ53JFjKivY0xfxHWvxwGmDyf")
        .build();
    val response = client.send(request, HttpResponse.BodyHandlers.ofString());
    println(response.body())
}
