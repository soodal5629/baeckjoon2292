import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	   
	    for(int i = 0; i < N; i++) {
			String temp = sc.next();
			int total= 0;
			int sum = 0;
			for (int j = 0; j < temp.length(); j++) {
				if(temp.charAt(j)=='O') {
					sum++;
					total+=sum;
				}else {
					sum = 0;
				}
			}
			System.out.println(total);
		}
        sc.close();
    }
}
