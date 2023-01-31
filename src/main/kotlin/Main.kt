
import io.github.cdimascio.dotenv.Dotenv
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

fun main() {
    val dotenv = Dotenv.load();
    val token = dotenv.get("CANVAS_TOKEN");

    val client = HttpClient.newBuilder().build();
    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://uia.instructure.com/api/v1/courses/"))
        .header("Authorization", "Bearer $token")
        .build();
    val response = client.send(request, HttpResponse.BodyHandlers.ofString());
    println(response.body())
}
