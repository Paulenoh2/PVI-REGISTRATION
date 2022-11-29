package za.co.pvi.exceptions;

public class InvalidIdException  extends  RuntimeException{

    private final static  String MESSAGE = "IN VALID ID";

    public InvalidIdException(){
        super(MESSAGE);
    }
    public InvalidIdException(String message){
        super(message);
    }


}
