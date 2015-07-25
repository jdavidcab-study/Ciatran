package co.com.salosoft.infraction.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.salosoft.infraction.domain.IdentificationType;

/**
 * Handles requests for all parameters.
 * @author Johann.Cabrera
 *
 */
@RestController
public class ParameterController {
	
	private static final Logger logger = LoggerFactory.getLogger(ParameterController.class);
	
	@RequestMapping(value = RestURIConstants.GET_IDENTIFICATION_TYPE, method = RequestMethod.GET)
	public List<IdentificationType> getIdentificationTypes() {
		logger.info("Start getIdentificationTypes");
		
		List<IdentificationType> list = new ArrayList<IdentificationType>();
		
		IdentificationType identificationType = new IdentificationType();
		identificationType.setIdentificationTypeId( 1 );
		identificationType.setName("Cedula");
		list.add( identificationType );
		
		identificationType = new IdentificationType();
		identificationType.setIdentificationTypeId( 2 );
		identificationType.setName("NIT");
		list.add( identificationType );
		
		return list;
	}
	
	
}
