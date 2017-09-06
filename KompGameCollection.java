package lab1;

public class KompGameCollection {
    KompGame[] kpgame;
    private int count;
    
    public int getCount() {
        return count;
    }
    public KompGameCollection() {
        count = 0;
        kpgame = new KompGame[100];
    }
    public KompGameCollection(int capacity) {
        try {
            count = 0;
            kpgame = new KompGame[capacity];
        }
        catch (NegativeArraySizeException exception) {
            System.out.println("Collection size must be greater than 0");
            System.exit(1);
        }
    }
    protected void checkIndex(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= count)
            throw new ArrayIndexOutOfBoundsException("Element with index "+index+" doesn't exist");
    }
    public KompGame get(int index) { 
        try {
            checkIndex(index);
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
            return null;
        }
        return kpgame[index];
    }
    public void update(int index, KompGame newElement) {
        try {
            checkIndex(index);
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
            return;
        }
        kpgame[index] = newElement;
    }
    public void update(int index) {
        try {
            checkIndex(index);
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
            return;
        }
        KompGame newElement;
        try {
            newElement = KompGameFactory.create();
            if (newElement == null) throw new NullPointerException();
        }
        catch (NullPointerException exception) {
            System.out.println("Element wasn't modified");
            return;
        }
        kpgame[index] = newElement;
    }
    public void add(KompGame newElement) {
        try {
        	kpgame[count++] = newElement;
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Collection is full");
            return;
        }
        System.out.println("New element add");
    }
    public void add() {
        try {
            if ((kpgame[count] = KompGameFactory.create()) != null) count++;
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Collection is full");
            return;
        }
        System.out.println("New element add");
    }
    public void delete(int index) {
        try {
            checkIndex(index);
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
            return;
        }
        for (int i = index; i < count-1; i++)
        	kpgame[i] = kpgame[i+1];
        kpgame[--count] = null;
        System.out.println("Element delete");
    }
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(i);
            kpgame[i].print();
        }
    }
}
