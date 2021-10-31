package com.Group9.model;

public class Propertysquare extends Square {
    private String propertyName;
    private String propertyPrice;
    private String propertyRent;
    private boolean isOwned;

    public Propertysquare(String propertyName, String propertyPrice, String propertyRent, boolean isOwned) {
        this.propertyName = propertyName;
        this.propertyPrice = propertyPrice;
        this.propertyRent = propertyRent;
        this.isOwned = isOwned;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyPrice() {
        return propertyPrice;
    }

    public void setPropertyPrice(String propertyPrice) {
        this.propertyPrice = propertyPrice;
    }

    public String getPropertyRent() {
        return propertyRent;
    }

    public void setPropertyRent(String propertyRent) {
        this.propertyRent = propertyRent;
    }

    public boolean isOwned() {
        return isOwned;
    }

    public void setOwned(boolean owned) {
        isOwned = owned;
    }
}
