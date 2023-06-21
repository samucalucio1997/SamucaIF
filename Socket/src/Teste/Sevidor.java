package Teste;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sevidor {
    public static void main(String[] args) throws Exception {
    	try {
			ServerSocket socket = new ServerSocket(45000);
			System.out.println("Aguardando conexão...");
			while (true){

			Socket so = socket.accept();

			ObjectOutputStream objectOutput = new ObjectOutputStream(so.getOutputStream());
			ObjectInputStream objectInput = new ObjectInputStream(so.getInputStream());

			// Receber o objeto do cliente
			SycallTest objetoRecebido = (SycallTest) objectInput.readObject();
			// Processar o objeto recebido ou fazer qualquer outra lógica desejada

			// Enviar a resposta de volta para o cliente
			objectOutput.writeObject(objetoRecebido);
			objectOutput.flush();

			if(objetoRecebido!=null){
			objectOutput.close();
			objectInput.close();
			socket.close();
			so.close();
			break;
			}

			}
    	}catch(Exception e) {
    		throw e;
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
