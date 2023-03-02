package ciklusok;

import java.util.Scanner;

public class Szamok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ismetlessel vagy a nelkul irjuk ki? (i/n)");
        String be = sc.nextLine();
        int db = 0;
        for (int k = 2; k < 5; k++) {
            for (int i = 2; i < 5; i++) {
                for (int j = 2; j < 5; j++) {
                    if(be.charAt(0) != 'i' && (i==j || i==k || j==k)){
                        continue;
                    }
                    db++;
                    System.out.printf("%d%d%d\n", k,i,j);
                }
            }
        }
        System.out.printf("Permutaciok szama: %d\n", db);
    }
}
