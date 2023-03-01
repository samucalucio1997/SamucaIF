package Teste;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketAddress;
 

public class proSock {
	public static void main(String[] args) throws IOException {
		Socket novo = new Socket("192.168.0.111",4422);
		FileOutputStream fos = new FileOutputStream("path do arquivo");
		ObjectOutputStream dado = new ObjectOutputStream(fos);
        dado.writeObject(new Object());//o object seria o syscalls
        dado.close();
        novo.close();
	   	}
	

	
}
