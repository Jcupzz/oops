import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name: ");
        String name = bufferedReader.readLine();
        System.out.println("Your Name is: "+name);
    }
}
