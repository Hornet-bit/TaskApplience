package by.epamtc.appliance.dao;

import by.epamtc.appliance.entity.*;

public class ApplianceFactory {

    public static Appliance createAppliance(ApplianceType applianceType){

        switch (applianceType){

            case OVEN:
                return new Oven();

            case LAPTOP:
                return new Laptop();

            case SPEAKERS:
                return new Speakers();

            case TABLET_PC:
                return new TabletPC();

            case VACUUM_CLEANER:
                return new VacuumCleaner();

            case REFRIGERATOR:
                return new Refrigerator();

        }

        return null;
    }

}
