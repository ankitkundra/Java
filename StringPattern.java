import java.util.*; 
  
class StringPattern 
{ 
static void steps(String str, int n) 
{ 
    boolean flag = false; 
    int x = 0;
    for (int i = 0; i < str.length(); i++) { 
        if (x == 0) 
        flag = true; 
  
        if (x == n - 1) 
        flag = false; 
        
        for (int j = 0; j < x; j++) 
            System.out.print("*"); 
  
        System.out.print(str.charAt(i)+"\n"); 
        
        if (flag == true) 
            x++; 
        else
            x--; 
    } 
} 
  
public static void main(String args[]) 
{ 
  
    // Get the String and the number n 
    int n = 5; 
    String str = "Helloprintanything"; 
  
    System.out.println("String: "+str); 
    System.out.println("Max Length of Steps: "+n); 
  
    // calling the function 
    steps(str, n); 
  
}  
} 