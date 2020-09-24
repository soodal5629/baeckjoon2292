import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String args[]) throws IOException{
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	   int t = Integer.parseInt(bf.readLine());
	        for(int i=1;i<=t;i++){
               String a=bf.readLine();
	           StringTokenizer st = new StringTokenizer(a);
	           
	           int b=Integer.parseInt(st.nextToken());
	           int c=Integer.parseInt(st.nextToken());
	           
	           bw.write("Case #"+i+": "+b+" + "+c+" = "+(b+c)+"\n");
	        } 
	        bf.close();
	        bw.flush();
    }
}
