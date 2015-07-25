package co.com.salosoft.infraction.service;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.com.salosoft.infraction.controller.ParameterController;
import co.com.salosoft.infraction.domain.IdentificationType;

public interface IParameterManager extends Serializable {

	List<IdentificationType> getIdentificationTypes();
	
}
