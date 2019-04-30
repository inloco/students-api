package students.api.models;

import java.time.LocalDate;

import lombok.Value;

@Value(staticConstructor = "of")
public class Institution {
  Long id;
  String name;
  LocalDate foundationDate;
}
