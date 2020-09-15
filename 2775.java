import java.util.*;
public class Main{
    public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
		
	int t = sc.nextInt();
	for (int i = 0; i < t; i++) { //T입력 받기
		int k = sc.nextInt(); //층
		int n = sc.nextInt(); //호
		int arr[][] = new int[k+1][n+1];
		for (int j = 0; j <= k; j++) {
			for (int l = 1; l <= n; l++) {
				if(j==0) arr[j][l] = l;
				else {
					arr[j][l] = arr[j-1][l]+arr[j][l-1];
				}
			}
		}System.out.println(arr[k][n]);
	}
	sc.close();
    }
}
