import java.util.*;
public class Main{
    public static void main(String args[]){
      // 저는 contains 내장함수를 쓰지 않았습니다..!!
      
      Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    int arr[] = new int[26];
	    for (int i = 0; i < arr.length; i++) {
			arr[i] = i+97;
		}
	    int[] asc = new int[26];
	    for (int i = 0; i < asc.length; i++) {
			asc[i] = -1;
		}
	    for (int i = 0; i < s.length(); i++) {
			int temp = s.charAt(i);
	    	for (int j = 0; j < asc.length; j++) {
				if(temp==arr[j]&&asc[j]==-1) asc[j] = i;
			}
		}
	    for (int i = 0; i < asc.length; i++) {
			System.out.print(asc[i]+" ");
		}
    }
}
