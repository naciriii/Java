/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ORM.Mysql;

import MODELS.Student;
import ORM.Dic;
import ORM.MysqlFactory;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Naciri
 */
public  class StudentOrm extends MysqlFactory implements Dic<Student>{
  
  

     
    
public StudentOrm(){
   con= MysqlFactory.getInstance();
}
    
  

    @Override
    public int Add(Student o) {
    
               try {
           //ajouter un nouveau produit dans la base de données
           
           PreparedStatement stmt=con.prepareStatement("INSERT INTO `student_managment`.`students`(`id`, `name`, `last_name`,"
                   +"`birth_date`,`branch`) VALUES (?,?,?,?,?);");
           
           stmt.setInt(1, o.getId());
           stmt.setString(2, o.getName());
           stmt.setString(3, o.getLast_name());
           stmt.setDate(4, o.getBirth_date());
           stmt.setString(5,o.getBranch());
           //res va retourner 1  si le produit a été ajouté et 0 sinon
           int res = stmt.executeUpdate();
           
           
           
           return res;
       } catch (SQLException ex) {
      
           System.out.println(ex.getErrorCode());
           if(ex.getErrorCode()==1062) {
               return 100;
           }
           
       }
       return 0;
            
        
    }

    @Override
    public List FindAll() {
        
     List<Student> students=new ArrayList<>();
         try{
            Statement stmt=con.createStatement();
           
       ResultSet res = stmt.executeQuery("SELECT * FROM `students`");
       
       
       while (res.next()) {
          students.add(new Student(res.getInt(1),res.getString(2),res.getString(3),res.getDate(4),res.getString(5)));
       }
       return students;
            } catch(SQLException e) {
                
            
                System.out.println(e.getStackTrace());
                
                
            }
         catch(Exception e){
             System.out.println(e.toString());
             
         }
            return students;
        
    }

    @Override
    public Student FindById(int id) {
Student student=new Student();
         try{
            PreparedStatement stmt=con.prepareStatement("SELECT * FROM `students` where id=?");
           stmt.setInt(0, id);
       ResultSet res = stmt.executeQuery();
       
  
       while (res.next()) {
          student=new Student(res.getInt(1),res.getString(2),res.getString(3),res.getDate(4),res.getString(5));
       }
       return student;
            } catch(Exception e) {
                
            }
            return student;
            }

    @Override
    public List findBy(String field,String value) {
           List<Student> students=new ArrayList<>();
         try{
            Statement stmt=con.createStatement();
           
       ResultSet res = stmt.executeQuery("SELECT * FROM `students` where"+field+"="+value+"");
       
       students.clear();
       while (res.next()) {
          students.add(new Student(res.getInt(1),res.getString(2),res.getString(3),res.getDate(4),res.getString(5)));
       }
       return students;
            } catch(Exception e) {
                
            }
            return students;
        
    }

    @Override
    public int Delete(int id) {
        int res=0;
        try{
        PreparedStatement stmt=con.prepareStatement("DELETE  FROM `students` WHERE id= ?");
        
         stmt.setInt(1,id);
         
       res = stmt.executeUpdate();
       return res;    } catch(Exception e){
           
       }
        return res;
    }


    @Override
    public int Update(Student o, int id) {
            int res=0;
            PreparedStatement stmt;
        try {
            stmt = con.prepareStatement("Update `student_managment`.`students` set `id`=?, `name`=?, `last_name`=?,"
                    +"`birth_date`=?,`branch`=? where `id`=?");
            stmt.setInt(1, o.getId());
           stmt.setString(2, o.getName());
           stmt.setString(3, o.getLast_name());
           stmt.setDate(4, o.getBirth_date());
           stmt.setString(5,o.getBranch());
              stmt.setInt(6,id);
           //res va retourner 1  si le produit a été ajouté et 0 sinon
            res = stmt.executeUpdate();
           
        } catch (SQLException ex) {
            
            
        }
           
           
           
           
           
           return res;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List findBy(String field, Date value) {
  List<Student> students=new ArrayList<>();
         try{
            Statement stmt=con.createStatement();
           
       ResultSet res = stmt.executeQuery("SELECT * FROM `students` where"+field+"="+value+"");
       
       students.clear();
       while (res.next()) {
          students.add(new Student(res.getInt(1),res.getString(2),res.getString(3),res.getDate(4),res.getString(5)));
       }
       return students;
            } catch(Exception e) {
                
            }
            return students;
            }

  

 
    
}
