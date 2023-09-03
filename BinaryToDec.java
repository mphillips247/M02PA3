import java.util.Scanner;

public class BinaryToDec {
//method for binary to decimal	
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int total = 0;
        for (int i = 0; i < binaryString.length(); ++i) {
			//check for binary 0 or 1 if not report error
            if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
                throw new BinaryFormatException(binaryString + " is an illegal binary String");
            }
            total += Math.pow(2, binaryString.length() - i - 1) * (binaryString.charAt(i) - '0');
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String str = in.nextLine();
        try {
			//convert binaary to decimal
            System.out.println("Decimal value of " + str + " is " + bin2Dec(str));
        } catch (BinaryFormatException e) {
			//if invalid output message
            System.out.println(e.getMessage());
        }
    }
}
