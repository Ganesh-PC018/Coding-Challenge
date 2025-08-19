import java.util.*;
public class LeaderOfArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int right = size-1;
        int top = arr[right];
        List<Integer> leaders = new ArrayList<>();
        leaders.add(arr[right]);
        while(right>0){
            if(arr[right-1] > top){
                top = arr[right-1];
                leaders.add(top);
            }
            right--;
        }
        sc.close();
    // List<Integer> sortedLeaders = leaders.stream().sorted(Comparator.reverseOrder()).toList();
    // Iterator<Integer> it = sortedLeaders.iterator();
        Collections.sort(leaders);

        for(Integer leader : leaders){
            System.out.print(leader+" ");
        }

    }
}
