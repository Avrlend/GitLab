package lab1;

import java.util.Scanner;

class KompGameFactory {
    public static KompGame create() {
        Scanner scanner = new Scanner(System.in);
        KompGame newKompGame = null;
        newKompGame = new KompGame();                  
        try {
            newKompGame.scans(scanner);
        }
        catch (IllegalArgumentException exception) {
            System.out.println("Unknown game");
            return null;
        }
        return newKompGame;
    }
}