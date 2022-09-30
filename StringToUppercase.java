
package stringtouppercase;

public class StringToUppercase 
{

    
    public static void main(String[] args) 
    {
       
       String lowerCase = "hello everyone. let's write some useful java code today. we will begin with strings.";
       lowerCase = " " + lowerCase;
       String upperCase = "";
       int i;
       
       
       for(i = 0; i < lowerCase.length();)
       {
            char space = lowerCase.charAt(i);
            
            if(space == ' ')
            {
                upperCase = upperCase + ' ' + Character.toUpperCase(lowerCase.charAt(i + 1));
                i = i + 2;
            }
            else
            {
                upperCase = upperCase + space;
                i++;
            }
       }
       
       System.out.println("Lower Case String: " + lowerCase);
       System.out.println("Upper Case String: " + upperCase);
        
    }
    
}
