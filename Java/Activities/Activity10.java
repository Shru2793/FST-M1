package activities;
import java.util.HashSet;
public class Activity10 {
    public static void main(String[] args){
        HashSet<String> hs= new HashSet<>();

        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");

        System.out.println("Original Hashset:" + hs);
        System.out.println("Size of the Hashset: " + hs.size());
        System.out.println("Removing B from Hashset: " + hs.remove("B"));
        if(hs.remove("F")){
            System.out.println("F is removed from the Hashset");
        }
        else{
            System.out.println("F is not present in the Hashset ");
        }
        System.out.println("Checking if G is present in the List: " + hs.contains("G"));
        System.out.println("Updated Hash set: " + hs);
    }
}
