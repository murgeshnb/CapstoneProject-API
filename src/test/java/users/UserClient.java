package users;

import create.CreatePostRequestBody;
import create.CreateUserRequestBody;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserClient {

    public Response create(CreateUserRequestBody createUserRequestBody){
        Response response = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .header("app-id", "62d6a90ed5e6b64adf50063c")
                .body(createUserRequestBody)
                .when()
                .post("https://dummyapi.io/data/v1/user/create");

        return response;
    }

    public Response getUser(String id){
        Response response = given()
                .header("app-id", "62d6a90ed5e6b64adf50063c")
                .pathParam("id", id)
                .when()
                .get("https://dummyapi.io/data/v1/user/{id}");

        return response;
    }

    public Response getPost(String id){
        Response response = given()
                .header("app-id", "62d6a90ed5e6b64adf50063c")
                .pathParam("id", id)
                .when()
                .get("https://dummyapi.io/data/v1/post/{id}");

        return response;
    }

    public Response deletePost(String id){
        Response response = given()
                .header("app-id", "62d6a90ed5e6b64adf50063c")
                .pathParam("id", id)
                .when()
                .delete("https://dummyapi.io/data/v1/post/{id}");

        return response;
    }

    public Response create(CreatePostRequestBody createPostRequestBody){
        Response response = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .header("app-id", "62d6a90ed5e6b64adf50063c")
                .body(createPostRequestBody)
                .when()
                .log().all()
                .post("https://dummyapi.io/data/v1/post/create");

        return response;
    }

    public Response deleteUSer(String id) {
        Response response = given()
                .header("app-id", "62d6a90ed5e6b64adf50063c")
                .pathParam("id", id)
                .when()
                .delete("https://dummyapi.io/data/v1/user/{id}");

        return response;

    }
}
