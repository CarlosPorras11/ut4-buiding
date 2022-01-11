package org.iesfm.Builiding;

import java.util.Arrays;
import java.util.Objects;

public class Building {
    private String address;
    private String town;
    private Apartment[] apartments;

    public Building(String address, String town, Apartment[] apartments) {
        this.address = address;
        this.town = town;
        this.apartments = apartments;
    }

    public void showBuilding() {
        System.out.println("En la direccion " + address + " del municipio " + town +
                " hay los siguientes apartamentos: ");
        for (int i = 0; i < apartments.length; i++) {
            Apartment apartment = apartments[i];
            apartment.showApartment();
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(address, building.address) && Objects.equals(town, building.town) && Arrays.equals(apartments, building.apartments);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(address, town);
        result = 31 * result + Arrays.hashCode(apartments);
        return result;
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", town='" + town + '\'' +
                ", apartments=" + Arrays.toString(apartments) +
                '}';
    }
}