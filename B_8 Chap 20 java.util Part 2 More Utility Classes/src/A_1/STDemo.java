/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_1;

/**
 *
 * @author henryubuntu
 */
// Demonstrate StringTokenizer.
import java.util.StringTokenizer;

class STDemo {

    static String in = "title=Java: The Complete Reference;"
            + "author=Schildt;"
            + "publisher=McGraw-Hill;"
            + "copyright=2014";

    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer(in, "=;");

        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}
