/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELS;

import java.sql.Date;



/**
 *
 * @author Naciri
 */
public class Student {
    private int id;

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", last_name=" + last_name + ", birth_date=" + birth_date + ", branch=" + branch + '}';
    }
     private String name;
      private String last_name;
       private Date birth_date;
       private String branch;
       
       public Student() {
           
       }

    public Student(int id, String name, String last_name, Date birth_date, String branch) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.branch = branch;
    }
      

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * @param last_name the last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * @return the birth_date
     */
    public Date getBirth_date() {
        return birth_date;
    }

    /**
     * @param birth_date the birth_date to set
     */
    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    /**
     * @return the branch
     */
    public String getBranch() {
        return branch;
    }

    /**
     * @param branch the branch to set
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }
    
}
