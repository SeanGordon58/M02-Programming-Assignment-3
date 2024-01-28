public class BinaryConverter {
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int decimal = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException("Invalid binary string: " + binaryString);
            }
            decimal = decimal * 2 + (ch - '0');
        }

        return decimal;
    }
}