import java.util.Scanner;

public class Maxvalueofsignbyte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte num = 125;
        System.out.println("Value of the num:" +num);

        byte maxbytevalue = Byte.MAX_VALUE;
        num = maxbytevalue;

        System.out.println("the largest value stored in a signed byte:" + num);
    }
}
