/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PrjClasses {
    
    private static Students s = new Students();

    public static void main(String[] args) {
        
        String strName = JOptionPane.showInputDialog(null, "Please enter student name");
        String strCourse = JOptionPane.showInputDialog(null, "Please enter student course");
        double dblAvg = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter student average result"));
        
        s. setName(strName);
        s. setCourse(strCourse);
        s. setAverage(dblAvg);
        print();
    }
    
    public static void print()
    {
        String strDisplay = "The updated student average results are:" + "\n" + 
                             "STUDENT: " + s.getName() + "\n" + "COURSE: " + 
                              s.getCourse() + s.getCourse() + "\n" + "UPDATED AVERAGE: "
                              + s.getAverage() + "";
        
        JOptionPane.showMessageDialog(null, strDisplay);
    }        
}
