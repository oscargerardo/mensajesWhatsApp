/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wamensajes;
        
import java.io.IOException;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

        


/**
 *
 * @author ogera
 */
public class EnviaMensaje {

    public void enviarMensaje (String mensaje, String numero) throws IOException{
         OkHttpClient client = new OkHttpClient();
        RequestBody body = new FormBody.Builder() 
			.add("token", "rbidasityo0lryiu")
			.add("to", numero)
			.add("body", mensaje)
            .build();
    Request request = new Request.Builder()
  .url("https://api.ultramsg.com/instance43017/messages/chat")
  .post(body)
  .addHeader("content-type", "application/x-www-form-urlencoded")
  .build();

    Response response = client.newCall(request).execute();
 
    System.out.println(response.body().string());
    }
    
    
    public void enviarMensajeImagen( String numero, String imagen) throws IOException{
          OkHttpClient client = new OkHttpClient();
           RequestBody body = new FormBody.Builder() 
			.add("token", "rbidasityo0lryiu")
			.add("to", numero)
			.add("image", imagen)
			.add("caption", "image Caption")


            .build();

    Request request = new Request.Builder()
            .url("https://api.ultramsg.com/instance43017/messages/image")
            .post(body)
            .addHeader("content-type", "application/x-www-form-urlencoded")
            .build();

Response response = client.newCall(request).execute();
 
 System.out.println(response.body().string());
    }
    
    public void enviarVideo(String numero, String video) throws IOException{
        OkHttpClient client = new OkHttpClient();
RequestBody body = new FormBody.Builder() 
			.add("token", "rbidasityo0lryiu")
			.add("to", numero)
			.add("video", video)
			.add("caption", "video Caption")


            .build();

Request request = new Request.Builder()
  .url("https://api.ultramsg.com/instance43017/messages/video")
  .post(body)
  .addHeader("content-type", "application/x-www-form-urlencoded")
  .build();

Response response = client.newCall(request).execute();
 
 System.out.println(response.body().string());
    }
    
    public void enviarSticker(String numero, String sticker) throws IOException{
        OkHttpClient client = new OkHttpClient();
RequestBody body = new FormBody.Builder() 
			.add("token", "rbidasityo0lryiu")
			.add("to", numero)
			.add("sticker", sticker)


            .build();

Request request = new Request.Builder()
  .url("https://api.ultramsg.com/instance43017/messages/sticker")
  .post(body)
  .addHeader("content-type", "application/x-www-form-urlencoded")
  .build();

Response response = client.newCall(request).execute();
 
 System.out.println(response.body().string());
    }
}
