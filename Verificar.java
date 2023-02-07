package Principal;

public class Verificar {
	
	public Verificar() {
		
	}
    public String IsOp(String l) {
    	String[] ar=l.split("");
    	if(ar[0].equals("0") || ar[0].equals("1")||ar[0].equals("2")||ar[0].equals("3")||ar[0].equals("-")) {
    		String bin = trnaf(Integer.parseInt(l));
    		int k = bin.length();
    		String i; 
    		if(Integer.parseInt(l)>=0) {
    	      	  switch(k) {
    	      	  case 0:
    	      		  i="0000000000000000";
    	              return i;
    	      	
    	      	  case 1:
    	      		  i="000000000000000"+bin;
    	              return i;
    	      	
    	      	  case 2:
    	      		  i="00000000000000"+bin;
    	              return i; 
    	      	
    	      	  case 3:
    	      		  i="0000000000000" + bin;
    	              return i;

    	      	  case 4:
    	      		  i="000000000000" +bin;
    	              return i;

    	      	  case 5:
    	      		  i="00000000000"+bin;
    	               return i;
    	      		  
    	      	  case 6 :
    	      		  i="0000000000" + bin;
    	               return i;
    	      		  
    	      	  case 7:
    	      		  i="000000000"+bin;
    	               return i;
    	      		  
    	      		  
    	      	  case 8:
    	      		  i="00000000"+bin;
    	               return i;
    	      		  
    	      		  
    	      	  case 9:
    	      		  i="0000000"+bin;
    	               return i;
    	      		  
    	      		  
    	      	  case 10:
    	      		  i="000000"+bin;
    	              return i;
    	      	
    	      	  case 11:
    	      		  i="00000"+bin;
    	              return i;
    	      	
    	      	  case 12:
    	      		  i="0000"+bin;
    	              return i;
    	      	
    	      	  case 13:
    	      		  i="000"+bin;
    	              return i;
    	      	
    	      	  case 14:
    	      		  i="00"+bin;
    	              return i;
    	      	
    	      	  case 15:
    	      		  i="0"+bin;
    	              return i;
    	      		   		  
    	      	  default:
    	      		  i=bin;
    	      		  return i;	  
    	      	  }
    	        }else {if(Integer.parseInt(l)<0) {
    	        	
    	        	i=bin.substring(16, 32);
    	        	return i;
    	        }
    	        }
    	}
    	
    	if(l.equals("$0")) {
    		return "00000";
    	}
    	if(l.equals("$1")) {
    		return "00001";
    	}
    	if(l.equals("$2")) {
    		return "00010";
    	}
    	if(l.equals("$3")) {
    		return "00011";
    	}
    	if(l.equals("$4")) {
    		return "00100";
    	}
    	if(l.equals("$5")) {
    		return "00101";
    	}
    	if(l.equals("$6")) {
    		return "00110";
    	}
    	if(l.equals("$7")) {
    		return "00111";
    	}
    	if(l.equals("$8")) {
    		return "01000";
    	}
    	if(l.equals("$9")) {
    		return "01001";
    	}
    	if(l.equals("$10")) {
    		return "01010";
    	}
    	if(l.equals("$11")) {
    		return "01011";
    	}
    	if(l.equals("$12")) {
    		return "01100";
    	}
    	if(l.equals("$13")) {
    		return "01101";
    	}
    	if(l.equals("$14")) {
    		return "01110";
    	}
    	if(l.equals("$15")) {
    		return "01111";
    	}
    	if(l.equals("$16")) {
    		return "10000";
    	}
    	if(l.equals("$17")) {
    		return "10001";		
    	}
    	if(l.equals("$18")) {
    		return "10010";
    	}
    	if(l.equals("$19")) {
    		return "10011";
    	}
    	if(l.equals("$20")) {
    		return "10100";
    	}
    	if(l.equals("$21")) {
    		return "10101";
    	}
    	if(l.equals("$22")) {
    		return "10110";
    	}
    	if(l.equals("$23")) {
    		return "10111";
    	}
    	if(l.equals("$24")) {
    		return "11000";
    	}
    	if(l.equals("$25")) {
    		return "11001";
    	}
    	if(l.equals("$26")) {
    		return "11010";
    	}
    	if(l.equals("$27")) {
    		return "11011";
    	}
    	if(l.equals("$28")) {
    		return "11100";
    	}
    	if(l.equals("$29")) {
    		return "11101";
    	}
    	if(l.equals("$30")) {
    		return "11110";
    	}
    	if(l.equals("$31")) {
    		return "11111";
    	}
    	if(l.equals("SLT")) {
    		return "101010";
    	}
    	if(l.equals("or")) {
    		return "100101";
    	}
    	if(l.equals("nor")) {
    		return "100111";
    	}
    	if(l.equals("addi")) {
    		return "001000";
    	}
    	if(l.equals("andi")) {
    		return "001100";
    	}
    	if(l.equals("and")) {
    		return "100100";
    	}
    	if(l.equals("addiu")) {
    		return "001001";
    	}
    	if(l.equals("ori")) {
    		return "001101";
    	}
    	if(l.equals("add")) {
    		return "100000";
    	}
    	if(l.equals("sub")) {
    		return "100010";
    	}
    	if(l.equals("beq")) {
    		return "000100";
    	}
    	if(l.equals("bne")) {
    		return "000101";
    	}
    	else {
    		return "000000";
    	}
    }
    
    public String[] ret(String[] m) {
    	String[] vazio=new String[m.length];
    	
    		for(int c=0;c<m.length;c++) {
    			vazio[c]=IsOp(m[c]);
    		}
    	
    	return vazio;
    }
    
   public String Inst(String[] g) {//recebe a saída do metodo ret(String[] a)!!
	   if(g[0].equals("001000") || g[0].equals("000101")||g[0].equals("001110")||g[0].equals("001100")||g[0].equals("001101")||g[0].equals("000100")) {   
		   String i=g[0]+g[1]+g[2]+g[3];
		   return i;
	   }else {
		   String i = "000000"+g[2]+g[3]+g[1]+"00000"+g[0];
		   return i;
	   }
   }
   public String InstHex(String i) {
     return Integer.toString(Integer.parseInt(i, 2), 16);
	   
   }
   
   public String trnaf(int num) {
	   return Integer.toBinaryString(num);
   }
}
