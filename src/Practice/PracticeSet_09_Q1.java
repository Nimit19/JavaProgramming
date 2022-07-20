package com.company;

class Cylinder{
    private int Height;
    private int Radius;

    // -> For intellij Idea :
    // -> To make getter and setter : right click -> generate -> getter and setter

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getRadius() {
        return Radius;
    }

    public void setRadius(int radius) {
        Radius = radius;
    }

    public double surfaceArea(){
        return 2*Math.PI*Radius*Height + 2*Math.PI*Radius*Radius;
    }
    public double volume(){
        return Math.PI*Radius*Radius*Height;
    }

}
public class PracticeSet_09_Q1 {
    public static void main(String[] args) {

        Cylinder MyCylinder = new Cylinder();
        System.out.print("\n");

        MyCylinder.setHeight(10);
        MyCylinder.setRadius(5);
        System.out.println("Height : " + MyCylinder.getHeight());
        System.out.println("Radius : " + MyCylinder.getRadius());
        System.out.println("Surface Area of the cylinder : " + MyCylinder.surfaceArea());
        System.out.println("Volume of the cylinder : "+ MyCylinder.volume() );
        System.out.print("\n");

        MyCylinder.setHeight(12);
        MyCylinder.setRadius(9);
        int Height = MyCylinder.getHeight();
        int Radius = MyCylinder.getRadius();
        float Surface = (float)MyCylinder.surfaceArea();
        float Volume = (float)MyCylinder.volume();
        System.out.println("Height : " + MyCylinder.getHeight());
        System.out.println("Radius : " + MyCylinder.getRadius());
        System.out.println("Surface Area of the cylinder : " + Surface);
        System.out.println("Volume of the cylinder : " + Volume );
        System.out.print("\n");





    }
}
