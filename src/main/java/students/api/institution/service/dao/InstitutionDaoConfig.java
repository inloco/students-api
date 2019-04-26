package students.api.institution.service.dao;

import org.jdbi.v3.core.Jdbi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstitutionDaoConfig {
  @Bean
  public InstitutionDao institutionDao(Jdbi jdbi) {
    return jdbi.onDemand(InstitutionDao.class);
  }
}
