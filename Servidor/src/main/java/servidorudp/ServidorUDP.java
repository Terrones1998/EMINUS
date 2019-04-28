package servidorudp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServidorUDP {
   
    public static void main(String[] args) {
        try{
            DatagramSocket socket = new DatagramSocket(9888);         
            String mensaje;
            byte mensajeBytes[] = new byte[10];         
            DatagramPacket paqueteMensaje = new DatagramPacket(mensajeBytes, 10); 
            System.out.println("Se detendra el socket cuando reciba la palabra \"finalizar\".");
            do{
                socket.receive(paqueteMensaje);              
                mensaje = new String(mensajeBytes);
                System.out.println("Mensaje recibido: "+mensaje);
            }while(!mensaje.contains("finalizar"));
            socket.close();
        }catch(Exception e){
            System.out.println(""+e.getMessage());
        }
    }   
}
