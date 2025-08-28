public class shape {
    public void  draw(double l,double b){
        double area=l*b;
        System.out.println("Area of rectangle:"+area);
    }

    public void draw(double l)
    {
        double area=l*l;
        System.out.println("Area of square:"+area);
    }

    public static void main(String[] args) {
        shape s=new shape();
        s.draw(5);
        s.draw(5,10);
    }
}
