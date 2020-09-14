import java.util.*;
public class Main{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
        double arr[] = new double[N];
        for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
        Arrays.sort(arr);
        double max = arr[arr.length-1];
        double sum = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]/max*100;
            sum+=arr[i];
        }
        System.out.println(sum/N);
    }
}
