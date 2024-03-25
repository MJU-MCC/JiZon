package ThreeWeek.JongSeok.Chapter4;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


class Client { 
	public static int inPort = 9999;
	public static String address ="192.168.0.31";
    public static String line = null;
    public static String Name = "한종석";
    
 
    public static void main(String[] args) { 
        try (Socket socket = new Socket(address, inPort)) {
        	PrintWriter out = new PrintWriter(socket.getOutputStream(), true); 
  
        	ChatHandler c = new ChatHandler(socket);
        	Thread myThread = new Thread(c);
        	myThread.start();
        	Scanner sc = new Scanner(System.in);
            //int LineInt = Integer.parseInt(sc.nextLine());
            while (!"end".equalsIgnoreCase(line)) {
            	line = Name + sc.nextLine();
                out.println(line); 
                out.flush(); 
            } 
            sc.close();
        }
        catch (Exception e) {}
    }
        
}


