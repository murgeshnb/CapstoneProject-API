package create.response;

import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;

import java.util.List;

@Getter
public class CreatePostResponse {
    @Setter
    private int statusCode;

    private String id;
    private String image;
    private int likes;
    private String link;
    private String publishDate;
    private String updatedDate;
    private String text;
    private Owner owner;
    private Tags tags[];

    @Getter
    public static class Tags{
        private String tags;
    }

    @Getter
    public static class Owner{
        private String id;
        private String firstName;
        private String lastName;
    }

    public void assertPostResponse(){
        Assert.assertEquals(this.getStatusCode(),200);
    }
}
