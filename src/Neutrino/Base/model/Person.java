package Neutrino.Base.model;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private final String middleName="Alexiot";
    private String lastName;
    private LocalDate dob;
    private Address address;
    private Person spouse;
    private Pet pet;

    public Person(String firstName,String lastName, LocalDate dob){
        this.firstName=firstName;
        this.lastName=lastName;
        this.dob=dob;
    }

    public Person(){

    }
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Address getAddress() {
        return address;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                ", spouse=" + spouse +
                ", pet=" + pet +
                '}';
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public void saySomething(String message){
        System.out.println(message);
    }

    public char getMidInitial(){
        return middleName.charAt(2);
    }

    public int add(int num1, int num2){
        return num1+num2;
    }
}
