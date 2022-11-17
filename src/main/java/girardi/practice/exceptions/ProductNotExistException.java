package girardi.practice.exceptions;

public class ProductNotExistException extends Exception{
    public ProductNotExistException(){
        super("Sorry, but this product is already not registered");
    }
}
