import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] arr = new int[9];
        int index = -1;
        int max =-1;
        for(int i=0;i<9;i++){
             arr[i] = Integer.parseInt(bf.readLine());
            if(arr[i]>max){
                max = arr[i];
                index = i+1;
            }
        }
        bw.write(max+"\n"+index);
        bf.close();
	    bw.flush();
    }
}
