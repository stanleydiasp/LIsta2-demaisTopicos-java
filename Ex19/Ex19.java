/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner; 


public class Ex19
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
        
        int i, j;
        String asterisco = "*";
		
		for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(asterisco + " ");
            }
            System.out.println();
        }

        for (i = 4; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(asterisco + " ");
            }
            System.out.println();
        }
    }
}


