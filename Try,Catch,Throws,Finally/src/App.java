import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the array limit: ");
        int limit = scanner.nextInt();
        int arr[] = new int[limit];
        int sum=0;
        System.out.println("Enter the array: ");
        for(int i = 0;i<limit;i++)
        {
            arr[i] = scanner.nextInt();
            sum = sum+arr[i];
        }

        int avg = average(sum,limit);
        System.out.println("The average is: "+avg);
        
        
        try{
            int result = getMeTheDammTable(limit,arr);
            System.out.println("The Result is: "+result);
        }catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception!!! Denominator should not be zero(Second element you have selected cannot be zero)");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The Position you have selected is invalid!!!");
            System.out.println("Please select a position between numbers 1 and "+limit);
        }
        finally{
            System.out.println("This line is always printed...Don't mind it!!!");
        }

    }
    static int average(int sum,int limit){
        return (sum/limit);
    }
    static int getMeTheDammTable(int limit,int arr[]){
        System.out.println("Select the position of two desired numbers to be divided from below: ");
        System.out.println();
        System.out.print("##########");
        for(int i = 0 ; i <= limit;i++)
        {
            System.out.print("########");
        }
        System.out.println();
        System.out.print("|Position|");
        for(int i = 1;i <= limit; i++)
        {
            System.out.print("\t"+i);
        }
        System.out.print("\t"+"|");
        System.out.println();
        System.out.print("##########");
        for(int i = 0 ; i <= limit;i++)
        {
            System.out.print("########");
        }
        System.out.println();
        System.out.print("|Values  |");
        for(int j=0;j<limit;j++)
        {
            System.out.print("\t"+arr[j]);
        }
        System.out.print("\t"+"|");
        System.out.println();
        System.out.print("##########");
        for(int i = 0 ; i <= limit;i++)
        {
            System.out.print("########");
        }
        System.out.println();
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter position of any 2 element from above to divide: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int result = arr[(first-1)]/arr[(second-1)];
        return result; 
    }
}
