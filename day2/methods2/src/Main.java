public class Main {
    public static void main(String[] args) {
        String message = "Bugun hava cok guzel. su sehirde: ";
        String newMessage = cityShow();
        System.out.println(message + newMessage);
        int num = sum(4,5);
        System.out.println(num);
        int sum = sum2(2,3,4,5,6 );
        System.out.println(sum);
    }


    public static void add(){
        System.out.println("Eklendi");

    }

    public static void delete(){
        System.out.println("Silindi");

    }

    public static void update(){
        System.out.println("Güncellendi");

    }


    public static int sum(int num1, int num2) {
        return num1+num2;
    }

    //variable arguments
    public static int sum2(int...numbers){

        int sum=0;
        for (int num:numbers){
             sum += num;
        }
        return sum;
    }

    public static String cityShow() {
        return "Aydin";
    }
}