package virgo.hospital;

import GUI.StartFrame;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
        try {
            int switcher = readFromFile();
            switch(switcher) {
                case 1:
                    Console.Main.start();
                    break;
                case 2:
                    StartFrame sf=new StartFrame();
                    sf.setVisible(true);
                    break;
                
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
    private static int readFromFile() {
        try (Scanner s = new Scanner(new File("init.txt"))){
            return s.nextInt();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return 2;
    }
    
}
