import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException{
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	   int t = Integer.parseInt(bf.readLine());
	        for(int i=1;i<=t;i++){
                for(int j=1; j<=t; j++){
                    if(j>=(t+1-i))bw.write("*");
                    else bw.write(" ");
	            }bw.write("\n");
              } 
	        bf.close();
	        bw.flush();
    }
}
