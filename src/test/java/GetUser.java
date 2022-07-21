import create.CreateUserRequestBody;
import create.response.CreateUserResponse;
import create.response.GetUserResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import users.UserService;

import static io.restassured.RestAssured.given;

public class GetUser {

    UserService userService;

    @BeforeClass
    public void beforeClass(){
         userService = new UserService();
    }

    @Test
    public void getUserById(){
        //Arrange
        CreateUserRequestBody createUserRequestBody = new CreateUserRequestBody.Builder().build();

        //Act
        CreateUserResponse createUserResponse = userService.createUser(createUserRequestBody);
        String id = createUserResponse.getId();

        GetUserResponse userResponse = userService.getUser(id);

        //Assert
        userResponse.assertUSerOnId(createUserRequestBody,id);

    }
}
