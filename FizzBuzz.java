import java.util.*;

public class FizzBuzz{
    public String FindFizz(int num) {
        int numA = num;
        String str1 = Integer.toString(numA);
        if(num % 3 == 0 && num % 5 == 0){
            return("FizzBuzz");
        } else if(num % 5 == 0){
            return("Buzz");
        } else if(num % 3 == 0){
            return("Fizz");
        } else if(num % 3 == 1){
            return(str1);
        } else if(num % 5 == 1){
            return(str1);
        }
            return(str1);

}
}