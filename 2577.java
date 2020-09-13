import java.util.*;
public class Main{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
	    
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a*b*c;
        int ch[] = new int[10];
        
        while(d>0){
           ch[d%10] = ch[d%10]+1;
            d= d/10;
        }
        for(int i=0;i<ch.length;i++){
        	System.out.println(ch[i]);
        }
    }
}
