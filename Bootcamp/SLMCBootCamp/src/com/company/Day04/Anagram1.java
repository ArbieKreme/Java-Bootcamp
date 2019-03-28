package com.company.Day04;

public class Anagram1 {

    public void isAnagram(String subject, String anagram){
        subject = normalizedString(subject);
        anagram = normalizedString(anagram);

        char[] subjectCharacters = subject.toCharArray();
        char[] anagramCharacters = anagram.toCharArray();

        boolean isAnagram = true;

        searchLoop:
        for(int i = 0;i<anagramCharacters.length;i++){
            boolean isCharacterPresent = false;
            for(int j = 0;j<subjectCharacters.length;j++){
                if(anagramCharacters[i]==subjectCharacters[i]){

                }
            }
        }
    }

    public String normalizedString (String word){
        word = word.toLowerCase().replace(" ","");
        return word;
    }

    public static void main(String[] args) {

    }
}
