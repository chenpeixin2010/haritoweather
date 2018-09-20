package com.haritoweather.android.db;

import org.litepal.crud.DataSupport;

//记录省

public class Province extends DataSupport{
    private int id;               //省的id
    private String provinceName; //省的名字
    private int provinceCode;   //省的代号
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getprovinceCode(){
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
