/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ORM;

/**
 *
 * @author Naciri
 */
public abstract class Factory {
    
    /**
     *
     * @param factory
     * @return
     */
    public static final Factory getFactory(String factory) {
       //get the factory
       Factory f=null;
       switch(factory) {
           case "mysql":
                f= new MysqlFactory();
               break;
              
           case "oracle":
               f=new OracleFactory();
               break;
       }
       return f;
       
   }
   public abstract Dic getOrm(String orm);
    
}
