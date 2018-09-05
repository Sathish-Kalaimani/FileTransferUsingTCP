package tcp.filetransferusingtcp;

import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.*;

public class ClientHandler extends Thread {

	Socket socket;

	public ClientHandler(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		try {
			byte[] b = new byte[5000];
			FileInputStream is = new FileInputStream("F:\\My Documents\\BD.txt");
			is.read(b, 0, b.length);
			OutputStream os = socket.getOutputStream();
			os.write(b, 0, b.length);
			is.close();
			os.flush();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
