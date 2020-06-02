package com.company;
import java.util.*;
public abstract class Cabinet implements Furniture {
    protected String Furniture_type = "cupboard";
    String model;
    int length;
    int Furniture_id ;
    public Cabinet(String model,int length,int Furniture_id){
        this.model = model;
        this.length = length;
        this.Furniture_id = Furniture_id;
    }
    public String getModel(){
        return model;
    }
    public int getLength(){
        return length;
    }
    public int getFurniture_id(){
        return Furniture_id;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setID(int Furniture_id) {
        this.Furniture_id = Furniture_id;
    }
    public abstract void toPaint();


}
