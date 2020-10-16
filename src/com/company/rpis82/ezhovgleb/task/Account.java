package com.company.rpis82.ezhovgleb.task;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "account")
public class Account {
    private String firstName;
    private String lastName;
    private List<Tariff> tariff;

    @XmlAttribute(name = "firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    @XmlAttribute(name = "lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @XmlElement(name = "tariff")
    public void setTariff(List<Tariff> tariff) {
        this.tariff = tariff;
    }

    public List<Tariff> getTariff() {
        return tariff;
    }
}
