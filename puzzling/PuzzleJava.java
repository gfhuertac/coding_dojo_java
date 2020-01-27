import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PuzzleJava {

    /**
    * Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
    * Print the sum of all numbers in the array. 
    * Also have the function return an array that only includes numbers that are greater than 10 
    * (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
    */
    public int[] puzzle01() {
        int[] values = new int[]{3,5,1,2,7,9,8,13,25,32};
        List<Integer> filtered = new ArrayList<>();
        int sum = 0;
        for (int i : values) {
            sum += i;
            if (i > 10)
                filtered.add(i);
        }
        System.out.println(sum);
        int[] rv = new int[filtered.size()];
        for (int j = 0; j < rv.length; ++j) {
            rv[j] = filtered.get(j).intValue();
        }
        return rv;
    }

    /**
    * Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
    * Shuffle the array and print the name of each person. 
    * Have the method also return an array with names that are longer than 5 characters.
    */
    public String[] puzzle02() {
        String[] values = new String[]{"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        List<String> filtered = Arrays.asList(values);
        Collections.shuffle(filtered);
        filtered.stream().forEach(s->System.out.println(s));
        return filtered.stream().filter(s->s.length()>5).toArray(String[]::new);
    }
    
    /**
    * Create an array that contains all 26 letters of the alphabet (this array must have 26 values). 
    * Shuffle the array and, after shuffling, display the last letter from the array. 
    * Have it also display the first letter of the array. 
    * If the first letter in the array is a vowel, have it display a message.
    * To shuffle a collection, you can use the shuffle method of the Collections class.
    */
    public void puzzle03() {
        Character[] az = new Character[26];
        for (int i = 0; i < 26; ++i) {
            az[i] = (char)('a' + i);
        }
        List<Character> shuffled = Arrays.asList(az);
        Collections.shuffle(shuffled);
        char first = shuffled.get(0).charValue();
        System.out.println(shuffled.get(25));
        System.out.println(first);
        if ("aeiou".indexOf(first)!=-1) {
            System.out.println("First letter is a vowel!");
        }
    }
    
    /**
    * Generate and return an array with 10 random numbers between 55-100.
    * To get a random integer, you can use the nextInt method of the Random class.
    */
    public int[] puzzle04() {
        Random rnd = new Random();
        int[] rv = new int[10];
        for (int i = 0; i < rv.length; i++) {
            rv[i] = rnd.nextInt(45) + 55;
        }
        return rv;
    }
    
    /**
    * Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
    * To sort a collection, you can use the sort method of the Collections class.
    */
    public int[] puzzle05() {
        int[] rv = puzzle04();
        List<Integer> l = new ArrayList<>();
        for (int i : rv) {
            l.add(i);
        }
        Collections.sort(l);
        return l.stream().mapToInt(i->i).toArray();
    }
    
    /**
	* Create a random string that is 5 characters long.
    */
    public String puzzle06() {
        Random rnd = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 5; ++i) {
            char c = (char)('a' + rnd.nextInt(25));
            sb.append(c);
        }
        return sb.toString();
    }
    
    /**
	* Generate an array with 10 random strings that are each 5 characters long
    */
    public String[] puzzle07() {
        String[] rv = new String[10];
        for (int i = 0; i < 10; i++) {
            rv[i] = puzzle06();            
        }
        return rv;
    }

}