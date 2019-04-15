package com.example.warmweather.db;


import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    public int id;
    private String provinceName;
    private int provinceCode;

    public int getId(){return id ;}
    public void setId(int id){this.id =id ;}

    public String getProvinceName(){return provinceName;}
    public void getProvinceName(String provinceName){this.provinceName=provinceName;}

    public int getProvinceCode(){return provinceCode;}
    public void setProvinceCode(int provinceCode){this.provinceCode= provinceCode;}
}
