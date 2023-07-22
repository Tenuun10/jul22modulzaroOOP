import person.Person;

public class Main {
    public static void main(String[] args) {

        Person Tibi = new Person("Tibi",15,"male");
        Tibi.getHobbies().add("foci");


        Person Sanyi = new Person("Sanyi",55,"male");
        Sanyi.getFriends().add(new Person("Ivan",33,"male"));


        System.out.println(Person.getPopulation());



    }
}