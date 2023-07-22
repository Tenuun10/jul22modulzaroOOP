package person;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    int age;
    final String gender;

    List<String> hobbies;
    List<Person> friends;

   static int population = 0;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobbies = new ArrayList<>();
        this.friends = new ArrayList<>();
        population++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<Person> getFriends() {
        return friends;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

    public static int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void addFriend(Person newFriend){
         friends.add(newFriend);
    }

    public void removeFriend(Person remFriend){
        friends.remove(remFriend);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", hobbies=" + hobbies +
                ", friends=" + friends +
                '}';
    }
}
