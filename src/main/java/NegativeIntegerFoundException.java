import java.util.Arrays;

public class NegativeIntegerFoundException extends Exception {
//    public NegativeIntegerFoundException(String errorException){
//        super(errorException);
//    }

    public NegativeIntegerFoundException(int[] arr){
        super("Exception in arr are there negative numbers: " + Arrays.toString(arr));
    }
}
