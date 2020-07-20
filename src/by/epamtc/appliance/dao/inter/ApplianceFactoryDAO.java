package by.epamtc.appliance.dao.inter;

import by.epamtc.appliance.entity.Appliance;

import java.util.ArrayList;
import java.util.List;

public interface ApplianceFactoryDAO {
    public ArrayList<String> createListFromEnum();
    public Appliance createObject(String[] arrayOfParams);
}
