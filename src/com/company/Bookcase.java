package com.company;
import java.util.*;
public class Bookcase extends Cabinet {
    public Bookcase(String model,int length,int Furniture_id) {
        super(model, length,Furniture_id);
    }
    @Override
    public void toPaint() {
        Scanner scan = new Scanner(System.in);
        System.out.print("choose the color: ");
        String color = scan.nextLine();
        System.out.println("Color is" + color);
    }
    public void readModel() throws Exception {
        Scanner inModel = new Scanner(System.in);
        System.out.print("choose model: ");
        String newModel = inModel.nextLine();
        if (newModel.equals("")){
            throw new Exception(newModel);
        }
        else {
            this.model = newModel;
        }
    }
    public void Info(){
        System.out.println("model:"+model);
        System.out.println("length:"+length);
        System.out.println("ID:"+Furniture_id);
    }



}