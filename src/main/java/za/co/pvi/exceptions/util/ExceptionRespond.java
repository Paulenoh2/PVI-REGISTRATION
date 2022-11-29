package za.co.pvi.exceptions.util;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionRespond {
    private String message;
    private Integer status;

    public ExceptionRespond(String message){
        this.message = message;
    }
}
