package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		int n;
		
		String tallTxt = showInputDialog("Gi n en verdi:");
		n = parseInt(tallTxt);
		if (n > 0 && n < 25) {
			
	showMessageDialog(null, n + "! = " + fakultet(n));
		}
		else {
			showMessageDialog(null, "n! må være mellom 1 og 25 ");
			System.out.println("n! må være mellom 1 og 25");
		 }
		}
	   public static int fakultet(int maxTall) {
		   int nFak = 1;
		   for (int tall = 1; tall <= maxTall; tall++)
			   nFak = nFak * tall;
		   return nFak;
		   
		   
	}
	
}
