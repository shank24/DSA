package Neutrino.Base.model;

import java.time.LocalDate;

public class TestClass {
    public static void main(String[] args) {
        //System.out.println("Hello ");

        Person karan = new Person("Karan","Kalra", LocalDate.of(1989,12,24));
        Person janet = new Person("Janet","Jackson", LocalDate.of(1989,12,22));
        karan.setSpouse(janet);

        Dog milo = new Dog("Milo",LocalDate.of(2012,01,01));

        milo.bark();
        karan.setPet(milo);
        //System.out.println(karan.toString());


        Person p1 = new Person();

        p1.sayHello();
        p1.saySomething("Hi Gompy");
        System.out.println(p1.getMidInitial());
        System.out.println(p1.add(5,3));

    }
}
