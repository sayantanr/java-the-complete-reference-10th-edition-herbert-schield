/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_3;

/**
 *
 * @author henryubuntu
 */
// An object of this class is called when the  
// CyclicBarrier ends. 
class BarAction implements Runnable {

    public void run() {
        System.out.println("Barrier Reached!");
    }
}
