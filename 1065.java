import java.util.*;
public class Main{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    System.out.println(hanNum(N));
        sc.close();
	}

	private static int hanNum(int n) {
		int count = 0;
		int sum = 0;
		int num [] =new int[3];
		if(n<10) {
			for (int i = 1; i <= n; i++) {
				count++;
			}
		}
		else if(n>=10&&n<100) {
			for (int i = 10; i <=n; i++) {
				count++;
			}
			count+=9;
		}
		else {
			count+=99;
			if(n==1000) count = count-1;
			while(n>=100) {
				int temp = n;
				for (int i = 0; i < num.length; i++) {
					num[i] = temp%10;
					temp = temp/10;
				}
				if(num[0]-num[1] == num[1]-num[2]) count++;
				n = n-1;
			}
				
		}
		return count;
	}
    }
