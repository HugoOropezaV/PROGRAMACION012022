/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Disorder;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class Assignment8 {
    String phrase;
    String result;
    
    Assignment8(String input){
        phrase = input;
        result = Disorder(phrase);
    }
    
    public String toString() {
        return  result;
    }
    
    public String DisorderWord(String[] word){
        int limit = 2;
        if( word[word.length - 1].equals(".")  || word[word.length - 1].equals(",") ){
            limit = 3;
        }
        String word2 = "";
        for (int j = 0; j < word.length; j++){

            int value = (int) (Math.random()*(word.length - limit)) + 1;
            int value2 = (int) (Math.random()*(word.length - limit)) + 1;
            if (value >= word.length){
                continue;
            } 
            String aux = word[value2];
            word[value2] = word[value];
            word[value] = aux;

        }
        for (int j = 0; j < word.length; j++){   
            word2 += word[j];

        }
        return word2;
    
    }
    public String Disorder(String phrase){
        
        String[] words = phrase.split(" ");
        String[] words2 = new String[words.length];
        int i = 0;
        while(i < words.length){
            String[] word = words[i].split("");
            String word2 = DisorderWord(word);
            words2[i] = word2;
            i++;

        }
        String disorderedPhrase = "";
        for(int k = 0; k < words.length; k++){
            disorderedPhrase += words2[k] + " ";
            
        }
        
        return disorderedPhrase;
        
    }
}
