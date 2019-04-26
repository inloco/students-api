package students.api.transients;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
public class Institution {
  Long id;
  @NonNull String name;
  @NonNull LocalDate foundationDate;
  @NonNull @Builder.Default List<Student> students = Collections.emptyList();
}
