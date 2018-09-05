package tcp.filetransferusingtcp;

import java.net.*;

public class FileServer {
	
	static ServerSocket serverSocket = null;
	
    public static void main( String[] args ) throws Exception {
        
    	serverSocket = new ServerSocket(4333);
    	System.out.println("listening");
    	try {
    		while(true) {
    			Socket socket = serverSocket.accept();
    			System.out.println(socket.getInetAddress()+" has connected to the Server");
    			ClientHandler cHandler = new ClientHandler(socket);
    			cHandler.start();
    		}
    	}catch(Exception e) {
    		
    	}
    }
}
