package DAOs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entity.CGangjwa;
import entity.CGwamok;

public class CGangjwaDAO {
	
	public CGangjwa read() { return null; }
	public void write(CGangjwa gangjwa) {
		System.out.print("°­ÁÂID: " + gangjwa.getID());
		System.out.println(",°­ÁÂ¸í: " + gangjwa.getName());
		// serialize
		try {
			ObjectOutputStream out = 
					new ObjectOutputStream(new FileOutputStream("gangjwa"));
			out.writeObject(gangjwa);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
