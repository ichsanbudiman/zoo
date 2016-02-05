/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mamalia;

/**
 *
 * @author Aryo
 */
public class Mamalia implements animal{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia mam = new Mamalia();
        
        mam.eat("spinace");
        mam.travel("run");
    }

    @Override
    public void eat(String eat) {
        System.out.println("now eat "+eat);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void travel(String travel) {
        System.out.println("now travel "+travel);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
