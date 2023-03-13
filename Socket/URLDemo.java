package Socket;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.javatpoint.com");
            System.out.println("Protocol : "+url.getProtocol());
            System.out.println("Host Name : "+url.getHost());
            System.out.println("Port : "+url.getPort());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
