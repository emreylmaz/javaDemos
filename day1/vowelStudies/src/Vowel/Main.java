package Vowel;

public class Main {
    public static void main(String[] args) {
        char letter = 'B';

        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin sesli harf");
                break;
            default:
                System.out.println("Ince sesli harf");

        }
    }
}
