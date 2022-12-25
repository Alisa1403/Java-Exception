package HM2.Task1;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int d = 1;
        try {
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
    }
}
