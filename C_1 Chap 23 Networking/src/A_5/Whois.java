/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_5;

/**
 *
 * @author henryubuntu
 */
import java.net.*;
import java.io.*;

class Whois {
    public static void main(String[] args) throws Exception{
        int c;
        
        // Create a socket connected to internic.net, port 43.
        // Manage this socket with a try-with-resources.block.
        try (Socket s = new Socket("whois.internic.net", 43)) {

            // Obtain input and output streams.
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();

            // Construct a request string.
            String str = (args.length == 0 ? "OraclePressBooks.com" : args[0]) + "\n";

            // Convert to bytes.
            byte buf[] = str.getBytes();

            // Send request.
            out.write(buf);

            // Read and display response.
            while ((c = in.read()) != -1) {
                System.out.println((char) c);
            }
        }
    }
    // The socket is now closed.
}
