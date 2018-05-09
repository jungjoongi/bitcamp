package bitcamp.java106.step05;

import java.util.Properties;

public class Car4 {
    String model;
    String maker;
    int cc;
    Properties option;
    
    

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getMaker() {
        return maker;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }
    public int getCc() {
        return cc;
    }
    public void setCc(int cc) {
        this.cc = cc;
    }
    public Properties getOption() {
        return option;
    }
    public void setOption(Properties option) {
        this.option = option;
    }
    @Override
    public String toString() {
        return "Car4 [model=" + model + ", maker=" + maker + ", cc=" + cc + ", option=" + option + "]";
    }




    
    
}