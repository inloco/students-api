package students.api.transients;

import java.time.LocalDate;

import lombok.NonNull;
import lombok.Value;

@Value
public class Student {
  Long id;
  @NonNull String name;
  @NonNull LocalDate birthDate;
  Institution institution;
}
