import create.response.DeletePostResponse;
import create.response.DeleteUSerResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UserService;

public class DeleteUSer {

    UserService userService;

    @BeforeClass
    public void beforeClass(){
        userService = new UserService();
    }
    @Test
    public void deleteUser(){
        String userId="62d921fb0c12ff4b6002bdad";
        DeleteUSerResponse deletePostResponse = userService.deleteUSer(userId);

        Assert.assertEquals(deletePostResponse.getStatusCode(),200);
        Assert.assertEquals(deletePostResponse.getId(),userId);
    }
}
