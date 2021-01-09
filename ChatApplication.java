package server;

import java.io.IOException;
import java.net.ServerSocket;

import lib.Action;
import lib.Connection;
import lib.Message;

public class ChatApplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ServerSocket serverConnection = new ServerSocket(7777);
		Connection con = new Connection(serverConnection.accept());
		
		System.out.println("Client sends: " + con.fetch());
		
//		con.send( new Message("Hello back!!") );
//		con.send( new Action("CONFIRMED") );
		
	}

}
