package Teste;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

 

public class proSock {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try {
		// Socket novo = new Socket("192.168.0.111",4211);
			Socket socket = new Socket("localhost", 45000);
			List<SycallTest> nmir = new ArrayList<>();
			// Criar o objeto a ser enviado
			SycallTest objetoParaEnviar = new SycallTest(45,"Tica");
			nmir.add(objetoParaEnviar);
			nmir.add(new SycallTest(72,"ipRandom"));
			nmir.add(new SycallTest(11,"krtrocks"));

					// Enviar o objeto para o servidor
			ObjectOutputStream objectOutput = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream objectInput = new ObjectInputStream(socket.getInputStream());
			for(SycallTest j:nmir) {
			objectOutput.writeObject(j);
			objectOutput.flush();
				// Receber a resposta do servidor
			SycallTest resposta = (SycallTest) objectInput.readObject();
			System.out.println(resposta.getServiceName()+ " " + resposta.getServiceNumber());
//			objectOutput.close();
//			objectInput.close();
			}
            socket.connect(new InetSocketAddress("localhost", 45000),5000);
			// Processar a resposta recebida ou fazer qualquer outra lógica desejada

			socket.close();

		}catch(SocketException e) {
			System.out.println(e.getMessage());
		}catch (IOException e){
			System.out.println("Erro na conexão com o servidor: " + e.getMessage());
		}

//		Scanner tec = new Scanner(new FileReader("C:\\Users\\Davi Lúcio\\Documents\\Samuca IFRN\\minop.txt"));
//		Scanner tec = new Scanner(System.in);
//		String entrada = tec.next();
//        dado.writeObject("C:\\Users\\Davi Lúcio\\Documents\\Samuca IFRN\\minop.txt");
        //o object seria o syscall
//		while(tec.hasNext()) {
//			System.out.println(tec.hasNext());
//			System.out.println(tec.nextLine());
//		}

		
//    		tec.close();
	   	}
	

	
}
