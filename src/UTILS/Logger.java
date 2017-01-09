/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTILS;

import javax.swing.JOptionPane;

/**
 *
 * @author Naciri
 */
public class Logger {
    
    public static void getMessage(String message,String type){
        switch(type){
            case "error":
                 JOptionPane.showMessageDialog(null, message,type,JOptionPane.ERROR_MESSAGE); 

                break;
                
            case "success":
                                 
  JOptionPane.showMessageDialog(null, message,type,JOptionPane.INFORMATION_MESSAGE); 
                break;
                
            case "information":
                            
 JOptionPane.showMessageDialog(null, message,type,JOptionPane.INFORMATION_MESSAGE); 
                break;
                        case "warning":
                            
 JOptionPane.showMessageDialog(null, message,type,JOptionPane.WARNING_MESSAGE); 
                break;
                  default:
 JOptionPane.showMessageDialog(null, message,type,JOptionPane.PLAIN_MESSAGE); 

                      
        }
      
        
        
    }
    
}
