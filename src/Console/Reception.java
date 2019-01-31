package Console;

import java.util.Scanner;

/**
 *
 * @author Karlo
 */
public class Reception {
   public void start(){
        System.out.println("\nWelcome on Reception!");
        System.out.println("\nSelect your choice:\n1. Mini Registration Form\n2. Comprehensive Registration Form");
        Scanner in=new Scanner(System.in);
        String odabir=in.nextLine();
        switch(odabir){
            case "1":
                MiniRegFormConsole miniRegFormConsole=new MiniRegFormConsole();
                miniRegFormConsole.insertMiniRegForm();
                break;
            case "2":
                ComprehensiveRegFormConsole comprehensiveRegFormConsole=new ComprehensiveRegFormConsole();
                comprehensiveRegFormConsole.insertComprehensiveRegForm();
                break;
            default:
                break;
        }
        
    }
    

    
    
}

