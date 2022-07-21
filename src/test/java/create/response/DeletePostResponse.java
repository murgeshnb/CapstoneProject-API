package create.response;

import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;

@Getter
public class DeletePostResponse {
    private String id;

    @Setter
    private int statusCode;

    public void assertPostDeletion(String postId){
        Assert.assertEquals(this.getStatusCode(),200);
        Assert.assertEquals(this.getId(),postId);
    }
}
