package za.co.pvi.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import za.co.pvi.exceptions.util.ExceptionRespond;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ExceptionRespond invalidIdException(InvalidIdException ie){
        return new ExceptionRespond(ie.getMessage());
    }

    @ExceptionHandler
    public ExceptionRespond exception(Exception e){
        return new ExceptionRespond(e.getMessage());
    }

}
