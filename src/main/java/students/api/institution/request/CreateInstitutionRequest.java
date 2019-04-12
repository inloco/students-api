package students.api.institution.request;

import java.time.LocalDate;

import lombok.Value;

@Value
public class CreateInstitutionRequest {
  String name;
  LocalDate foundationDate;
}
