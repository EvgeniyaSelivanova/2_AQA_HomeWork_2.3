package ru.netology.rost;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostManEchoTest {
    @Test
    void shouldReturnResponsePostmanEcho() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                // Выполняемые действия
                .when()
                .post("/post")
                // Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("some data"));
    }
}
