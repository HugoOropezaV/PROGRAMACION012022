/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WordRepeat;

/**
 *
 * @author Usuario
 */
public class ReapeatedWords {
    public static int GetBiggest(int... numberList){
        int max = numberList[0];
        for(int i = 0; i < numberList.length; i++){
            if (numberList[i] > max){
                max = numberList[i];
            }
        }
        return max;
    }
    
    public static String[] Repeated(String frase){
        String[] words = frase.split(" ");
        int wordNumber[] = new int[words.length];
        
        for (int i = 0; i < wordNumber.length; i++){
            wordNumber[i] = 0;
            words[i] = words[i].toLowerCase();
        }
        for(int j = 0; j < words.length;j++){
            for(int k = 0; k < words.length;k++){
                if (words[j].equals(words[k])){
                    wordNumber[j]+= 1;
                }
            }
        }
        int max = GetBiggest(wordNumber);
        int maxIndex = 0;
        for (int i = 0; i < wordNumber.length;i++){
            if(max == wordNumber[i]){
                maxIndex = i;
                break;
            }
        }
        String maxStr = ( max + "");
        String response[] = {
            words[maxIndex], maxStr
        };
        
        return response;
        
    }
    
}
