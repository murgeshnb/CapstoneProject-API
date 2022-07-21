import create.CreateUserRequestBody;
import create.response.CreateUserResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UserService;

public class CreateUser {

    UserService userService;

    @BeforeClass
    public void beforeClass(){
         userService = new UserService();
    }

    @Test
    public void createUser(){
        //Arrange
        CreateUserRequestBody createUserRequestBody = new CreateUserRequestBody.Builder().build();

        //Act
        CreateUserResponse createUserResponse = userService.createUser(createUserRequestBody);

        //Assert
        createUserResponse.assertUSer(createUserRequestBody);
    }
}
