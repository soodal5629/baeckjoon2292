import java.util.*;
public class Main{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    double score[] = new double[N];
	    int res[][];
        for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			res = new int[N][temp];
			int count = 0;
			for (int j = 0; j < temp; j++) {
				res[i][j] = sc.nextInt();
				score[i] += (res[i][j]);
				}
			score[i] = score[i]/temp;
			for (int j = 0; j < res[i].length; j++) {	
				if(score[i]<res[i][j]) {
					count++;
				}
			}
			score[i] = (double)(count)/temp*100;
		}
       for (int i = 0; i < score.length; i++) {
		System.out.printf("%.3f", score[i]);
		System.out.println("%");
	}
        sc.close();
    }
}
