import java.util.*;
public class SortArray{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;
        for(int data : arr){
            if(data == 0){
                zeroCount++;
            }else if(data == 1){
                oneCount++;
            }else{
                twoCount++;
            }
        }
        
        int i=0;
        while(zeroCount != 0){
            arr[i] = 0;
            zeroCount--;
            i++;
        }
        while(oneCount != 0){
            arr[i] = 1;
            oneCount--;
            i++;
        }
        while(twoCount != 0){
            arr[i] = 2;
            twoCount--;
            i++;
        }

        for(int data : arr){
            System.out.print(data+" ");
        }
    }
}