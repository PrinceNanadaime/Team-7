package web.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class User {
    private String name;
    private String surname;
    private int age;
    private Car car;
}
