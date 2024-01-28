import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary string: ");
        String binaryString = scanner.next();

        try {
            int decimalValue = BinaryConverter.bin2Dec(binaryString);
            System.out.println("Decimal value: " + decimalValue);
        } catch (BinaryFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        scanner.close();
    }
}