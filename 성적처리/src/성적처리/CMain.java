package 己利贸府;

import view.CLoginView;
import DAOs.IDAO;
import DAOs.ObjectDAO;
import DAOs.TextDAO;
import control.CLoginControl;
import entity.CMember;

public class CMain {

	public static void main(String[] args) {
		// login
		// 肺弊牢
		CLoginView loginView = new CLoginView();
		CMember member = loginView.login();
		CLoginControl  loginControl = new CLoginControl();
		member = loginControl.login(member);
		IDAO memberDAO = new TextDAO();
//		memberDAO.write(member, "member");
//		CMember member = new CMember();
		member = (CMember) memberDAO.read(member, "member.txt");
	}

}
