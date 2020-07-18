package by.epamtc.appliance.dao.impl;

import by.epamtc.appliance.entity.Appliance;
import by.epamtc.appliance.dao.inter.ApplianceDAO;
import by.epamtc.appliance.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {
    @Override
    public List<Appliance> find(Criteria criteria) throws IOException {

        BufferedReader reader = Files.newBufferedReader(Paths.get("resources/appliances_db.txt"));
        String note;
        //while (reader.readLine() != null) {

            String appName = null;

            note = reader.readLine();

            appName = note.split(":")[0].trim();//Oven

//			System.out.println(criteria.getGroupSearchName());//берёт ключ из мапки
			String searchingGroup = criteria.getGroupSearchName();//группа товаров Oven

            Appliance appliance = new Appliance();
            //SearchCriteria.Oven.valueOf(, searchingGroup);

//            if (criteria.getGroupSearchName().equals(appName)) {
//
//            }

       // }

        // you may add your own code here
        return null;
    }


    // you may add your own code here

}


//you may add your own new classes