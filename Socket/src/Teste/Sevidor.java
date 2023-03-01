package Teste;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Sevidor {
    public static void main(String[] args) throws IOException {
		ServerSocket socket = new ServerSocket(4422);
		System.out.println("Conexão feita");
		Socket so = socket.accept();
		
	    DataInputStream input = new DataInputStream(so.getInputStream());
	    String men = input.readUTF();
	    DataOutputStream exit = new DataOutputStream(so.getOutputStream());
	    exit.writeUTF(men);
	    
	    exit.close();
	    input.close();
	    socket.close();
	}
}
