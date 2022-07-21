package integrationTests;

import create.CreatePostRequestBody;
import create.response.CreatePostResponse;
import create.response.DeletePostResponse;
import create.response.GetPostErrorResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UserService;

public class UserTests {

    UserService userService;

    @BeforeClass
    public void beforeClass(){
        userService = new UserService();
    }

    @Test
    public void shouldCreatePostAndDeletePost(){
        //Arrange
        CreatePostRequestBody createPostRequestBody = new CreatePostRequestBody.Builder().build();

        //Act
        CreatePostResponse createPostResponse = userService.createPost(createPostRequestBody);
        String createPostResponseId = createPostResponse.getId();
        DeletePostResponse deletePostResponse = userService.deletePost(createPostResponseId);

        //Assert
        deletePostResponse.assertPostDeletion(createPostResponseId);

        //Asserting deleted post
        GetPostErrorResponse postErrorResponse = userService.getPostErrorResponse(createPostResponseId);
        postErrorResponse.assertPostErrorResponse();
    }
}
