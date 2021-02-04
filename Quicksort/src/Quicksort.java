import java.util.*;
public class Quicksort 
{   
    int temp;
    static void sort(String a[],int first,int last)
    {
         	int pivot=first;
            int i=first,j;
            String temp;
            if(first<last)
            {
                for(j=first+1;j<=last;j++)
                {
                    if((a[pivot].compareTo(a[j]))>0)
                    {
                        i++;
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
                temp=a[pivot];
                a[pivot]=a[i];
                a[i]=temp;
                sort(a,first,i-1);
                sort(a,i+1,last);
            }
    }
    public static void main(String args[])
    {   
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of Names:");
        int n=scan.nextInt();
        String a[]=new String[n];
        System.out.println("Enter the array to be sorted:");
        for(int i=0;i<n;i++)
        {
            a[i]=scan.next();
        }
        scan.close();
        sort(a,0,n-1);
        System.out.println("Sorted array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}
