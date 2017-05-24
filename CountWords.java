/*S.McDonald 12/3/2016
CountWords.java
This program counts the words in a String entered by the user.
*/


import javax.swing.*; //import javax.swing.*
public class CountWords
{
   public static void main(String[] args)
   {
      //declare
      String userString; //used to hold the input from user
      int numWords = 1; //numWords is assigned a value of 1 to start

      //input
      userString = JOptionPane.showInputDialog(null, "Please enter a sentence."); //receive a string from user and store in userString
      
      //declare strLength
      int strLength = userString.length();
      
      //processing
      for(int i = 0; i < strLength; i++)
      {
         if(userString.charAt(i) == ' ' && userString.charAt(i+1) != ' ') //determine whether or not user input counts towards being a word
            numWords++; //if it does, add it to the numWords variable
            
      }//for loop
      
      //output
      System.out.println("The number of words in your sentence is: " + numWords);
   
   }//main method

}//class