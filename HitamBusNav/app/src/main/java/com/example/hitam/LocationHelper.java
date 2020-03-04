package com.example.hitam;

public class LocationHelper {
    private double Longitude;
    private double Latitude;
    private int BusNo;

    public LocationHelper(double longitude, double latitude, int busNo) {
        Longitude = longitude;
        Latitude = latitude;
        BusNo = busNo;
    }

    public LocationHelper(double longitude, double latitude) {
        Longitude = longitude;
        Latitude = latitude;

    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLongitude(double longitude) {
        Longitude = longitude;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public int getBusNo() {
        return BusNo;
    }

    public void setBusNo(int busNo) {
        BusNo = busNo;
    }
}
