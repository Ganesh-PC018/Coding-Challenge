import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int newSize = arr.length+1;
        long sum=0;
        for(int data : arr){
            sum +=data;
        }
        System.out.println(((newSize*(newSize+1))/2)-sum);
    }
}
