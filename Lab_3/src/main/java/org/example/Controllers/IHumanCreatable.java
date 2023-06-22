package org.example.Controllers;
import org.example.Models.Gender;

public interface IHumanCreatable<T> {
    T create(String firstName, String secondName, String fatherName, Gender gender);
    T createDefault();
}
