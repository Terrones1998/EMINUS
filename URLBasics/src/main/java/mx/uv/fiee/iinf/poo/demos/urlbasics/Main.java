package mx.uv.fiee.iinf.poo.demos.urlbasics;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.TextArea;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.Canvas;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Main extends JFrame {
    //static TextArea myText;
    static JPanel myimage;
    static JLabel mylabel;
    private static BufferedImage image;
    
    public Main () {
        setTitle ("HTTP URL Connection");
        setSize (new Dimension (800, 600));
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
              
        //myText = new TextArea ();
        myimage = new JPanel();
        mylabel= new JLabel();
       
        JScrollPane panel = new JScrollPane (mylabel);
        setContentPane (panel);
        //JScrollPane panel = new JScrollPane (myText);
        //setContentPane (panel);

        setVisible (true);
    }
    
    public static void main (String [] args) throws MalformedURLException, IOException {
        Main m = new Main ();
        URL url = new URL ("http://www.uv.mx:8080/usuarios.html?q=any&filename=book.pdf");
        
        System.out.println ("protocol = " + url.getProtocol ());
        System.out.println("authority = " + url.getAuthority ());
        System.out.println("host = " + url.getHost ());
        System.out.println("port = " + url.getPort ());
        System.out.println("path = " + url.getPath ());
        System.out.println("query = " + url.getQuery ());
        System.out.println("filename = " + url.getFile ());
        System.out.println("ref = " + url.getRef ());
        
        
        URL loremURL = new URL ("https://pbs.twimg.com/media/D4y8BOaW0AM74Gj.jpg");
        URLConnection urlConn = loremURL.openConnection ();
        HttpURLConnection httpUrlConn = (HttpURLConnection) urlConn;
        httpUrlConn.connect ();

        if (httpUrlConn.getResponseCode () == HttpURLConnection.HTTP_OK) {
            InputStream in = httpUrlConn.getInputStream (); //bytes crudos
            
            image = ImageIO.read(in);
            ImageIcon icono=new ImageIcon(image);
            in.close ();
            
            /*
            //lee los bytes y los convierte a su representación de caracter
            //InputStreamReader inputStreamReader = new InputStreamReader (in, "utf-8");
            //permite iterar sobre el conjunto completo de datos almacenados en el inputstreamreader
            BufferedReader buffReader = new BufferedReader (inputStreamReader); 
            
            String line;
            StringBuilder builder = new StringBuilder ();
            while ((line = buffReader.readLine ()) != null) {
                builder.append (line);
                builder.append ("\n");*/
            //}
            
            in.close ();
            //myText.setText (builder.toString ());
            mylabel.setIcon(icono);
          
        }
 
        httpUrlConn.disconnect ();
    }
   
    
}
