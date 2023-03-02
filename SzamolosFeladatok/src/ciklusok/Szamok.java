package ciklusok;

public class Szamok {
    public static void main(String[] args) {
        for (int k = 2; k < 5; k++) {
            for (int i = 2; i < 4; i++) {
                for (int j = 2; j < 5; j++) {
                    System.out.printf("%d%d%d\n", k,i,j);
                }
            }
        }
    }
}
