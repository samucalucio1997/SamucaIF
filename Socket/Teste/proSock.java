package Teste;


import java.io.FileOutputStream;
//import java.io.FileOutputStream;
//import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;
//import java.util.Scanner;

 

public class proSock {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Socket novo = new Socket("192.168.0.111",4211);
		SycallTest nc = new SycallTest(10,"Exit");
		try {
			ObjectOutputStream dado = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Davi Lúcio\\Documents\\Samuca IFRN\\Testear.txt"));
			dado.writeObject(nc);
			dado.flush();
			dado.reset();
			ObjectInputStream volta = new ObjectInputStream(novo.getInputStream());
			SycallTest st = (SycallTest) volta.readObject();
			System.out.println(st.getServiceName() + " " + st.getServiceNumber());
			volta.reset();
			dado.close();			
		}catch(SocketException e) {
//			Socket novo = new Socket("192.168.0.111",4211);
			ObjectOutputStream dado = new ObjectOutputStream(novo.getOutputStream());
			dado.writeObject(new SycallTest(10,"Exit"));
			dado.flush();
			dado.reset();
			ObjectInputStream volta = new ObjectInputStream(novo.getInputStream());
			SycallTest st = (SycallTest) volta.readObject();
			System.out.println(st.getServiceName());
			volta.reset();
			novo.close();
			dado.close();	
			System.out.println("Deu bom?");
		}finally {
//			novo.close();
            System.out.println("NÃO!!!!!");			
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
