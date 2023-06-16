package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) {
        String url="https://api.zippopotam.us/us/33162";
        HttpRequest request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpClient client=HttpClient.newBuilder().build();
        try{
            HttpResponse<String> response=client.send(request,HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        }catch(IOException e){
            System.out.println(e);
        }catch(InterruptedException e){
            System.out.println(e);
        }



    }
}