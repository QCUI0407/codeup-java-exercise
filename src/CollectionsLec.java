import OOP.Dog;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLec {

    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        Dog jim = new Dog("Jim", "black");
        Dog wilma = new Dog("wilma", "black");
        Dog scooby = new Dog("scooby", "black");

        dogs.add(jim);
        dogs.add(wilma);
        dogs.add(scooby);

//        System.out.println(dogs.size());
//
//        System.out.println(dogs.get(2).getName());
//        System.out.println(dogs.indexOf(jim));
        System.out.println(dogs);
        System.out.println(dogs.contains(wilma));
        System.out.println(dogs.remove(0));
        System.out.println(dogs);



        // We'll start by defining a hash map
        HashMap<Integer, String> usernames = new HashMap<>();

// and putting some data into it
        usernames.put(1, "ryanorsinger");
        usernames.put(2, "zgulde");
        usernames.put(3, "fmendozaro");
        usernames.put(4, "jreich5");

        System.out.println(usernames);
// {1=ryanorsinger, 2=zgulde, 3=fmendozaro, 4=jreich5}

// obtaining values from the hash map by key
        usernames.get(1); // "ryanorsinger"
        usernames.get(5); // null
        usernames.getOrDefault(6, "gocodeup"); // "gocodeup"

// checking if keys or values are present
        usernames.containsKey(3); // true
        usernames.containsValue("fmendozaro"); // true

        for(int i = 1; i < usernames.size(); i++){
            System.out.println(usernames.get(i));
        }

        usernames.replace(1, "jordysol");
        System.out.println(usernames.get(1));
        usernames.remove(2);
        usernames.putIfAbsent(5, "sergio");
        System.out.println(usernames.get(5));
    }
}