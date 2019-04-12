package students.api.transients;

import java.time.LocalDate;
import java.util.List;

import lombok.Value;

@Value
public class Institution {
  Long id;
  LocalDate foundationDate;
  List<Student> students;
}
