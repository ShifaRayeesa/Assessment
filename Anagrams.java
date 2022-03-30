package Assessment;

import java.util.Locale;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1,str2;
        System.out.println("Enter the two Strings");
        str1=sc.nextLine().toLowerCase();
        str2=sc.nextLine().toLowerCase();
        boolean bool=false;
        for(int i=0;i<str1.length();i++,bool=false)
        {
            for (int j = 0; j < str2.length(); j++)
            {
                if (str1.charAt(i) == str2.charAt(j)) {
                    bool = true;
                    continue;
                }
            }
            if(!bool)
            {
                System.out.println("Not an Anagram");
                return;
            }
        }
            System.out.println("The given strings are anagrams");
    }
}
