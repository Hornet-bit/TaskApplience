package by.epamtc.appliance.dao.impl;

import by.epamtc.appliance.dao.inter.ApplianceFactoryDAO;
import by.epamtc.appliance.entity.Appliance;
import by.epamtc.appliance.entity.Speakers;
import by.epamtc.appliance.entity.criteria.SearchCriteria;

import java.util.ArrayList;

public class SpeakersFactory implements ApplianceFactoryDAO {
    @Override
    public ArrayList<String> createListFromEnum() {
        ArrayList<String> listFromEnum = new ArrayList<>();

        for (SearchCriteria.Speakers temp : SearchCriteria.Speakers.values()) {
            listFromEnum.add(temp.name());
        }
        return listFromEnum;
    }

    @Override
    public Appliance createObject(String[] arrayOfParams) {
        return new Speakers(arrayOfParams[0],
                arrayOfParams[1],
                arrayOfParams[2],
                arrayOfParams[3]);
    }
}
