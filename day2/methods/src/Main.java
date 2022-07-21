public class Main {
    public static void main(String[] args) {
        findNumber();





    }

    public static void findNumber(){

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
            messageSend("Number found: " + findNum);
        }else {
            messageSend("Number not found: " + findNum);
        }
    }

    public static void messageSend(String message){

        System.out.println(message);
    }
}