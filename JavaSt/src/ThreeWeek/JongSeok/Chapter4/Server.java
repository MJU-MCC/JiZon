package ThreeWeek.JongSeok.Chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;


class Server {
	public static int inPort = 9999;
	public static Vector<Client> clients = new Vector<Client>();
	
	public static void main(String[] args) throws Exception {
		new Server().createServer();
	}
	
	public void createServer() throws Exception {
	    ServerSocket server = new ServerSocket(inPort); 
        while (true) {
        	Socket socket = server.accept(); 
            Client c = new Client(socket);
            clients.add(c);
        }
	}
	
	public void sendtoall(String msg) { //숫자 비교해서 큰거 뿌리고
		for(Client c : clients) 
			c.send(msg);
	}
	
	
	class Client extends Thread {
		Socket socket; 
		PrintWriter out = null; 
		BufferedReader in = null; 
  
		public Client(Socket socket) throws Exception { 
            this.socket = socket;
            out = new PrintWriter(socket.getOutputStream(), true); 
            in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
            start();
		}
		
		public void send(String msg) {
			out.println(msg);
		}

		public String Compare(int a, int b){
			if (a > b){
				return "C1 WIN";
			}else if(a == b){
				return "RE";
			}else{
				return "C2 WIN";
			}
		}

        @Override
        public void run() {
        	String line;
			int a = 0;
			int b = 0;
            try {
            	while(true) {
            		line = in.readLine();
					a = Integer.parseInt(line);
					System.out.println(a); //서버한테만
					line = in.readLine();
					b = Integer.parseInt(line);
					System.out.println(b); //서버한테만
					String S = Compare(a,b);
					sendtoall(S);  //Client 한테
            		System.out.println("("+ socket.getInetAddress()+ ") " + S); //서버한테 보이게
                	//sendtoall(line);
            	}
            }
        	catch (IOException e) { } 
            finally {
            	try {
            		if (out != null)  
            			out.close(); 
            		if (in != null) {
            			in.close(); 
            			socket.close(); 
            		} 
            	}
            	catch (IOException e) { } 
            } 
        }
    
	}
    
} 
