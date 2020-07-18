package by.epamtc.appliance.entity;

import java.util.Objects;

public class Laptop extends Appliance{
    private String batteryCapacity;
    private String os;
    private String memoryRom;
    private String systemMemory;
    private String cpu;
    private String displayInchs;

    public Laptop() {
    }

    public Laptop(String batteryCapacity, String os, String memoryRom, String systemMemory, String cpu, String displayInchs) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInchs = displayInchs;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public String getMemoryRom() {
        return memoryRom;
    }

    public String getSystemMemory() {
        return systemMemory;
    }

    public String getCpu() {
        return cpu;
    }

    public String getDisplayInchs() {
        return displayInchs;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setMemoryRom(String memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setSystemMemory(String systemMemory) {
        this.systemMemory = systemMemory;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setDisplayInchs(String displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(batteryCapacity, laptop.batteryCapacity) &&
                Objects.equals(os, laptop.os) &&
                Objects.equals(memoryRom, laptop.memoryRom) &&
                Objects.equals(systemMemory, laptop.systemMemory) &&
                Objects.equals(cpu, laptop.cpu) &&
                Objects.equals(displayInchs, laptop.displayInchs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity='" + batteryCapacity + '\'' +
                ", os='" + os + '\'' +
                ", memoryRom='" + memoryRom + '\'' +
                ", systemMemory='" + systemMemory + '\'' +
                ", cpu='" + cpu + '\'' +
                ", displayInchs='" + displayInchs + '\'' +
                '}';
    }
}
