import java.util.*;
public class MergeTwoSortedArrays {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int m = sc.nextInt();
            int arr1[] = new int[m];
            int n = sc.nextInt();
            int arr2[] = new int[n];
            for(int i=0;i<m;i++){
                arr1[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                arr2[i] = sc.nextInt();
            }
            int i=0;
            int j=n-1;
            while(i>=0 && j >=0){
                if(arr1[i] > arr2[j]){
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
                j--;
                i++;
            }
            sc.close();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for(int data : arr1){
                System.out.print(data+" ");
            }
            for(int data : arr2){
                System.out.print(data+" ");
            }
        }
}

