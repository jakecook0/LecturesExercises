package chatbot;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ChatBotClient {
    public static void main(String[] args) throws IOException {
        ServerSocket sv = new ServerSocket(5555);
        BufferedReader br;
        BufferedWriter bw;
        Scanner scan;
        String incoming;
        Socket sock;
        String response, send;

        while(true) {
            sock = sv.accept();
            System.out.println("Connecting to server...");
//            sock = new Socket("locaclhost", 5555);  //can use localhost for local testing or another IP
            br = new BufferedReader(new InputStreamReader(sock.getInputStream()));  //read in message
            bw = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));    //send out message
            scan =  new Scanner(System.in);

            while (true) {
                response = br.readLine().trim();
                System.out.println("server said: " + response);
                System.out.println("> ");
                send = scan.nextLine();
                bw.write(send+ "\r\n");     //give writer the intended text
                bw.flush();     //clear out writer
            }

        }
    }
}
