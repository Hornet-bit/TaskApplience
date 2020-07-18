package by.epamtc.appliance.dao.inter;

import by.epamtc.appliance.entity.Appliance;
import by.epamtc.appliance.entity.criteria.Criteria;

import java.io.IOException;
import java.util.List;

public interface ApplianceDAO {// требования, которые мы можем захотеть от источника данных
	//нужно писать так, чтобы мы не знали ничео о типе ист данных
	List <Appliance> find(Criteria criteria) throws IOException;


}
