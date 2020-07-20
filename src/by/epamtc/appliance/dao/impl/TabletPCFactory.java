package by.epamtc.appliance.dao.impl;

import by.epamtc.appliance.dao.inter.ApplianceFactoryDAO;
import by.epamtc.appliance.entity.Appliance;
import by.epamtc.appliance.entity.TabletPC;
import by.epamtc.appliance.entity.criteria.SearchCriteria;

import java.util.ArrayList;

public class TabletPCFactory implements ApplianceFactoryDAO {
    @Override
    public ArrayList<String> createListFromEnum() {
        ArrayList<String> listFromEnum = new ArrayList<>();

        for (SearchCriteria.TabletPC temp : SearchCriteria.TabletPC.values()) {
            listFromEnum.add(temp.name());
        }
        return listFromEnum;
    }

    @Override
    public Appliance createObject(String[] arrayOfParams) {
        return new TabletPC(arrayOfParams[0],arrayOfParams[1],arrayOfParams[2],arrayOfParams[3],arrayOfParams[4]);
    }
}
