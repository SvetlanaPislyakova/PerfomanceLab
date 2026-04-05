package homework6;

public class Main {

    public static void main(String[] args) throws Exception {
        DemoExceptions demo = new DemoExceptions();
        //try-catch
        demo.divide(12, 2);
        demo.divide(10, 0);
        System.out.println();
        //try-catch-catch
        demo.getElement(demo.addArray(5), 3);
        demo.getElement(demo.addArray(5), 6);
        demo.getElement(null, 0);
        System.out.println();
        //multi catch
        demo.parseInt("123");
        demo.parseInt("hy");
        demo.parseInt(null);
        System.out.println();
        //try-catch-finally
        demo.printNumber();
    }
}
