package Teste;

//import java.io.FileInputStream;
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sevidor {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    	ServerSocket socket = new ServerSocket(4211);
    	while(true) {    		
    		try {
    			System.out.println("Aguardando conectar");
    			Socket so = socket.accept();
    			ObjectInputStream input  = new ObjectInputStream(so.getInputStream());
    			if(input.readUTF()!=null) {
    				SycallTest linha = (SycallTest) input.readObject();	
    				System.out.println(linha.getServiceName());
    				ObjectOutputStream exit = new ObjectOutputStream(so.getOutputStream());
    				exit.writeObject(linha);
    				exit.reset();
    				exit.flush();
    			}
    			input.reset();
    			input.close();
    			socket.close();
    			
    		}catch(Exception e) {
    			System.out.println("que isso?");
    		}finally {
    			System.out.println("matou a rede");
    		}
    	}
    	
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
