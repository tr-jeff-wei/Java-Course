package d0618;

import java.util.Scanner;

public class i399_p1�Ʀr�C�� {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		int a = sc.nextInt() ;
		int b = sc.nextInt() ;
		int c = sc.nextInt() ;
		
		// �ݭn 1~9 , 0 ��ۤ���
		int[] arr = new int[10] ;
		// �έp
		arr[a]++;
		arr[b]++;
		arr[c]++;
		
		// ��̤j
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
