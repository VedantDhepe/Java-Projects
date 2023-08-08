public class Tut4 {
    public static void main(String args[]){
        System.out.println(Exponentiation(3,4));
        System.out.println(Exponentiation(2,8));
    }


    // O(N)
    public static int Exponentiation(int n, int expo){
        if(expo == 1){
            return n;
        }
        return n*(Exponentiation(n,expo-1));
    }


    // Another Way O(LogN)

    public static int Exponentiation2(int n, int expo){
        if(expo%2 ==1){
        return n*Exponentiation2(n,expo-1);
        }
        if(expo == 1){
            return n;
        }

        int a = Exponentiation2(n, expo/2);
        return a;
    }

}
