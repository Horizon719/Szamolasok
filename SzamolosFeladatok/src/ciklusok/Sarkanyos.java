package ciklusok;

public class Sarkanyos {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 21){
            x++;
            y = 0;
            while(y < 14){
                y++;
                if(7*x + 11*y == 145){
                    System.out.printf("7 * %d(x) + 11 * %d(y) = 145\n", x,y);
                }
            }
        }
    }
}
