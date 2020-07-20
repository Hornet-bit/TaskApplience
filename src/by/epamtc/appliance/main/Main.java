package by.epamtc.appliance.main;

import static by.epamtc.appliance.entity.criteria.SearchCriteria.*;

import by.epamtc.appliance.entity.Appliance;
import by.epamtc.appliance.entity.criteria.Criteria;
import by.epamtc.appliance.entity.criteria.SearchCriteria;
import by.epamtc.appliance.service.ApplianceService;
import by.epamtc.appliance.service.ServiceFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		List<Appliance> appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////


		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
//		criteriaOven.add(Oven.CAPACITY.toString(), 33);//CAPACITY 33
//
//
//
//		appliance = service.find(criteriaOven);

//TODO наследование excep

//		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

//		criteriaOven = new Criteria(Oven.class.getSimpleName());
//
//		criteriaOven.add(Oven.HEIGHT.toString(), 200);
//		criteriaOven.add(Oven.DEPTH.toString(), 300);
//
//		appliance = service.find(criteriaOven);
//
//		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

		appliance = service.find(criteriaTabletPC);// find(Object...obj)

		PrintApplianceInfo.print(appliance);

	}

}
