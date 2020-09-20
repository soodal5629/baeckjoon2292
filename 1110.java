import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
		         int N = sc.nextInt();
		         if(N<10) N=10*N;
		         int a = N/10; //몫
		         int b = N%10;//나머지
		         int count=0;
		         while(true) {
		        	count++;
		        	int temp = (10*b)+((a+b)%10);
		        	if(temp == N) {
		        		break;
		        	}else {
		        		a=temp/10;
		        		b=temp%10;
		        	}
		         }
		         System.out.println(count);
 	}
}
