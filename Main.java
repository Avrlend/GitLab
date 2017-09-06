package lab1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
		Scanner s = new Scanner(System.in);
        KompGameCollection collection = new KompGameCollection();
        int menu, index;
        do {
            System.out.println("Select action: ");
            System.out.println("1 - add element");
            System.out.println("2 - update element");
            System.out.println("3 - delete element");
            System.out.println("4 - print all elements");
            System.out.println("0 - exit");
            menu = s.nextInt();
            try {
                switch (menu) {
                    case 1:
                        collection.add();
                        break;
                    case 2:
                        System.out.print("Input index: ");
                        index = s.nextInt();
                        collection.update(index);
                        break;
                    case 3:
                        System.out.print("Input index: ");
                        index = s.nextInt();
                        collection.delete(index);
                        break;
                    case 4:
                        collection.print();
                        break;
                    case 0:
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
            catch (UnsupportedOperationException exception) {
                System.out.println("Unsupported operation");
            }
        }
        while (menu != 0);

	}

}
