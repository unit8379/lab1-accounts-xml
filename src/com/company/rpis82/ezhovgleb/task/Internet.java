package com.company.rpis82.ezhovgleb.task;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "internet")
//@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
public class Internet {
    private String type;
    private String speed;

    public String getType() {
        return type;
    }

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    public String getSpeed() {
        return speed;
    }

    @XmlAttribute
    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
