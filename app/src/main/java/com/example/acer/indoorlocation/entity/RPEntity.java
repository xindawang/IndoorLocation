package com.example.acer.indoorlocation.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ACER on 2017/12/17.
 */

public class RPEntity {
    private String rpName;
    private Set<APEntity> apEntities;

    public String getRpName() {
        return rpName;
    }

    public void setRpName(String rpName) {
        this.rpName = rpName;
    }

    public Set<APEntity> getApEntities() {
        return apEntities;
    }

    public void setApEntities(Set<APEntity> apEntities) {
        this.apEntities = apEntities;
    }

}
