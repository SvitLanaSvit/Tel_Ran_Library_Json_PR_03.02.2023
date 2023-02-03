import java.util.Arrays;

public class Main {
    public static void arrProcess(int[] arr){
        int[] negArr = Arrays.stream(arr).filter(e -> e < 0).toArray();
        if(negArr.length > 0){
            try {
                //throw new NegativeIntegerFoundException("In arrays contains negative Integer numbers");
                throw new NegativeIntegerFoundException(negArr);
            } catch (NegativeIntegerFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println(Arrays.toString(arr));
            System.out.println("Sum of number = " + (Arrays.stream(arr).reduce(Integer::sum).getAsInt()));
        }
    }

    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int[]arr1 = {1,2,3,-4,-5};
        arrProcess(arr1);
    }
}