package be.vdab.oefcursus;

/**
 * Created by Vontjen on 18-6-2017 15:15.
 */
public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new MyPoint(x1,y1);
        v2 = new MyPoint(x2,y2);
        v3 = new MyPoint(x3,y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getPerimeter(){
        double perimeter = (v1.distance(v2))+(v1.distance(v3))+v2.distance(v3);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Triangle @ ("+v1.getX()+", "+v1.getY()+"), ("+v2.getX()+", "+v2.getY()+"), ("+v3.getX()+", "+v3.getY()+")";
    }

    public void printType(){
        if(v1.distance(v2)==v1.distance(v3) && v2.distance(v3)==v1.distance(v3)){
            System.out.println("equilateral");
        }else
            if(v1.distance(v2)==v1.distance(v3) || v2.distance(v3)==v3.distance(v1)){
                System.out.println("Scalene");
            }
            else
                if (v1.distance(v2)!= v1.distance(v3) && v2.distance(v3)!= v1.distance(v3));

    }


}
