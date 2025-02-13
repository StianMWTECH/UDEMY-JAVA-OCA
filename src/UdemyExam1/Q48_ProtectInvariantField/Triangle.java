package UdemyExam1.Q48_ProtectInvariantField;

public class Triangle{
    public int base;
    public int height;
    public double area;

//    To protect the invariant "area", simply remove the public modifier from all of the above fields

    public Triangle(int base, int height){
        this.base = base; this.height = height;
        updateArea();
    }

    void updateArea(){
        area = base*height/2;
    }
    public void setBase(int b){ base  = b; updateArea(); }
    public void setHeight(int h){ height  = h; updateArea(); }
}
