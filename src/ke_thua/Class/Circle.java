package ke_thua.Class;

public class Circle {
    public float radius;
    public String color;

    public Circle(){
    }
    public Circle(float radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public float getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setRadius(float radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public String toTring(){
        return "Hình tròn bán kính "+radius+" có diện tích là "+ getArea();
    }
}
