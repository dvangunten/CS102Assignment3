package stringallunique;


public class StringAllUnique
{

    
    public static void main(String[] args)
    {
        String string = "Saba";    
        boolean stringCheck = true;
        
        for (int i = 0; i < string.length() - 1; i++) 
        {
            
            for (int j = i + 1; j < string.length(); j++) 
            {
               
                if (string.charAt(i) == string.charAt(j))
                {
                    stringCheck = false;
                }
            }        
        }
        
        
        String string2 = "John";    
        boolean string2Check = true;
        
        for (int i = 0; i < string2.length() - 1; i++) 
        {
            
            for (int j = i + 1; j < string2.length(); j++) 
            {
               
                if (string2.charAt(i) == string2.charAt(j))
                {
                    string2Check = false;
                }
            }        
        }
        System.out.println("String 'Saba' contains only unique characters: " + stringCheck);
        System.out.println("String 'John' contains only unique characters: " + string2Check);
        
        
        
    }
                    
}