package students.api.institution.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import students.api.institution.request.CreateInstitutionRequest;
import students.api.institution.response.CreateInstitutionResponse;

@RestController
public class InstitutionController {

  @RequestMapping(path = "/institutions", method = RequestMethod.POST)
  public CreateInstitutionResponse createInstitution(@RequestBody CreateInstitutionRequest request) {
    System.out.println(request);
    return CreateInstitutionResponse.of(1L);
  }
}
