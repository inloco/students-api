package students.api.institution.service.dao;

import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import students.api.transients.Institution;

public interface InstitutionDao {
  @SqlUpdate("INSERT INTO institution (name, foundation_date) VALUES (:name, :foundationDate) RETURNING id")
  @GetGeneratedKeys("id")
  long insertInstitution(@BindBean Institution institution);
}
