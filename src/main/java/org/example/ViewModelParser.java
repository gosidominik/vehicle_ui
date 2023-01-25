package org.example;

import org.json.JSONException;
import org.json.JSONObject;

public class ViewModelParser {
public static JSONObject createSaveRequestJson(VehicleViewModel viewModel) {
    JSONObject json = new JSONObject();
    try {
        json.put("registrationNumber", viewModel.getRegistrationNumber());
        json.put("make", viewModel.getMake());
        json.put("model", viewModel.getModel());
        json.put("numberOfSeats", viewModel.getNumberOfSeats());
        json.put("vehicleType", viewModel.getVehicleType());
    } catch (JSONException e) {
        throw new RuntimeException(e);
    }
return json;
}

public static JSONObject createFindRequestJson(String s) {
    JSONObject json = new JSONObject();
    try {
        json.put("registrationNumber", s);
    } catch (JSONException e) {
        e.printStackTrace();
    }
    return json;
}

public static VehicleViewModel parseResponseJsonToViewModel(JSONObject json) {
    VehicleViewModel vehicleViewModel = new VehicleViewModel();
    try {
        vehicleViewModel.setModel(json.getString("model"));
        vehicleViewModel.setMake(json.getString("make"));
        vehicleViewModel.setVehicleType(json.getString("vehicleType"));
        vehicleViewModel.setRegistrationNumber(json.getString("registrationNumber"));
        vehicleViewModel.setNumberOfSeats(json.getString("numberOfSeats"));
        vehicleViewModel.setMessage(json.getString("message"));
    } catch (JSONException e) {
        e.printStackTrace();
    }
    return vehicleViewModel;
}
}
