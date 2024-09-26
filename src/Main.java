import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks");
        int marks = sc.nextInt();

        String grade;
        String feedback;

        int marksgroup =marks /10;

      int[] arr = new int[5];
      arr[0]=78;
      arr[1]=90;

      for(int i=0;i<=arr.length;i++){
          System.out.println(arr[i]);
      }
      String[] cities = {"chwnnai", "bengaluru","mumnbai"};


    }
}