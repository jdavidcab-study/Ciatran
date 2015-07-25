package co.com.salosoft.infraction.repository;

import java.util.List;

import co.com.salosoft.infraction.domain.IdentificationType;

public interface IParameterDao {

	List<IdentificationType> getIdentificationTypes();
	
}
