import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
        int t=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter xyz : ");
        int count = sc.nextInt();
        Random rn = new Random();
        // minimum keys :
        int min =10;
        // maximum keys :
        int max = 18;
        while (count > 0){
        int d =0;
        int answer = rn.nextInt((max - min) + 1) + min;    
        Robot robot = new Robot(); 
        for (int i = 0; i < answer; i++) {
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyRelease(KeyEvent.VK_DOWN);
            d++;
        }
        System.out.println("Pressed: "+ d);
        Thread.sleep(60000);  
            t= t+1;
            count = count -1;
            System.out.println("xyz passed: " +t);
        }   
      } 
    }


    // VK_CONTROL