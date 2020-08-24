import java.util.*;
public class Main{
    public static void main(String args[]){
      //이 문제 푸는데 시간 꽤나 걸렸습니다 ㅠ 수학적 규칙을 찾는게 핵심이에요!!
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for (int i = 0; i < t; i++) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int dif = y-x;
        if(dif<3) System.out.println(dif);
        else {
          int count=2;
          int val=3;
          int total = 2;

          loop: while(dif>2) {
            for (int k = 0; k < count; k++) {
              for (int m = 0; m < total; m++) {
                dif--;
                if(dif==2) break loop;
              }val++;	
            }
            total++;
          }
          System.out.println(val);
        }

      }
      }
}
