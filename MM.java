package Test;
import java.util.Scanner;

public class MM {
	
public static void LetterM(int num){
	int i=0,j=0,k=0,m=0,n=num;

	for( i=0;i<=n;i++)
	{	
		for( k=n-1;k>=i;k--) {System.out.print("-");} //right space
		for( j=0;j<=n-1;j++) {System.out.print("*");}//line*
		for( k=n/2;k<=i;k++) {System.out.print("-");}//bottom right triangle
		for( j=2;j<=i+1;j++){System.out.print("*");} //line *
		for( m=n-1;m>=i;m--){System.out.print("--");}//middle portion of m 
	
		for( j=0;j<=n-1;j++) {System.out.print("*");}//line
		for( k=n/2;k<=i;k++) {System.out.print("-");}//bottom left triangle
		for( j=2;j<=i+1;j++) {System.out.print("*");} //line
		for( k=n-1;k>=i;k--) {System.out.print("-");} //end space
	
//---------Second letter M -------
	
		for( k=n-1;k>=i;k--) {System.out.print("-");} //right space
		for( j=0;j<=n-1;j++) {System.out.print("*");}//line*
		for( k=n/2;k<=i;k++) {System.out.print("-");}//bottom right triangle
		for( j=2;j<=i+1;j++){System.out.print("*");} //line *
		for( m=n-1;m>=i;m--){System.out.print("--");}//middle portion of m 
	
		for( j=0;j<=n-1;j++) {System.out.print("*");}//line
		for( k=n/2;k<=i;k++) {System.out.print("-");}//bottom left triangle
		for( j=2;j<=i+1;j++) {System.out.print("*");} //line
		for( k=n-1;k>=i;k--) {System.out.print("-");} //end space
	

	System.out.print("\n");
}
}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int param=0;
		Scanner sc = new Scanner(System.in);
		do{ System.out.print("Enter a number between 2 and 10 000: ");
		param=sc.nextInt();
			if (param%2==0)System.out.println("\nError! Please eneter a real numeber! \n\n");
		}
		while ((param<2 || param > 10000) || param%2==0);
		
		LetterM(param);

		
		sc.close();
	}
}


