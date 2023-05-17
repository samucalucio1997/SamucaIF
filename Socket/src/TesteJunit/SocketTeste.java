package TesteJunit;

//import static org.junit.jupiter.api.Assertions.*;

//import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
//import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import org.junit.jupiter.api.Test;

class SocketTeste {
    private Scanner ent;
    private Socket socket;
 	public SocketTeste() {}
 	
    
	public SocketTeste(Scanner ent,  Socket socket) {
		super();
		this.ent = ent;
		
		this.socket = socket;
	}


	List<String> testSocket(Scanner entra,  Socket socket) throws IOException, IOException {
		entra = this.ent;
		socket=this.socket;
		List<String> ger = new ArrayList<>();
		ObjectOutputStream dado = new ObjectOutputStream(socket.getOutputStream());
		ObjectInputStream volta = new ObjectInputStream(socket.getInputStream());
		if(entra.nextLine()=="add $7 $8 $4") {
			dado.writeUTF("add $7 $8 $4");
			ger.add(volta.readUTF());
			System.out.println(volta.readUTF());
			return ger;
		}
		return null;
	}

}
