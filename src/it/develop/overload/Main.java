package it.develop.overload;

public class Main {
    public static void main(String[] args) {

        Shape shape=new Shape();
        shape.getShapeDetails();

        Shape cerchio=new Shape(2.4);
        cerchio.getShapeDetails();


        Shape quadrato=new Shape(4,4.4);
        quadrato.getShapeDetails();

        Shape rettangolo=new Shape(4,3.2,3.2);
        rettangolo.getShapeDetails();

        Shape triangolo=new Shape(3,2.5,5.2,5.2);
        triangolo.getShapeDetails();

    }


    }
