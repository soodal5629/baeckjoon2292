import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       Integer.parseInt(br.readLine());
       StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int min= 1000000;
       int max= -1000001;
        while(st.hasMoreTokens()){
            int temp = Integer.parseInt(st.nextToken());
            if(temp>max){
                max = temp;
            }
            if(temp<min){
                min = temp;
            }
        }
        br.close();
       System.out.println(min+" "+max);   
   }
}
