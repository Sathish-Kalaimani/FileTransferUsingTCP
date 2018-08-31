package tcp.filetransferusingtcp;

import java.io.*;
import java.net.*;

public class FileClient {

	public static void main(String[] args) throws Exception{
		
		byte[] b = new byte[5000];
		Socket socket = new Socket("localhost", 4333);
		
		InputStream inputStream = socket.getInputStream();
		FileOutputStream oStream = new FileOutputStream("D:\\test.txt");
		inputStream.read(b, 0, b.length);
		oStream.write(b, 0, b.length);
		oStream.close();
		socket.close();
		
	}
	
}
