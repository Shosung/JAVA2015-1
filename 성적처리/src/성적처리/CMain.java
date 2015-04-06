package ����ó��;

import view.CGangjwaView;
import view.CGwamokView;
import view.CLoginView;
import DAOs.IDAO;
import DAOs.ObjectDAO;
import DAOs.TextDAO;
import control.CGangjwaControl;
import control.CGwamokControl;
import control.CLoginControl;
import entity.CGangjwa;
import entity.CGwamok;
import entity.CMember;

public class CMain {

	public static void main(String[] args) {
		// login
		// �α���
		CLoginView loginView = new CLoginView();
		CMember member = loginView.login();
		CLoginControl  loginControl = new CLoginControl();
		member = loginControl.login(member);
		IDAO memberDAO = new ObjectDAO();
//		memberDAO.write(member, "member");
//		CMember member = new CMember();
		member = (CMember) memberDAO.read(member.getClass(), "member");
		
		// ���� ����
		CGwamokView gwamokView = new CGwamokView();
		CGwamok gwamok = gwamokView.getGwamok();
		/*
		CGwamokControl gwamokControl = new CGwamokControl();

		gwamok = gwamokControl.processGwamok(gwamok);		
		IDAO gwamokDAO = new ObjectDAO();
//		gwamokDAO.write(gwamok, "gwamok");
		gwamok = (CGwamok) gwamokDAO.read("gwamok");
		
		// ���� ����
		CGangjwaView gangjwaView = new CGangjwaView();
		CGangjwa gangjwa = gangjwaView.getGangjwa();
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);		
		IDAO gangjwaDAO = new ObjectDAO();
//		gangjwaDAO.write(gangjwa, "gangjwa");
		gangjwa = (CGangjwa) gangjwaDAO.read("gangjwa");		
*/
	}

}
