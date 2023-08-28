package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(check("Cwm fjord bank glyphs vext quiz"));
    }

    public static boolean check(String sentence){
        String[] split = sentence.toLowerCase().split(" ");
        SortedSet<Character> characterSet = new TreeSet<>();
        for (int i = 0; i < split.length; i++) {
            char[] charArray = split[i].toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                if(Character.isAlphabetic(charArray[j])) {
                    characterSet.add(charArray[j]);
                }
            }
        }
        if(characterSet.size() == 26) {
            return true;
        }else {
            return false;
        }
    }
}