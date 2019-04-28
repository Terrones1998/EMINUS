package clienteudp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClienteUDP {
    
    public static void main(String[] args) {
        try{
            InetAddress host = InetAddress.getByName("localhost");                
            InputStreamReader in = new InputStreamReader (System.in);
            BufferedReader buff = new BufferedReader (in);
            String mensaje;
            DatagramSocket  socket = new DatagramSocket(); 
            DatagramPacket paqueteMensaje;
            System.out.println("Para detener el envio de mensajes escriba \"finalizar\".");
            do{
                System.out.print("Cual es su mensaje?: ");
                mensaje = buff.readLine();
                paqueteMensaje = new DatagramPacket(mensaje.getBytes(), mensaje.getBytes().length,
                                 host, 9888);
                socket.send(paqueteMensaje);
            }while(!mensaje.equals("finalizar"));                
            socket.close( );
        }catch(Exception e){
            System.out.println(""+e.getMessage());
        }             
    }    
}
