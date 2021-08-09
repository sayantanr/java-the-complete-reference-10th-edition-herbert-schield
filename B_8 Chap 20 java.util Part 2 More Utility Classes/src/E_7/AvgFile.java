/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E_7;

/**
 *
 * @author henryubuntu
 */
// Use Scanner to compute an average of the values in a file. 
import java.util.*;
import java.io.*;

class AvgFile {

    public static void main(String args[])
            throws IOException {

        int count = 0;
        double sum = 0.0;

        // Write output to a file. 
        FileWriter fout = new FileWriter("test.txt");
        fout.write("2 3.4 5 6 7.4 9.1 10.5 done");
        fout.close();

        FileReader fin = new FileReader("Test.txt");

        Scanner src = new Scanner(fin);

        // Read and sum numbers. 
        while (src.hasNext()) {
            if (src.hasNextDouble()) {
                sum += src.nextDouble();
                count++;
            } else {
                String str = src.next();
                if (str.equals("done")) {
                    break;
                } else {
                    System.out.println("File format error.");
                    return;
                }
            }
        }

        src.close();
        System.out.println("Average is " + sum / count);
    }
}
