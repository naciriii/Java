/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODELS.Student;
import ORM.Dic;
import ORM.Factory;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Naciri
 */
public final class StudentDao implements Dao<Student>{
   
    private final Dic orm;
    private List<Student>students=new ArrayList<>();
//dic dependency inversion
    public StudentDao(Dic orm) {
        this.orm=orm;
       students= FindAll();
    }

  
    

    @Override
    public int Add(Student o) {
        return orm.Add(o);
    }

    @Override
    public List FindAll() {
        students.clear();
        this.students=orm.FindAll();
       
        return this.students;
    }

    @Override
    public Student FindById(int id) {
        return (Student)orm.FindById(id);
        
    }

    @Override
    public List findBy(String field,String value) {
        students.clear();
        this.students=orm.findBy(field, value);
        return students;
    }

    @Override
    public int Delete(int id) {
return orm.Delete(id)  ;  }

    @Override
    public int Update(Student o,int id) {
      return orm.Update(o,id);  //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List findBy(String field, Date value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
