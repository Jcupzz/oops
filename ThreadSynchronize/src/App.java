public class App {
    public static void main(String[] args) {
        First fnew = new First();//1 sec
        Second s = new Second(fnew, "Welcome");
        Second s1 = new Second(fnew, " This is a ");
        Second s2 = new Second(fnew, "Synchronised program");
    }
}
class First {
    synchronized public void display(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }
 
}
class Second extends Thread {
    String msg;
    First obj;
    Second(First f, String str) {
        obj = f;
        msg = str;
        start();
    }
    public void run() {
        obj.display(msg);
    }
}
