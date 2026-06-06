package Week1.Oops;

public class Oops {
    public static void main(String[] args) {
        System.out.println("TestCase KidUsers");
        KidUsers kid = new KidUsers();

        kid.age = 10;
        kid.registerAccount();

        kid.age = 18;
        kid.registerAccount();

        kid.bookType = "Kids";
        kid.requestBook();

        kid.bookType = "Fiction";
        kid.requestBook();

        System.out.println();

        System.out.println("TestCase for AdultUser");
        AdultUser adult = new AdultUser();

        adult.age = 5;
        adult.registerAccount();

        adult.age = 23;
        adult.registerAccount();

        adult.bookType = "Kids";
        adult.requestBook();

        adult.bookType = "Fiction";
        adult.requestBook();
    }
}