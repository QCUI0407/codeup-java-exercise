import OOP.Dog;

import java.util.Arrays;

public class ArrayLec {


    public static void main(String[] args){
        String[] puppies = {"dog1", "dog2"};
        puppies = new String[4];
        int puppyLength = 4;

//        puppy = new String[puppyLength];
//        System.out.println(puppy[0]);
        puppies[0] = "jimothy";
        puppies[1] = "jimbo";
        puppies[2] = "jimbe";
        puppies[3] = "Misty";
//        System.out.println(puppy[0]);
//        System.out.println(puppy[3]);

//        System.out.println(puppies.length);

        int puppyArrLength = puppies.length;

        //regular for loop
//        for (int i = 0; i < puppyArrLength; i++){
//            System.out.println(puppies[i]);
//        }

        //this is forEach
        for(String puppy: puppies){
            System.out.println(puppy);
        }

        String[] kittens = {"Tim", "Apple", "Jim"};
//        System.out.println(Arrays.equals(kittens, puppies));

        String[] newPuppies = Arrays.copyOf(puppies, 2);
//        System.out.println(newPuppies[0]);
//        System.out.println(newPuppies[1]);
//        System.out.println(newPuppies[2]);

        String kittenString = Arrays.toString(kittens);
        System.out.println("this is my kitten string " + kittenString);

        Arrays.sort(kittens);

//        System.out.println(kittens[0]);

        Arrays.fill(kittens, "kitten");
//        System.out.println(kittens[0]);
//        System.out.println(kittens[1]);
//        System.out.println(kittens[2]);

        String[][] StringMatrix = {
                {"JimTheDog", "BillTheDog", "JakeTheDog"},
                {"faulTheKitty", "SummerTheKitty", "PussTheKitty"},
                {"franklinTheTurtle", "GutsTheTurtle", "MusashiTheTurtle"},
                {"FinnTheHuman"}
        };

//        System.out.println(StringMatrix[2][1]);
//        System.out.println(StringMatrix[0][2]);

//        for (String[] row: StringMatrix){
////            System.out.println(row[0]);
//            for(String column: row){
//                System.out.println(column);
//            }
//        }


        Dog[] dogs = new Dog[2];
        Dog jimothy = new Dog("jimothy", "bald");
        Dog misty = new Dog("misty", "black");
        dogs[0] = jimothy;
        dogs[1] = misty;
        System.out.println(dogs[0].getName());
        jimothy.setName("Jimothy");
        System.out.println(dogs[0].getName());
    }

}

