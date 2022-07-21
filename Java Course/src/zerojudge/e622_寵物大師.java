import java.util.Scanner;

public class e622 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
		int star = sc.nextInt() ;
		
		int maxCp = 0 ;
		int max = 0;
		
		// repeat n times
		for( int i=0   ; i <n  ; i++) {			
			// calculate cp for each monster
			int cp = sc.nextInt() ;
			int level = sc.nextInt();
			int levelUp = star/1000;
			int total = cp ;
			
			if( level >=0 && level <=29 ) {
				total = total + 10*levelUp;
				
			}else if( level>=30 && level <=39 ) {
				total = total + 50*levelUp ;
				
			}else {
				total = total + 100 * levelUp ;
			}
			
			if( total > maxCp) {
				maxCp = total ;
				max = i+1 ;
			}
			
		}
		
		System.out.println(max+" "+maxCp);
	}
}
