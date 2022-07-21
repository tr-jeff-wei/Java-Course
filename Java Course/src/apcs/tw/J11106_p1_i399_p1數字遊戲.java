package d0618;

import java.util.Scanner;

public class i399_p1數字遊戲 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		int a = sc.nextInt() ;
		int b = sc.nextInt() ;
		int c = sc.nextInt() ;
		
		// 需要 1~9 , 0 放著不用
		int[] arr = new int[10] ;
		// 統計
		arr[a]++;
		arr[b]++;
		arr[c]++;
		
		// 找最大
		int max = 0 ;
		max = Math.max(max, arr[a]) ;
		max = Math.max(max, arr[b]) ;
		max = Math.max(max, arr[c]) ;
		
		System.out.print( max );
		
		for( int i=9 ; i>=1 ; i--) {
			if( arr[i]>0) {
				System.out.print(" "+i);
			}
		}
	}
}
