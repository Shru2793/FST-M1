package activities;

import java.util.ArrayList;
public class Activity9 {
    public static void main(String[] args){
        ArrayList<String> myList= new ArrayList<String>();
        myList.add("Apple");
        myList.add("Orange");
        myList.add("Grapes");
        myList.add(3,"Banana");
        myList.add(1,"Papaya");
        System.out.println("Print all the objects");
for(String s :myList){
    System.out.println(s);
}
        System.out.println("3rd elemengt in the list is:" +myList.get(2));
        System.out.println("Is Chiku in the List:" + myList.contains("Chiku"));
        System.out.println("Size of Array list:" + myList.size());
        myList.remove("Papaya");
        System.out.println("New size of ArrayList:" + myList.size());
    }
}
