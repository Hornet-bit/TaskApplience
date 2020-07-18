package by.epamtc.appliance.dao;

import by.epamtc.appliance.dao.impl.ApplianceDAOImpl;
import by.epamtc.appliance.dao.inter.ApplianceDAO;

public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();
	
	private DAOFactory() {}

	public ApplianceDAO getApplianceDAO() {//синглтон

		return applianceDAO; //возвращение люого об. имплементирующего интерфейс applience
	}

	public static DAOFactory getInstance() {
		return instance;//синглтон(?)
	}
}
