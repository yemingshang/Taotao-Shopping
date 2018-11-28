
package com.alibaba.dubboadmin.registry.common.domain;

public class Access extends Entity {

    private static final long serialVersionUID = -962351722638094446L;

    private String service;      /*service name*/

    private String address;      /*address of consumer*/

    private boolean allow;       /*status*/

    private String username;     /*user name*/

    public Access() {
    }

    public Access(Long id) {
        super(id);
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isAllow() {
        return allow;
    }

    public void setAllow(boolean allow) {
        this.allow = allow;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
