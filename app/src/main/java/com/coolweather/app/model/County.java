package com.coolweather.app.model;

/**
 * Created by Administrator on 2016/1/21.
 */
public class County {
    private int id;
    private String countyName;
    private String countyCode;
    private int ciytId;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCiytId(int ciytId) {
        this.ciytId = ciytId;
    }

    public int getCiytId() {
        return ciytId;
    }
}
