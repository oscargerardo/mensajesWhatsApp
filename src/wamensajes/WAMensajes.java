/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wamensajes;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
/**
 *
 * @author ogera
 */
public class WAMensajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int opcion =0;
        Scanner entrada = new Scanner(System.in);
         System.out.println("Introduce la opcion que deseas realizar");
        System.out.println("0 - Enviar mensaje WhatsApp");
        System.out.println("1 - Enviar imagen ");
        System.out.println("2 - Enviar video ");
        System.out.println("3 -  Enviar enlace");
        System.out.println("4 - Salir");
        EnviaMensaje mensaje = new EnviaMensaje();
       do{
           opcion = entrada.nextInt();
           switch (opcion){
                 case 0:
                     mensaje.enviarMensaje("Esto es una prueba","5546219932");
                       break;
                   case 1:
                       mensaje.enviarMensajeImagen("5546219932", "https://file-example.s3-accelerate.amazonaws.com/images/test.jpg");
                    break;
                   case 2:
                       mensaje.enviarVideo("5546219932","https://file-example.s3-accelerate.amazonaws.com/video/test.mp4");
                       break;
                   case 3:
                       mensaje.enviarSticker( "5546219932","https://file-example.s3.us-west-2.amazonaws.com/sticker/1.webp");
                       break;
                   default:
                       break;
           }
                 
       }while(opcion!=4);
    }
    
}
