/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_2_mypack;

/**
 *
 * @author henryubuntu
 */
// A simple package

class Balance {

    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal < 0) {
            System.out.print("-->> ");
        }
        System.out.println(name + ": $" + bal);
    }
}
