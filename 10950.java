import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int [] res = new int[t];
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            res[i] = a+b;
            //System.out.println(n + " * " + i +" = "+ (n*i));
        } 
        for(int i=0;i<t;i++){
            System.out.println(res[i]);
        }
    }
}
