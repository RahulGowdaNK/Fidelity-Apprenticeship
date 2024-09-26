public class Average {
    public static double average(int[]  numbers) {
        if(numbers.length==0){
            return 0;
        }
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        return (double) sum/numbers.length;

    }
    public static void main(String[] args) {
        int[]numbers ={10,20,30,40,50};
        double average = average(numbers);
        System.out.println( "the average is:" + average);
    }
}
