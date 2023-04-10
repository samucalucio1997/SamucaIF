package Teste;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;

public class Servidor2 {
	
 public static void main(String[] args) throws IOException, ClassNotFoundException {
	 Servidor2 server = new Servidor2();
	 server.recebeObj();
}
 private java.nio.channels.SocketChannel SocketChannel=null;
 void recebeObj() throws IOException, ClassNotFoundException {
	 SocketChannel = SocketChannel();
	 ObjectInputStream obj = new ObjectInputStream(SocketChannel.socket().getInputStream());
	 //agora o Syscalls(Objeto) receberá o retorno do metodo read(). Para isso, a instancia obj chama o método readObject()
	 String novo = (String) obj.readObject();
	 System.out.println("Olha aí" + novo);
 }
 
 private java.nio.channels.SocketChannel SocketChannel() throws IOException {
	ServerSocketChannel serverSo = ServerSocketChannel.open();
	serverSo.socket().bind(new InetSocketAddress(4422));
	SocketChannel= serverSo.accept();
	System.out.println("Conectou com " + SocketChannel.getRemoteAddress());
	return null;
 }
}
