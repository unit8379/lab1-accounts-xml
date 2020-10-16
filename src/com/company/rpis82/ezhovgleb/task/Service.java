package com.company.rpis82.ezhovgleb.task;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "service")
public class Service {
    private Internet internet;
    private Telephone telephone;

    @XmlElement
    public void setInternet(Internet internet) {
        this.internet = internet;
    }

    public Internet getInternet() {
        return internet;
    }

    @XmlElement
    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    public Telephone getTelephone() {
        return telephone;
    }
}
