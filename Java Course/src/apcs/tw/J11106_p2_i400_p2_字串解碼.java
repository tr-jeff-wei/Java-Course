package d0618 ;
import java.util.ArrayList;
import java.util.Scanner;

public class i400_p2_字串解碼 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nPro = sc.nextInt();
		int sLen = sc.nextInt();
		ArrayList<String> plist = new ArrayList<>();
		for (int i = 0; i < nPro; i++) {
			String s = sc.next();
			plist.add(s);
		}
		String resultStr = sc.next();
		
		for (int i = plist.size()-1 ; i >=0; i--) {
			String p = plist.get(i) ;
			resultStr = process( resultStr,p) ;
		}

		System.out.println(resultStr);

	}
	
	public static String process( String text , String p01) {
		String result = "" ;
		int n=0;
		for (int i = text.length()-1 ; i>=0 ; i--) {
			char c = text.charAt(i) ;
			char code = p01.charAt(i) ;
			if(code=='0' ) {
				// 放前
				result = c+result;
			}else {
				// 放後
				result = result+c;
				n++;
			}
		}
		
		if( n%2==1) {
			// 奇數要對切
			int hlen = result.length()/2 ;
			if( result.length()%2==0) {
				result = result.substring( hlen )+result.substring(0,hlen) ;
			}else {
				// 0 1 2 3 4  <-- 5/2 = 2
				result = result.substring(hlen+1)+result.charAt(hlen)+result.substring(0,hlen) ;
			}
		}
		return result ;
	}
}

/*
 * 3 6 111110 101101 000000 RETYWQ
 */