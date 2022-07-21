public class Main {
    public static void main(String[] args) {
        FourOperationsManager math = new FourOperationsManager();

        System.out.println(math.add(5,9));
        // method overLoading example.
        System.out.println(math.add(5,9,6));
    }
}