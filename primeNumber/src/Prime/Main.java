package Prime;

public class Main {
    public static void main(String[] args) {

        int number =4 ;
        boolean condition = true;

        for(int i = 2; i<number; i++) {
            if(number % i == 0) {
                condition = false;
            }
        }
        if(condition) {
            System.out.println("Prime Number");
        }else {
            System.out.println("Not prime number");
        }
    }
}
