package create.response.negativeTestResponse;

import lombok.Getter;
import lombok.Setter;

@Getter
public class CreateUSerWithInvalidEmailId {
    @Setter
    private int statusCode;

    private Data data;
    private String error;

    @Getter
    public static class Data{
        private String email;
    }


}
