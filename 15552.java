import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String args[]) throws IOException{
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	     //StringTokenizer st = new StringTokenizer(bf.read());
	        int t = Integer.parseInt(bf.readLine());
	        
	        //int [] res = new int[t];
	        for(int i=0;i<t;i++){
	        	
	           String a=bf.readLine();
	           StringTokenizer st = new StringTokenizer(a);
	           
	           int b=Integer.parseInt(st.nextToken());
	           int c=Integer.parseInt(st.nextToken());
	           
	           bw.write((b+c)+"\n");  
	            // res[i] = a+b;
	        } 
	        bf.close();
	        bw.flush();
    }
}
