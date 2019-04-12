package students.api.institution.response;

import lombok.Value;

@Value(staticConstructor = "of")
public class CreateInstitutionResponse {
  Long id;
}
