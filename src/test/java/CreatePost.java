import create.CreatePostRequestBody;
import create.response.CreatePostResponse;
import create.response.GetUserResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UserService;

public class CreatePost {
    UserService userService;

    @BeforeClass
    public void beforeClass(){
         userService = new UserService();
    }

    @Test
    public void createBlogPost(){
        //Arrange
        CreatePostRequestBody createPostRequestBody = new CreatePostRequestBody.Builder().build();

        //Act
        CreatePostResponse createPostResponse = userService.createPost(createPostRequestBody);

        //Assert
        createPostResponse.assertPostResponse();
    }
}
