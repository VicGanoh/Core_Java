package networking_;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.Date;

public class URLConnection_ {
    public static void main(String[] args) throws MalformedURLException, IOException {

        URL url = new URL("http://www.google.com");

//        System.out.println("Path: " + url.getPath());
//        System.out.println("FileName: " + url.getFile());
//        System.out.println("Host: " + url.getHost());
//        System.out.println("Protocol: " + url.getProtocol());
//        System.out.println("Default Port: " + url.getDefaultPort());
//        System.out.println("Port: " + url.getPort());
//        System.out.println("Authority: " + url.getAuthority());
//        System.out.println("Query : " + url.getQuery());

        URLConnection urlConnection = url.openConnection();

        //get date
        long d = urlConnection.getDate();
        if (d == 0 ){
            System.out.println("No date information.");
        }
        else {
            System.out.println("Date: " + new Date(d));
        }

        // get content type
        System.out.println("Content type: " + urlConnection.getContent());

        //get expiration date
        d = urlConnection.getExpiration();
        if (d == 0 ){
            System.out.println("No expiration information.");
        }
        else {
            System.out.println("Expires : " + new Date(d));
        }

        //get last modified date
        d = urlConnection.getLastModified();
        if (d == 0 ){
            System.out.println("No last-modified information.");
        }
        else {
            System.out.println("Last-Modified: " + new Date(d));
        }

        //get content length
       long content_length = urlConnection.getContentLength();
        if (content_length == -1){
            System.out.println("Content length unavailable");
        }
        else {
            System.out.println("Content length: " + content_length);
        }
        if (content_length != 0){
            InputStream inputStream = urlConnection.getInputStream();
            long c;
            System.out.println("<<<<<Content>>>>>");
            while ((c = inputStream.read()) != -1){
                System.out.print((char) c);
            }
            inputStream.close();
        }
        else{
            System.out.println("No available content");
        }

    }
}
