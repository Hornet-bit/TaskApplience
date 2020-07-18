package by.epamtc.appliance.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance{

    private String powerConsumption;
    private String filterType;
    private String bgType;
    private String wandType;
    private String motorSpeedRegulation;
    private String cleaningWidth;

    public VacuumCleaner() {
    }

    public VacuumCleaner(String powerConsumption, String filterType, String bgType, String wandType, String motorSpeedRegulation, String cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bgType = bgType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBgType() {
        return bgType;
    }

    public void setBgType(String bgType) {
        this.bgType = bgType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public String getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(String motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public String getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(String cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Objects.equals(powerConsumption, that.powerConsumption) &&
                Objects.equals(filterType, that.filterType) &&
                Objects.equals(bgType, that.bgType) &&
                Objects.equals(wandType, that.wandType) &&
                Objects.equals(motorSpeedRegulation, that.motorSpeedRegulation) &&
                Objects.equals(cleaningWidth, that.cleaningWidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, filterType, bgType, wandType, motorSpeedRegulation, cleaningWidth);
    }


    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", filterType='" + filterType + '\'' +
                ", bgType='" + bgType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation='" + motorSpeedRegulation + '\'' +
                ", cleaningWidth='" + cleaningWidth + '\'' +
                '}';
    }
}
