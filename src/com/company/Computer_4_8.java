/*
使用内部类创建一个类Computer（计算机），使用该类的对象可以存储有关操作系统，处理器和RAM的信息。
 */
package com.company;
import java.util.*;

public class Computer_4_8 {
    public static void main(String[] args) {
        Computer_4_8 com = new Computer_4_8();
        com.info.print();

    }
    public static Scanner scan = new Scanner(System.in);
    public String computer;
    public info info;
    public Computer_4_8(){
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
        String sys,cpu,ram;
        public info(){
            System.out.println("Enter system:");
            setSys(scan.nextLine());
            System.out.println("Enter cpu:");
            setCpu(scan.nextLine());
            System.out.println("Enter ram:");
            setRam(scan.nextLine());
        }
        public String getSys(){
            return sys;
        }
        public String getCpu(){
            return cpu;
        }
        public String getRam(){
            return ram;
        }
        public void setSys(String sys){
            this.sys = sys;
        }
        public void setCpu(String cpu){
            this.cpu = cpu;

        }
        public void setRam(String ram){
            this.ram = ram;
        }
        public void print(){
            System.out.println("Computer "+getCom()+":"+getSys()+" system,"+getCpu()+" cpu,"+getRam()+" ram.");
        }
    }

}


