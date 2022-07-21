package create;

import create.response.GetUserResponse;
import lombok.Getter;

@Getter
public class CreatePostRequestBody {
    private String owner;
    private String post;
    private String message;

    public CreatePostRequestBody(Builder builder){
        this.owner= builder.owner;
        this.post=builder.post;
        this.message=builder.message;
    }

    public static class Builder{
        private String owner;
        private String post;
        private String message;

        public Builder(){
            this.owner="62d7e2ee913e1c315c511816";
            this.post="Cool Dude";
            this.message="it's rainy season";
        }

        public Builder owner(String id){
            this.owner=id;
            return this;
        }

        public CreatePostRequestBody build(){
            CreatePostRequestBody createPostRequestBody = new CreatePostRequestBody(this);
            return createPostRequestBody;
        }
    }
}
