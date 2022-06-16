package model;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class FakerGenerator {

    private Faker faker;
    private String name;
    private String lastName;
    private String email;
    private String address;
    private String university;
    private String profession;
    private String gender;
    private String age;

    public FakerGenerator(WebDriver driver){
        faker = new Faker(new Locale("pt-BR"));
    }

    public String getName() {
        name = faker.name().firstName();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        lastName = faker.name().lastName();
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        email = faker.internet().emailAddress();
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        address = faker.address().streetAddress();
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUniversity() {
        university = faker.university().name();
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getProfession() {
        profession = faker.job().title();
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        age = faker.numerify("50");
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
