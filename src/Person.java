public class Person {
    private String name;

    public Person(){
    }

    public Person(String name){
        this.name = name;
    }


    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello" + this.name);
    }

    public static void main(String[] args){
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));// true because John and John are the same
//        System.out.println(person1 == person2); // false, b/c theyre two  different instances

//        Person person1 = new Person("John");
//        Person person2 = person1; // assigning the same instance
//        person1.setName("Wilmarie");
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Longer name");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


    }

}