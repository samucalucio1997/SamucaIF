package Teste;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sevidor {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    	ServerSocket socket = new ServerSocket(4211);
    	System.out.println("Aguardando conectar");
    	Socket so = socket.accept();
    	ObjectInputStream input  = new ObjectInputStream(new FileInputStream("C:\\Users\\Davi Lúcio\\Documents\\Samuca IFRN\\Testear.txt"));
    	SycallTest syscall = (SycallTest) input.readObject();
        ObjectOutputStream href = new ObjectOutputStream(so.getOutputStream());
        href.writeObject(syscall);
    	input.close();
        socket.close();
    	
//	    exit.close();
//    	while(true) {    		
//    		ServerSocket socket = new ServerSocket(4422);
//    		System.out.println("Conexão feita");
//    		Socket so = socket.accept();
//    		System.out.println("Cliente " + so.getInetAddress().getHostAddress() + " conectado.");
//    		
//    		DataInputStream input = new DataInputStream(so.getInputStream());
//    		int men = input.readInt();
//    		System.out.println(men);
//    		DataOutputStream exit = new DataOutputStream(so.getOutputStream());
//    		exit.write(men);
//    		
//    		input.close();
//    		exit.close();
//    		socket.close();
//    	}
	}
    
}
