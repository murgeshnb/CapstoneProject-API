package users;

import create.CreatePostRequestBody;
import create.CreateUserRequestBody;
import create.response.*;
import create.response.negativeTestResponse.CreateUSerWithInvalidEmailId;
import io.restassured.response.Response;

public class UserService {

    public CreateUserResponse createUser(CreateUserRequestBody createUserRequestBody){
        Response response = new UserClient().create(createUserRequestBody);
        int statusCode = response.statusCode();

        CreateUserResponse createUserResponse = response.as(CreateUserResponse.class);

        createUserResponse.setStatusCode(statusCode);
        response.then().log().body();

        return createUserResponse;
    }

    public CreateUSerWithInvalidEmailId createUserWithInvalidEmailId(CreateUserRequestBody createUserRequestBody){
        Response response = new UserClient().create(createUserRequestBody);
        int statusCode = response.statusCode();

        CreateUSerWithInvalidEmailId createUSerWithInvalidEmailId = response.as(CreateUSerWithInvalidEmailId.class);

        createUSerWithInvalidEmailId.setStatusCode(statusCode);
        response.then().log().body();

        return createUSerWithInvalidEmailId;
    }

    public GetUserResponse getUser(String id){
        Response response = new UserClient().getUser(id);
        response
                .then()
                    .log().body();
        int statusCode = response.statusCode();

        GetUserResponse getUserResponse = response.as(GetUserResponse.class);
        getUserResponse.setStatusCode(statusCode);

        return getUserResponse;
    }

    public GetPostResponse getPost(String id){
        Response response = new UserClient().getPost(id);
        int statusCode = response.statusCode();
        response.then()
                .log().body();

        GetPostResponse getPostResponse = response.as(GetPostResponse.class);
        getPostResponse.setStatusCode(statusCode);
        return getPostResponse;
    }

    public GetPostErrorResponse getPostErrorResponse(String id){
        Response response = new UserClient().getPost(id);
        int statusCode = response.statusCode();
        response.then()
                .log().body();

        GetPostErrorResponse getPostErrorResponse = response.as(GetPostErrorResponse.class);
        getPostErrorResponse.setStatusCode(statusCode);
        return getPostErrorResponse;
    }

    public DeletePostResponse deletePost(String id){
        Response response = new UserClient().deletePost(id);
        int statusCode = response.statusCode();
        response.then()
                .log().body();

        DeletePostResponse deletePostResponse = response.as(DeletePostResponse.class);
        deletePostResponse.setStatusCode(statusCode);
        return deletePostResponse;
    }

    public CreatePostResponse createPost(CreatePostRequestBody createPostRequestBody){
        Response response = new UserClient().create(createPostRequestBody);
        response.then()
                .log().body();

        int statusCode = response.statusCode();

        CreatePostResponse createPostResponse = response.as(CreatePostResponse.class);
        createPostResponse.setStatusCode(statusCode);

        return createPostResponse;
    }

    public DeleteUSerResponse deleteUSer(String userId) {
        Response response = new UserClient().deleteUSer(userId);
        int statusCode = response.statusCode();
        response.then()
                .log().body();

        DeleteUSerResponse deleteUSerResponse = response.as(DeleteUSerResponse.class);
        deleteUSerResponse.setStatusCode(statusCode);

        return deleteUSerResponse;
    }
}
