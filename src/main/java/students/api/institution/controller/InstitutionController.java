package students.api.institution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import students.api.institution.request.CreateInstitutionRequest;
import students.api.institution.response.CreateInstitutionResponse;
import students.api.institution.service.InstitutionService;
import students.api.transients.Institution;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class InstitutionController {
  private final InstitutionService service;

  @RequestMapping(path = "/institutions", method = RequestMethod.POST)
  public CreateInstitutionResponse createInstitution(@RequestBody CreateInstitutionRequest request) {
    final Institution inst = Institution.builder().name(request.getName()).foundationDate(request.getFoundationDate()).build();
    final long institutionId = service.insertInstitution(inst);
    return CreateInstitutionResponse.of(institutionId);
  }
}
