import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {
    public static void main(String[] args) {
        Server server = new Server();
    }

    public Server () {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;

        try {
            serverSocket = new ServerSocket(3443);
            System.out.println("Server is working...");
            clientSocket = serverSocket.accept();
            System.out.println("New client connected");

            Scanner in = new Scanner(clientSocket.getInputStream());

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        System.out.println("Server. Write your message...");
                        String msg = scanner.nextLine();
                        System.out.println("The message was send");
                        out.println(msg);
                    }
                }
            }).start();

            while(true) {
                String msg = in.nextLine();
                if(msg.equalsIgnoreCase("/end")) {
                    break;
                }
                System.out.println("Client: " + msg);
            }



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close();
                serverSocket.close();
                System.out.println("Server closed");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}