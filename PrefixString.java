import java.util.*;
public class te {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	String arr[]=new String[n];
		String sum="";
		for(int i=0;i<n;i++)
		{
			arr[i]=in.next();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		int smallLen=arr[0].length();
		System.out.println(smallLen);
		int i=0;
		while (i < smallLen && arr[0].charAt(i) == arr[arr.length-1].charAt(i) )
			i++;
		String pre = arr[0].substring(0, i);
		System.out.println(pre);		
}
}
