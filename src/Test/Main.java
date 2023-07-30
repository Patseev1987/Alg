package Test;

public class Main {
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
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + "   " + b);
    }

    public static void swap(Integer a, Integer b) {
        Integer temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + "   " + b);
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(x + "   " + y);
        swap(x, y);
        System.out.println(x + "   " + y);

        Integer j = 99;
        Integer k = 11;
        System.out.println(j + "   " + k);
        swap(j,k);
        System.out.println(j + "   " + k);



        Person john=new Person("John",35);
        Person ivan = new Person("Ivan",89);
        System.out.println(john);
        System.out.println(ivan);
        Person.swap(john,ivan);
        System.out.println(john);
        System.out.println(ivan);
    }
}
