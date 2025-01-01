package UDEMY_COURSE.java_ooa.other;

import UDEMY_COURSE.java_ooa.Person;

class Test{
    public static void main(String[] args) {
        Person john = new Person("Seán", 43);// :) using the 2 overloaded constructors
        Person mary = new Person();
        mary.name = "Mary"; // encapsulation - name is private
        mary.setName("Mary");
        mary.setAge(25);
        System.out.println(Person.getCount());// 2

        { { } }
   //     System.out.println(name);
        String name="Paul"; 
        System.out.println(name);
    }    
}
