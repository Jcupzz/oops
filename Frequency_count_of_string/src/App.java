import java.util.Scanner;
 
public class App {
    public static void main(String[] args) throws Exception {
        
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = scanner.nextLine();
        int len = string.length();
        // System.out.println(string.length());
        for(int i = 0 ; i<len;i++)
        {
           int freq = getFrequency(i,len,string);
           System.out.println("The letter "+string.charAt(i)+" in "+string+" occured "+ freq+ " times");
        }
    }
 
    static int getFrequency(int i, int len,String string) {
        int freq = 0;
        for(int j = 0 ; j < len ; j++){
            if(string.charAt(i)==string.charAt(j)){
                 freq++;
            }
        }
        return freq;
    }
}
