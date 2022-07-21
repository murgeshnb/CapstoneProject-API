import create.response.GetPostResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UserService;

public class GetPost {
    UserService userService;

    @BeforeClass
    public void beforeClass(){
         userService = new UserService();
    }

    @Test
    public void getPost(){
        GetPostResponse getPostResponse = userService.getPost("62d8d65a1eec981964ffc55e");

        Assert.assertEquals(getPostResponse.getStatusCode(),200);
        Assert.assertEquals(getPostResponse.getId(),"62d8d65a1eec981964ffc55e");

    }
}
