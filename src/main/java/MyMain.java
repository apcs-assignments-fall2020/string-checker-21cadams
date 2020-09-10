import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int total=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                total++;
            }else if (str.charAt(i) == 'b'){
                total++;
            }else if (str.charAt(i) == 'c'){
                total++;
            
            }
        }
        System.out.println("Your string contains "+ total +" a's, b's, or c's");
        return total;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        String str2= str.toLowerCase();
        int idx1=str2.indexOf("the"); 
        if (idx1>-1){
            System.out.println("Your string DOES contain the");
            return true;
        }else{
            System.out.println("Your string DOES NOT contain the");
            return false;
        }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String backwards="";
        for (int i = str.length()-1; i>=0 ; i--) {
            backwards=backwards+str.charAt(i);
        }
        if (str.equals(backwards)){
            System.out.println("Your string IS a palindrome");
            return true;
        }else{
            System.out.println("Your string IS NOT a palindrome");
            return false;
        }

    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        String userstring = scan.nextLine();
        countABC(userstring);
        containsThe(userstring);
        isPalindrome(userstring);

        // YOUR CODE HERE
    }
}
