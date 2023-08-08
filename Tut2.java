public class Tut2 {
    public static void main(String args[]){
             int num[] = {1,2,3,4,5,6};
             int a = num.length-2;
             int b = num.length-1;
             System.out.println(IsSorted(num,a,b));
     }

     // Find the array is sorted or not

     public static boolean IsSorted(int arr[],int a,int b){
      boolean status;
 
     boolean base_case = (arr[a] < arr[b]);

     if((a==0) && (b==1)){
         return base_case;
     }
     status = ((arr[a])<(arr[b])) && (IsSorted(arr,a-1,b-1));
      return status;
     }

     public static int NthFBNCNumber(int n){
            
        if(n==1){
            return 0;
        }
        else if(n == 2){
            return 1;
        }
       int nth = NthFBNCNumber(n-2) + NthFBNCNumber(n-1);
        return nth;
}




}
