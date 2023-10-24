
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dog> dogList = new ArrayList<Dog>();

        Dog dog1 = new Dog("dot", 4);
        Dog dog2 = new Dog("leo", 5);
        Dog dog3 = new Dog("sync", 2);

        dogList.add(dog3);
        dogList.add(dog1);
        dogList.add(dog2);


        Collections.sort(dogList);

        for (Dog d : dogList) {
            System.out.println(d.name);
        }
    }
}