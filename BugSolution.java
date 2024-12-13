public class MyClass {
    private int x = 0;

    public void incrementX() {
        x++;
    }

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(); //Corrected: Creating a new object
        obj2.incrementX();
        System.out.println(obj1.getX()); // This will print 0
        System.out.println(obj2.getX()); // This will print 1
    }
}