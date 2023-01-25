package org.example;

import java.util.Scanner;

public class View {
    public Scanner viewScanner;
    VehicleController vehicleController;
    public View(VehicleController vehicleController) {
        this.vehicleController = vehicleController;
    }

    public void start() {
        this.viewScanner = new Scanner(System.in);
        VehicleViewModel viewModel = new VehicleViewModel();
        String input ="";
        while(!input.equals("x")) {
            System.out.println("Mentés: (m); lekérdezés: (l); kilépés: (x)");
            input = viewScanner.nextLine();
            if(input.equals("m")) {
                System.out.println("Add meg a rendszámot: ");
                viewModel.setRegistrationNumber(viewScanner.nextLine());
                System.out.println("Add meg a márkát: ");
                viewModel.setMake(viewScanner.nextLine());
                System.out.println("Add meg a modelt: ");
                viewModel.setModel(viewScanner.nextLine());
                System.out.println("Add meg a ülések számát: ");
                viewModel.setNumberOfSeats(viewScanner.nextLine());
                System.out.println("Add meg a kategóriát: ");
                viewModel.setVehicleType(viewScanner.nextLine());
                vehicleController.save(viewModel);
            }
                if (input.equals("l")) {
                System.out.println("Add meg a keresett rendszámot: ");
                vehicleController.getVehicle(viewScanner.nextLine());
            }
            }
        }
        public static void display(VehicleViewModel viewModel) {
            System.out.println(viewModel.getMessage());
        }
    }
