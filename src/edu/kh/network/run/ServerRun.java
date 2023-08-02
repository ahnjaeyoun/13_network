package edu.kh.network.run;

import edu.kh.network.model.service.TCPServer;

public class ServerRun {
	public static void main(String[] args) {
		TCPServer tp = new TCPServer();
		tp.serverStart();
	}

}
