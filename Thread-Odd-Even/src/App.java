public class App {
    public static void main(String[] args) throws Exception {
        First first = new First();
        Second second = new Second();
        first.start();//higher priority
        second.start();
    }
}
class First extends Thread{
    int i;
    public void run(){
        for(i = 2 ;;i=i+2)
        {
                System.out.println("Even Thread: "+i);
        }
    }
}
class Second extends Thread{
    int i;
    public void run(){
        for(i = 1 ;;i=i+2)
        {
                System.out.println("Odd Thread: "+i);
        }
    }
}
