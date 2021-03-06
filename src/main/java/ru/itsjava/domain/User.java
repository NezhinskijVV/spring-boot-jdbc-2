package ru.itsjava.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class User {
    private long id;
    private final String name;
    private final int age;
    private Email email;
    private Pet pet;


}
