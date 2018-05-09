package bitcamp.java106.step05;

import java.util.Map;

public class Car3 {
    String model;
    String maker;
    int cc;
    Map<String,Object> option;
    
    
    public Map<String, Object> getOption() {
        return option;
    }
    public void setOption(Map<String, Object> option) {
        this.option = option;
    }
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
    @Override
    public String toString() {
        return "Car3 [model=" + model + ", maker=" + maker + ", cc=" + cc + ", option=" + option + "]";
    }



    
    
}