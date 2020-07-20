package by.epamtc.appliance.dao.impl;

import by.epamtc.appliance.dao.inter.ApplianceFactoryDAO;
import by.epamtc.appliance.entity.Oven;
import by.epamtc.appliance.entity.criteria.SearchCriteria;

import java.util.ArrayList;
import java.util.List;

public class OvenFactory implements ApplianceFactoryDAO {


    @Override
    public ArrayList<String> createListFromEnum() {

        ArrayList<String> listFromEnum = new ArrayList<>();

        for (SearchCriteria.Oven temp : SearchCriteria.Oven.values()) {
            listFromEnum.add(temp.name());
        }
        return listFromEnum;
    }

    @Override
    public Oven createObject(String [] arrayOfParams) {

        return new Oven(arrayOfParams[0],
                        arrayOfParams[1],
                        arrayOfParams[2],
                        arrayOfParams[3],
                        arrayOfParams[4],
                        arrayOfParams[5]);
    }


}
