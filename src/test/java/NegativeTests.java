import create.CreateUserRequestBody;
import create.response.negativeTestResponse.CreateUSerWithInvalidEmailId;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UserService;

public class NegativeTests {

    UserService userService;

    @BeforeClass
    public void beforeClass(){
        userService = new UserService();
    }

    @Test
    public void creatingUSerWithExistingEmailId(){
        CreateUserRequestBody createUserRequestBody = new CreateUserRequestBody.Builder().email("sachinjb1234@gmail.com").build();

        //Act
        CreateUSerWithInvalidEmailId userWithInvalidEmailId = userService.createUserWithInvalidEmailId(createUserRequestBody);

        //Assert
        Assert.assertEquals(userWithInvalidEmailId.getStatusCode(),400);
        Assert.assertEquals(userWithInvalidEmailId.getError(),"BODY_NOT_VALID");
        Assert.assertEquals(userWithInvalidEmailId.getData().getEmail(),"Email already used");
    }
}
