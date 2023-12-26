package ua.edu.ucu.task2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Client {
    private String email;
    private int number;
    private int id;
    private String name;
    private int age;
    private Sex sex;

    public Client(String email, String name, int age, Sex sex) {
        this.email = email;
        this.id = number++;
        this.name = name;
        this.sex = sex;
    }
}
