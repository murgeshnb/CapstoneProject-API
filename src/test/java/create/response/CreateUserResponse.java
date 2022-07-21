package create.response;

import create.CreateUserRequestBody;
import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;

@Getter
public class CreateUserResponse {
    @Setter
    private int statusCode;

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String registerDate;
    private String updatedDate;

    public void assertUSer(CreateUserRequestBody createUserRequestBody){
        Assert.assertEquals(this.firstName,createUserRequestBody.getFirstName());
        Assert.assertEquals(this.lastName,createUserRequestBody.getLastName());
        Assert.assertEquals(this.email,createUserRequestBody.getEmail());
        Assert.assertEquals(this.statusCode,200);
    }
}
