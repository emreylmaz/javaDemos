package FindNumbers;

public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[] {10,12,506,34,35,9};

        int findNum = 10;

        boolean isNumber = false;

        for (int number : numbers){
            if (number == findNum){
                isNumber = true;
                break;
            }
        }

        if (isNumber){
            System.out.println("Number found");
        }else {
            System.out.println("Number not found");
        }
    }
}
