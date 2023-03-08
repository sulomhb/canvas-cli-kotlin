
import io.github.cdimascio.dotenv.Dotenv
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse


fun fetch_API(url : String) {
    val dotenv = Dotenv.load();
    val token = dotenv.get("CANVAS_TOKEN");

    val client = HttpClient.newBuilder().build();
    val request = HttpRequest.newBuilder()
        .uri(URI.create(url))
        .header("Authorization", "Bearer $token")
        .build();
    val response = client.send(request, HttpResponse.BodyHandlers.ofString());
    return response.body()
 }

fun main() {
    fetch_API("https://uia.instructure.com/api/v1/courses/");
    println("Test");
}
