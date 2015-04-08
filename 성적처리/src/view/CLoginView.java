package view;

import java.util.Scanner;

import entity.CMember;

public class CLoginView extends CView {
	
	public void login() {
		Scanner scanner = new Scanner(System.in); 
		// input from keyboard using scanner
		CMember member = new CMember();
//		String userId = scanner.next();		
		member.setUserID("userId");
		
//		String password = scanner.next();		
		member.setPassword("password");
		// close scanner
		
		member = (CMember) this.getControl().process(member);
		scanner.close();
	}
}
