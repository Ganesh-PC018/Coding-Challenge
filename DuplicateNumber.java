import java.util.*;

public class DuplicateNumber{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for(int data : arr){
            if(!set.add(data)){
                System.out.println(data);
                return;
            }
        }
        sc.close();
        System.out.println(-1);
    }
}
