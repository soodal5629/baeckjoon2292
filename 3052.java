import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        boolean ch[] = new boolean[42];
        
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
            arr[i] = arr[i]%42;
            ch[arr[i]] = true;
        }
        int check = 0;
        for(int i=0;i<42;i++){
            if(ch[i]) check++;
        }
        
        System.out.println(check);
        
    }
}
