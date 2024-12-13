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
        MyClass obj2 = obj1; 
        obj2.incrementX();
        System.out.println(obj1.getX()); //This will print 1, not 0
    }
}