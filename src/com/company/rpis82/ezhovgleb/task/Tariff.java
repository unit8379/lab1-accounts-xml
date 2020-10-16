package com.company.rpis82.ezhovgleb.task;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "tariff")
//@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL) // аннотация для изменения порядка атрибутов элемента в XML. имеет заранее заданные значения
public class Tariff {
    private String name;
    private String cost;
    private String id;
    private List<Service> service;

    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute
    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getCost() {
        return cost;
    }

    @XmlAttribute
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @XmlElement
    public void setService(List<Service> service) {
        this.service = service;
    }

    public List<Service> getService() {
        return service;
    }
}