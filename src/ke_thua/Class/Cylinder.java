package ke_thua.Class;

public class Cylinder extends Circle{
    private float height = 0;
    public Cylinder(){
    }
    public Cylinder(float height){
        this.height = height;
    }
    public float getHeight(){
        return this.height;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public double getVolume(){
        return Math.PI*getRadius()*getRadius()*getHeight();
    }
    public String toString(){
        return "Hình trụ có bán kính "+ super.getRadius()+ " chiều cao"+ getHeight()+" có thể tích là "+ getVolume();
    }
}
