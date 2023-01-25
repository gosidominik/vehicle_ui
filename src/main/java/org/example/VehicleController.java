package org.example;

import org.example.controller.VehicleRequestInterface;
import org.json.JSONObject;

public class VehicleController implements VehicleRequestInterface {

    public VehicleRequestInterface vehicleRequestInterface;
    @Override
    public void getVehicleById(JSONObject json) {
        this.vehicleRequestInterface.getVehicleById(json);
    }

    @Override
    public void save(JSONObject vehicleJson) {
        this.vehicleRequestInterface.save(vehicleJson);
    }

    public VehicleRequestInterface getVehicleRequestInterface() {
        return vehicleRequestInterface;
    }

    public void setVehicleRequestInterface(VehicleRequestInterface vehicleRequestInterface) {
        this.vehicleRequestInterface = vehicleRequestInterface;
    }
}
