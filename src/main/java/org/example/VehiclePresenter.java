package org.example;

import org.example.presenter.VehicleResponseInterface;
import org.json.JSONObject;

public class VehiclePresenter implements VehicleResponseInterface {
    @Override
    public void displayFind(JSONObject json) {
        VehicleViewModel vehicleViewModel = ViewModelParser.parseResponseJsonToViewModel(json);
        View.display(vehicleViewModel);
    }

    @Override
    public void displaySave(JSONObject json) {
        VehicleViewModel vehicleViewModel = ViewModelParser.parseResponseJsonToViewModel(json);
        View.display(vehicleViewModel);
    }
}
