package ua.edu.ucu.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder().name("Mariia")
                                    .age(19)
                                    .mark(100)
                                    .grades(Arrays.asList(100, 100))
                                    .gender("f").build();
        System.out.println(user);
    }
}