package co.com.salosoft.infraction.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import co.com.salosoft.infraction.domain.IdentificationType;

@Repository(value = "parameterDao")
public class JPAParameterDao implements IParameterDao {

	private EntityManager em = null;
	
	@Override
	public List<IdentificationType> getIdentificationTypes() {
		return null;
	}

}
