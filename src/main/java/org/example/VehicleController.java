package org.example;

import org.example.controller.VehicleRequestInterface;

public class VehicleController {

    public VehicleRequestInterface vehicleRequestInterface;
    public void getVehicle(String id) {
        this.vehicleRequestInterface.getVehicleById(ViewModelParser.createFindRequestJson(id).toString());
    }

    public void save(VehicleViewModel viewModel) {
        this.vehicleRequestInterface.save(ViewModelParser.createSaveRequestJson(viewModel).toString());
    }

    public VehicleRequestInterface getVehicleRequestInterface() {
        return vehicleRequestInterface;
    }

    public void setVehicleRequestInterface(VehicleRequestInterface vehicleRequestInterface) {
        this.vehicleRequestInterface = vehicleRequestInterface;
    }
}
