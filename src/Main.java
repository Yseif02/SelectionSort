public class Main {
    public  static void main(String[] args){
        String[] Words = {"apple","app", "apple",};
        for(int current = 0; current < Words.length - 1; current++){
            int lowest = current;
            for(int i = current+1; i < Words.length; i++){
                for (int j = 0; j < Math.min(Words[i].length(), Words[lowest].length())/* Uses the length of the shorter word as the test*/; j++) {
                    char CharA = Character.toUpperCase(Words[i].charAt(j));
                    char CharMin = Character.toUpperCase(Words[lowest].charAt(j));
                    if (CharA <= CharMin) {
                        lowest = i;
                        break;
                    } else if (CharA > CharMin) {
                        break;
                    }
                }
            }
            String temp = Words[current];
            Words[current] = Words[lowest];
            Words[lowest] = temp;
        }
        for (String word : Words) {
            System.out.print(word + " ");
        }

    }
}