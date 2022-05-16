package web.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Car {
    private String tag;
    private String techCharacteristics;
}
