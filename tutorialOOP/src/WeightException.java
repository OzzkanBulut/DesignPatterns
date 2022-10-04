public class WeightException extends Exception{
    String message;

    public WeightException(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
}
