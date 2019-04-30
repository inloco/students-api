package students.api.institution.service.dao;

import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import students.api.transients.Institution;

public interface InstitutionDao {
  @SqlUpdate("CREATE TABLE if not exists public.institution\n" +
      "(\n" +
      "    id              integer auto_increment,\n" +
      "    name            varchar(100) not null,\n" +
      "    foundation_date date not null,\n" +
      "    primary key (id)\n" +
      ")")
  void createInstitutionTable();
  @SqlUpdate("CREATE TABLE if not exists public.student\n" +
      "(\n" +
      "    id             integer auto_increment,\n" +
      "    name           varchar(100) not null,\n" +
      "    born           date not null,\n" +
      "    institution_id integer references public.institution (id),\n" +
      "    primary key (id)\n" +
      ")")
  void createStudentsTable();
  @SqlUpdate("INSERT INTO institution (name, foundation_date) VALUES (:name, :foundationDate)")
  @GetGeneratedKeys
  long insertInstitution(@BindBean Institution institution);
}
