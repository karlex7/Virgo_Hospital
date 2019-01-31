package Console;

import java.util.Scanner;

/**
 *
 * @author Karlo
 */
public class Main {
    public static void start(){
        sectorToChose();
    }

    private static void sectorToChose() {
        System.out.println("Welcome to Virgo Hospital Managment System!\nSelect you sector:\n1. Reception\n2, Doctor\n3. Managment");
        Scanner in=new Scanner(System.in);
        String odabir=in.nextLine();
        switch(odabir){
            case "1":
                Reception r=new Reception();
                r.start();
                break;
            case "2":
                DoctorConsole d=new DoctorConsole();
                d.start();
                break;
            case "3":
                break;
            default:
                break;
        }
    }
}
