package students.api.institution.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import students.api.institution.service.dao.InstitutionDao;
import students.api.transients.Institution;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class InstitutionService {
  private final InstitutionDao dao;

  public long insertInstitution(Institution institution) {
    dao.createInstitutionTable();
    dao.createStudentsTable();
    return dao.insertInstitution(institution);
  }
}
