package by.epamtc.appliance.entity;

import java.util.Objects;

public class TabletPC extends Appliance {

    private String batteryCapacity;
    private String displayInches;
    private String memoryRom;
    private String flashMemoryCapacity;
    private String color;

    public TabletPC() {
    }

    public TabletPC(String baterryCapacity, String displayInches, String memoryRom, String flashMemoryCapacity, String color) {
        this.batteryCapacity = baterryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(String displayInches) {
        this.displayInches = displayInches;
    }

    public String getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(String memoryRom) {
        this.memoryRom = memoryRom;
    }

    public String getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(String flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Objects.equals(batteryCapacity, tabletPC.batteryCapacity) &&
                Objects.equals(displayInches, tabletPC.displayInches) &&
                Objects.equals(memoryRom, tabletPC.memoryRom) &&
                Objects.equals(flashMemoryCapacity, tabletPC.flashMemoryCapacity) &&
                Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity='" + batteryCapacity + '\'' +
                ", displayInches='" + displayInches + '\'' +
                ", memoryRom='" + memoryRom + '\'' +
                ", flashMemoryCapacity='" + flashMemoryCapacity + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
