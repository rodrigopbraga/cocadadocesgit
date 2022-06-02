package Socket;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    
    private ServerSocket serverSocket;
    
    private void criarServerSocket(int porta) throws IOException {
        serverSocket=new ServerSocket(porta);
    }

    private Socket aguardaConexao() throws IOException {
        Socket s=serverSocket.accept();
        return s;
    }
    
    private void fechaSocket(Socket s) throws IOException{
        s.close();
    }
    
    private void trataConexao(Socket s) throws IOException{
        try {
            ObjectOutputStream dos = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream dis = new ObjectInputStream(s.getInputStream());
            
            dis.close();
            dos.close();
        } catch (IOException iOException) {
        }finally{
            fechaSocket(s);
        }
        
    }
    
    public static void main(String args[]) throws Exception{
        Socket socket = null;
        try {
            Server server = new Server();
            server.criarServerSocket(5432);
            socket = server.aguardaConexao();
            
            server.trataConexao(socket);
        } catch (IOException iOException) {
            
        }
        
        
        
    }
}