package Test;

public class Foo {
    public void swap (int a, int b){
        int temp =a;
        a=b;
        b=temp;
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        int q=11;
        int p=99;
        System.out.println(q+"   "+p);
        foo.swap(q,p);
        System.out.println(q+"   "+p);

        Person john=new Person("John",35);
        Person ivan = new Person("Ivan",89);
        System.out.println(john);
        System.out.println(ivan);
        Person.swap(john,ivan);
        System.out.println(john);
        System.out.println(ivan);
    }
}
