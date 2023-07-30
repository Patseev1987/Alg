package Test;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void swap(Person first, Person second){
        String tempName="";
        int tempAge=0;
        Person temp = new Person(tempName,tempAge);
        temp.age=first.age;
        temp.name= first.name;
        first.age= second.age;
        first.name= second.name;
        second.age=temp.age;
        second.name=temp.name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
