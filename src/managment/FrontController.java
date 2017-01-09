/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managment;

import ORM.Factory;

import VIEWS.Home;

/**
 *
 * @author Naciri
 */
public class FrontController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Factory orm=Factory.getFactory("mysql");
        
        Home s=new Home(orm);
        
    }
    
}
