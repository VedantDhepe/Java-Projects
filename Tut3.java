public class Tut3 {
    public static void main(String args[]){
        int num[] = {8, 2, 5, 5, 8, 10, 2, 5, 3};
        int n = 0;
        System.out.println(FirstOccurence(num,3,n));
        int i = num.length-1;
        System.out.println(LastOccurence(num, 5,i));
    }
    public static int FirstOccurence(int arr[],int key, int n){
        if(n== arr.length){
            return -1;
        }
        if(arr[n] == key){
            return n;
        }
       
        
        return FirstOccurence(arr,key,n+1);
    }

   
    public static int LastOccurence(int arr[], int key , int i){
        if(i < 0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return LastOccurence(arr,key,i-1);

    }
}
