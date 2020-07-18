package by.epamtc.appliance.service;

import by.epamtc.appliance.entity.Appliance;
import by.epamtc.appliance.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceService {

	List<Appliance> find(Criteria criteria) throws IOException;
	
}
