/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virgo.hospital;

import DAL.SqlRepo;
import MODEL.Patient.Person;

/**
 *
 * @author Karlo
 */
public class VirgoHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p=new Person("Marko","El","Maric");
        SqlRepo s=new SqlRepo();
        System.out.println(s.insertPerson(p));
    }
    
}
