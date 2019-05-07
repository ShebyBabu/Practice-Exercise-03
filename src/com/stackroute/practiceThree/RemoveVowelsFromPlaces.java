package com.stackroute.practiceThree;

//4. Write a program to set up an array of places, Loop round and remove the vowels. Display the new
//words in console
//Input:
//India
//United States
//Germany
//Egypt
//czechoslovakia
//Output:
//Place Name without Vowels:0 Ind
//Place Name without Vowels:1 Untd SttsPlace Name without Vowels:2 Grmny
//Place Name without Vowels:3 Egypt
//Place Name without Vowels:4 czchslvk

import java.util.Scanner;

public class RemoveVowelsFromPlaces {

    public String[] inputPlaces()   {
        Scanner s=new Scanner(System.in);
    String[] places=new String[6];
    for(int i=0;i<6;i++)
    {
        places[i]=s.nextLine();
    }
    return places;
}


    public void removeVowels(String[] places)  {
        for(String word : places)
        {
            String removedVowelsPlaces=word.replaceAll("[AEIOUaeiou]","");
            System.out.println(removedVowelsPlaces);
        }

    }

    public static void main(String[] args) {
        RemoveVowelsFromPlaces vowels=new RemoveVowelsFromPlaces();
        String[] places=vowels.inputPlaces();
        vowels.removeVowels(places);

    }
}
