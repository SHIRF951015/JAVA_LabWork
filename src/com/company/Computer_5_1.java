package com.company;
import java.util.*;

public class Computer_5_1 {
    public static void main(String[] args) {
        Computer_5_1 com = new Computer_5_1();
        com.info.print();

    }
    public static Scanner scan = new Scanner(System.in);
    public String computer;
    public info info;
    public Computer_5_1(){
        System.out.println("Enter the computer name:");
        setCom(scan.nextLine());
        info = new info();
    }
    public String getCom(){
        return computer;
    }
    public void setCom(String computer){
        this.computer = computer;
    }
    public class info{
        String sys,cpu;
        int ram;
        public info(){
            System.out.println("Enter system:");
            try{
                setSys(scan.nextLine());
            }
            catch (InputMismatchException e){
                System.out.println("The input is incorrect, please re-enter");
            }
            System.out.println("Enter cpu:");
            try {
                setCpu(scan.nextLine());
            }
            catch (InputMismatchException e){
                System.out.println("The input is incorrect, please re-enter");
            }
            System.out.println("Enter ram:");
            try {
                setRam(scan.nextInt());
            }
            catch (InputMismatchException e){
                System.out.println("The input is incorrect, please re-enter");
            }
        }
        public String getSys(){
            return sys;
        }
        public String getCpu(){
            return cpu;
        }
        public int getRam(){
            return ram;
        }
        public void setSys(String sys){
            this.sys = sys;
        }
        public void setCpu(String cpu){
            this.cpu = cpu;

        }
        public void setRam(int ram){
            this.ram = ram;
        }
        public void print(){
            System.out.println("Computer "+getCom()+":"+getSys()+" system,"+getCpu()+" cpu,"+getRam()+" ram.");
        }
    }

}


