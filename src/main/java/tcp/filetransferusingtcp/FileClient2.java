package tcp.filetransferusingtcp;

import java.io.*;
import java.net.*;

public class FileClient2 {

	public static void main(String[] args) throws Exception {
		byte[] b = new byte[5000];
		Socket socket = new Socket("localhost", 4333);
		
		InputStream is = socket.getInputStream();
		FileOutputStream os = new FileOutputStream("D:\\Details.txt");
		is.read(b, 0, b.length);
		os.write(b,0,b.length);
		os.flush();
		os.close();
		socket.close();
	}
	
}
