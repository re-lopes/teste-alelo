package scenarios;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * Exercicio 2
 * Construa uma chamada de api em java usando jayway rest assured e
 * valide a mensagem da url: https://jsonplaceholder.typicode.com/todos/1
 *
 * @author renato.lopes
 * @date 06/12/2019
 */
public class ToDoAPITest {

  @Before
  public void setUp() {
    baseURI = "https://jsonplaceholder.typicode.com";
    basePath = "todos";
  }

  @Test
  public void deveValidarPrimeiroToDo() {

    given()
    .when()
      .get("/1")
    .then()
      .statusCode(200)
      .body("title", equalTo("delectus aut autem"))
      .body("completed", equalTo(false));

  }

}
