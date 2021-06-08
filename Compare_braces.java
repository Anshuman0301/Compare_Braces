package JavaCodes;

import java.util.Scanner;

public class Compare_braces
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string....");
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        int n = s.length();
        int count = 0;

        if (n%2 != 0)
            System.out.print("false");


        else
            {
            for (int i = 0; i < n / 2; i++)
            {
                if (arr[i] == arr[n - 1 - i])
                   count=  count + 1 ;
            }
            }
        System.out.print(".....");

    if (count == n/2)
            System.out.print("true");

        else
        System.out.print("false");


    }
}


