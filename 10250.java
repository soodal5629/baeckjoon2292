import java.util.*;
public class Main{
    public static void main(String args[]){
    // 2중 for문을 돌리지않고 단일 for문을 돌려도 되지만 저는 2중 for문을 돌렸습니다ㅠ
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int h  = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			int num=1;
			int arr[][] = new int[h][w];
			loop:for (int j2 = 0; j2 < arr[0].length; j2++) {
				 for (int j = arr.length-1; j >=0; j-- ) {
					arr[j][j2] = num;
					if(num == n) {
						System.out.printf("%d",(arr.length-j)*100+(j2+1));
						break loop;
					}
					else num++;					
				}
			}
			System.out.println();
		}
        sc.close();
    }
}
