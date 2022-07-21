import create.response.DeletePostResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UserService;

public class DeletePost {
    UserService userService;

    @BeforeClass
    public void beforeClass(){
         userService = new UserService();
    }
    @Test
    public void deletePost(){
        String postId="62d8d65a1eec981964ffc55e";
        DeletePostResponse deletePostResponse = userService.deletePost(postId);

        Assert.assertEquals(deletePostResponse.getStatusCode(),200);
        Assert.assertEquals(deletePostResponse.getId(),postId);
    }
}
