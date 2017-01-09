/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ORM;


import java.sql.Date;
import java.util.List;

/**
 *
 * @author Naciri
 * @param <obj>
 */
public interface Dic<obj> {

    /**
     *
     * @param o
     * @return
     */
    public int Add(obj o);
    public List FindAll();
    public obj FindById(int id);
    public List findBy(String field,String value);
       public List findBy(String field,Date value);
    public int Delete(int id);
    public int Update(obj o,int id);
  
    
    
}
