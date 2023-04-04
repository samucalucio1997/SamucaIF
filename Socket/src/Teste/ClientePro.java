package Teste;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;

public class ClientePro {
   public static void main(String[] args) {
	
   }
   SocketChannel Socketchannel() throws IOException {
	   SocketChannel socketChannel = SocketChannel.open();
	   SocketAddress Transp = new InetSocketAddress("",4422);
	   socketChannel.connect(Transp);
	return socketChannel;
   }
   void SendObject() {
	   
   }
   
}
