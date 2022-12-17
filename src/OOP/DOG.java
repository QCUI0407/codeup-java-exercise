package OOP;

public class Dog {
    //encapsulation
    private static int legs = 4;
    private String furr;
    private String name;


    public Dog(String name, String furr){
        this.furr = furr;
        this.name = name;
    }

    public Dog(String furr) {
        this.furr = furr;
    }

    public Dog(){
    }

    public static void main(String[] args) {
        Dog misty = new Dog("black", "misty");
//        misty.name = "misty";
//        misty.furr = "black";
        Dog hubert = new Dog("white", "hubert");
        Dog buddy = new Dog();
        buddy.name = "buddy";
        buddy.furr = "black";
//        hubert.name = "hubert";
//        hubert.furr = "white";
        System.out.println(misty.name + " has " + misty.furr + " furr");
        System.out.println(hubert.name + " has " + hubert.furr + " furr");
        misty.backflip();
        hubert.backflip();
    }

    public static void bark(){
        System.out.println("barks with rizz");

    }

    public void backflip(){
        System.out.println("do a backflips " + this.name);
        bark();
        System.out.println(legs);
    }


    //this is extraction
    public static int getLegs() {
        return legs;
    }

    public static void setLegs(int legs) {
        Dog.legs = legs;
    }

    public String getFurr() {
        return furr;
    }

    public void setFurr(String furr) {
        this.furr = furr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}