import java.util.Random;
 
public class App {
    public static void main(String[] args) throws Exception {
        First first = new First();
        first.start();
    }
}
 
class First extends Thread {
 
   
    public void run() {
        while (true) {
            try {
                int random = getMeRandom();
                Thread.sleep(1000);
                if(random%2==0)
                {
                    Second second = new Second(random);
                    second.start();
                }
                else{
                    Third third = new Third(random);
                    third.start();
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
 
    
 
    int getMeRandom() {
        Random random = new Random();
        int randomValue = random.nextInt(10);
        return randomValue;
    }
}
 
class Second extends Thread{
    int random;
    Second(int random){
        this.random = random;
    }
    public void run(){
        int squareOfNumbers = random*random;
        System.out.println("Square of number "+random+ " is "+squareOfNumbers);
    }
}
class Third extends Thread{
    int random;
    Third(int random){
        this.random = random;
    }
    public void run(){
        int cubeOfNumbers = random*random*random;
        System.out.println("Cube of "+random+" is "+cubeOfNumbers);
    }
}
