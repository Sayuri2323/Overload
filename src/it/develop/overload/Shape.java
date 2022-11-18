package it.develop.overload;

public class Shape {

    public String shapeName;
    public int numberOfEdges;


    public Shape(){
        this.shapeName="Undefined shape";
        System.out.println("created a new shape: "+shapeName);

    }

    public Shape(double raggio){
        this.shapeName="cerchio";
        System.out.println(getShapeDetails());


    }
    public Shape(int edges, double edgeLength){
        this.shapeName="quadrato";
        this.numberOfEdges=edges;

        System.out.println(getShapeDetails());

    }
    public Shape(int edges, double e1, double e2){
        this.shapeName="rettangolo";
        this.numberOfEdges=4;
        System.out.println(getShapeDetails());

    }
    public Shape(int edges, double e1, double e2, double e3){
        this.shapeName="triangolo";
        this.numberOfEdges=3;
        System.out.println(getShapeDetails());

    }
    public String getShapeDetails(){
        return "shape: "+shapeName+" number of edges: "+numberOfEdges;

    }



}
