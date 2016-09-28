package com.devslopes.bootcamplocator.model;

/**
 * Created by markprice on 6/13/16.
 */
public class Devslopes {

    final String DRAWABLE = "drawable/";

    public String getImgUrl() {
        return DRAWABLE + locationImrUrl;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public String getLocationTitle() {
        return locationTitle;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public String getLocationImrUrl() {
        return locationImrUrl;
    }

    private float longitude;
    private float latitude;
    private String locationTitle;
    private String locationAddress;
    private String locationImrUrl;

    public Devslopes(float latitude, float longitude, String locationTitle, String locationAddress, String locationImrUrl) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.locationTitle = locationTitle;
        this.locationAddress = locationAddress;
        this.locationImrUrl = locationImrUrl;
    }
}
