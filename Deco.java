package Principal;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Deco {
  public static void main(String[] args) throws IOException {
	Scanner texto = new Scanner(new FileReader("C:\\Users\\Davi Lúcio\\Documents\\Samuca IFRN\\logs.txt"))
			.useDelimiter("//n");
	Verificar ver = new Verificar();
	System.out.println("v2.0 raw\n");
//	BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Davi Lúcio\\Documents\\Samuca IFRN\\logs.txt"));
//	bw.append("v2.0 raw \n" + "\n");
	while(texto.hasNext()) {
		String[] a= texto.nextLine().split(" ");
	    String[] b=ver.ret(a);
//	    for(String f:b) { tudo ok aqui!!
//	    	System.out.println(f);
//	    }
	    String instrucao = ver.Inst(b);
	    System.out.println(instrucao);
	    String InHexa = ver.InstHex(instrucao);
//	    System.out.println(InHexa);
//	    bw.append(InHexa + "\n");
	    }
	
//	bw.close();
         	
     
  }
}
