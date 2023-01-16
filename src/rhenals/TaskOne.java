/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rhenals;

import java.util.Scanner;

/**
 *
 * @author Adonay
 */

/*Write a program reading integers until zero is entered and printing the length of the
longest sequence of consecutive numbers of the same value (and this value).
Not using arrays, strings or any other kind of collections.*/

public class TaskOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int valueOfInputMaxSeq = 0, currentSeqLength=1, maxSeqLength = 1;
        int currentInput, lastValue;
       
    
        currentInput= scanner.nextInt();
       
        while (currentInput!= 0) {
             lastValue = currentInput;
            currentInput= scanner.nextInt();
            if(lastValue == currentInput){
            currentSeqLength++;
            }else{
            currentSeqLength =1;
           } 
            if(currentSeqLength > maxSeqLength){
                maxSeqLength = currentSeqLength;
                valueOfInputMaxSeq = currentInput;
           }
   
    }
        
      
       System.out.println("Longest sequence: " + maxSeqLength + " times " + valueOfInputMaxSeq);
        
}

}
