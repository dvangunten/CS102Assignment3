
package PalindromeString;


public class PalindromeString 
{

  
    public static void main(String[] args) 
    {
        String myString = "madam";
        String myString2 = "test";
        boolean isMyString = true;
        boolean isMyString2 = true;
        
        for(int i = 0; i < myString.length() / 2; i++)
        {    
            if(myString.charAt(i) != myString.charAt(myString.length() - i - 1))
            {
                isMyString = false;
            }
            
            
        }
        
        for(int i = 0; i < myString2.length() / 2; i++)
        {    
            if(myString2.charAt(i) != myString2.charAt(myString2.length() - i - 1))
            {
                isMyString2 = false;
            }
        }
        
        System.out.println("madam is a palindrome: " + isMyString);
        System.out.println("test is a palindrome: " + isMyString2);
        
    }
    
}
