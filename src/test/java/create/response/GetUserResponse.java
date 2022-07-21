package create.response;

import create.CreateUserRequestBody;
import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

@Getter
public class GetUserResponse {
    @Setter
    private int statusCode;

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String registerDate;
    private String updatedDate;

    public void assertUSerOnId(CreateUserRequestBody createUserRequestBody,String id){
        assertEquals(this.id,id);
        assertEquals(this.firstName,createUserRequestBody.getFirstName());
        assertEquals(this.lastName,createUserRequestBody.getLastName());
        assertEquals(this.email,createUserRequestBody.getEmail());
        assertEquals(this.statusCode,200);
    }
}
