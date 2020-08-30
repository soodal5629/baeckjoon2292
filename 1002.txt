import java.util.*;
public class Main{
    public static void main(String args[]){
    
    	// 두 점 사이의 거리구하는 수학적 개념과 공식이 중요합니다
	
       	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
		
	for (int i = 0; i < t; i++) {
        int count =0;
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r2 = sc.nextInt();
        if(x==x2&&y==y2) {
          if(r==r2) count = -1;
          else count = 0;
        }else {
                  if(Math.pow(x-x2, 2)+Math.pow(y-y2, 2)==Math.pow(r+r2, 2)) count = 1 ;
          else if(Math.pow(x-x2, 2)+Math.pow(y-y2, 2)>Math.pow(r+r2, 2)) count =0;

          else if(Math.pow(x-x2, 2)+Math.pow(y-y2, 2)<Math.pow(r-r2, 2)) count =0;
                else if(Math.pow(r2-r,2) == Math.pow(x-x2, 2)+Math.pow(y-y2, 2)) count=1;
              else count = 2;
        }
        System.out.println(count);
      }

       sc.close();
    }
}
