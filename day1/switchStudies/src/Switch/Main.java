package Switch;

public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch(grade) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            default:
                System.out.println("No Selected");
                break;
        }

    }
}
