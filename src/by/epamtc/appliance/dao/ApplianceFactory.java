package by.epamtc.appliance.dao;

import by.epamtc.appliance.dao.impl.*;
import by.epamtc.appliance.dao.inter.ApplianceFactoryDAO;
import by.epamtc.appliance.entity.*;

import java.util.List;

public class ApplianceFactory {

    public static ApplianceFactoryDAO createAppliance(String applianceType){
        switch (applianceType){

            case "Oven":

                OvenFactory ovenFactory = new OvenFactory();
                return ovenFactory;


            case "Laptop":

                LaptopFactory laptopFactory = new LaptopFactory();
                return laptopFactory;

            case "Speakers":

                SpeakersFactory speakersFactory = new SpeakersFactory();
                return speakersFactory;

            case "TabletPC":

                TabletPCFactory tabletPCFactory = new TabletPCFactory();
                return tabletPCFactory;

            case "VacuumCleaner":

                VacuumCleanerFactory vacuumCleanerFactory = new VacuumCleanerFactory();
                return vacuumCleanerFactory;

            case "Refrigerator":

                RefrigeratorFactory refrigeratorFactory = new RefrigeratorFactory();
                return refrigeratorFactory;

        }

        return null;
    }

}
