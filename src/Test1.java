import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int no_of_series=input.nextInt();
        int result = 0;

        for(int i=0;i<no_of_series;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            result = result + a;

            for (int j=0;j<n;j++) {
                result = result + ((int) Math.pow(2, j) * b);
                System.out.print(result + " ");
            }
            System.out.println();
        }

        input.close();


        long test = (long)Math.pow(2,63);
        System.out.println(test);


    }
}