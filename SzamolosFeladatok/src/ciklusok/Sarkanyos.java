package ciklusok;

import java.util.Random;

public class Sarkanyos {
    public static void main(String[] args) {
        Random rnd = new Random();
        int x = 0;
        int y = 0;
        boolean mehet = true;
        while (mehet){
            x = rnd.nextInt(20-1+1)+1;
            y = rnd.nextInt(13-1+1)+1;
            System.out.printf("7 * %d + 11 * %d = 145\n", x,y);
            if(x< 21 && y<14 && (7*x + 11*y ==145)){
                mehet = false;
            }
        }
        
    }
}
