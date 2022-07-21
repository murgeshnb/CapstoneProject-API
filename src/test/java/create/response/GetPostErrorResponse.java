package create.response;

import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;

@Getter
public class GetPostErrorResponse {
    @Setter
    private int statusCode;

    private String error;


    public void assertPostErrorResponse(){
        Assert.assertEquals(this.getError(),"RESOURCE_NOT_FOUND");
        Assert.assertEquals(this.getStatusCode(),404);
    }
}
