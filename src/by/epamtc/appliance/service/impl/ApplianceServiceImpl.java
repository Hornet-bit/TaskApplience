package by.epamtc.appliance.service.impl;

import by.epamtc.appliance.dao.DAOFactory;
import by.epamtc.appliance.dao.inter.ApplianceDAO;
import by.epamtc.appliance.entity.Appliance;
import by.epamtc.appliance.service.ApplianceService;
import by.epamtc.appliance.service.validation.Validator;
import by.epamtc.appliance.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appliance = applianceDAO.find(criteria);


		// you may add your own code here
		
		return appliance;
	}

}

//you may add your own new classes
