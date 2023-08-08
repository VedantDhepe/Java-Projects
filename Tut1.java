// Printing numbers int decreasing order
public class Tut1 {
    public static void main(String args[]) {
        int n = 10;
        System.out.println(Sum(3));

    }

    public static void PrintDec(int n) {
        if(n == 1) {
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        PrintDec(n-1);
    }
    public static void PrintInc(int n) {
       if(n ==1) {
            System.out.print(n + " ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n+  " ");
    }
    public static int Factorial(int n) {
        if(n ==0) {
            return 1;
        }
        int fn = Factorial(n-1);
        int fact = n* fn;
        return fact;
        
    }
    public static int Sum(int n) {
        if(n == 1){
            return 1;
        }
        int temp = Sum(n-1);
        int sum =temp;
        return sum;
    }
}