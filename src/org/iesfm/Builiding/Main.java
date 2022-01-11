package org.iesfm.Builiding;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static int askPositive() {
        System.out.println("¿Cuantos quieres añadir?");
        int n = sc.nextInt();
        sc.nextLine();
        while (n < 1) {
            System.out.println("Error. Solo puedes añadir números positivos");
            n = sc.nextInt();
            sc.nextLine();
        }
        return n;
    }

    static Owner askOwner() {
        System.out.println("Nombre del propietario: ");
        String name = sc.nextLine();
        System.out.println("Apellidos del propietario: ");
        String surnames = sc.nextLine();

        return new Owner(name, surnames);
    }

    static Owner[] owners() {
        int size = askPositive();
        Owner[] owners = new Owner[size];
        for (int i = 0; i < owners.length; i++) {
            owners[i] = askOwner();
        }
        return owners;
    }

    static Apartment askApartment() {
        System.out.println("Nº de planta del apartamento: ");
        int floor = sc.nextInt();
        sc.nextLine();
        System.out.println("Puerta del apartamento: ");
        String door = sc.nextLine();
        System.out.println("Propietarios del apartamento: ");
        Owner[] owners = owners();

        return new Apartment(floor, door, owners);
    }

    static Apartment[] apartments() {
        int size = askPositive();
        Apartment[] apartments = new Apartment[size];
        for (int i = 0; i < apartments.length; i++) {
            apartments[i] = askApartment();
        }
        return apartments;
    }

    static Building askBuilding(){
        System.out.println("Direccion: ");
        String address = sc.nextLine();
        System.out.println("Municipio: ");
        String town = sc.nextLine();
        System.out.println("Apartamentos del edificio: ");
        Apartment[] apartments = apartments();

        return new Building(address, town, apartments);
    }

    public static void main(String[] args) {
        askBuilding();
    }
}
