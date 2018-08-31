package tcp.filetransferusingtcp;

import java.net.*;
import java.io.*;

public class FileServer {
    public static void main( String[] args ) throws Exception {
        
    	ServerSocket serverSocket = new ServerSocket(4333);
    	System.out.println("Waiting for Connection");
    	Socket socket = serverSocket.accept();
    	System.out.println("Connected to "+socket.getInetAddress());
    	
    	FileInputStream inputStream = new FileInputStream("F:\\My Documents\\Bank Details.txt");
    	byte[] b = new byte[5000];
    	inputStream.read(b, 0, b.length);
    	OutputStream oStream = socket.getOutputStream();
    	oStream.write(b,0,b.length);
    	inputStream.close();
    	serverSocket.close();
    	
    }
}
