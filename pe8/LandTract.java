package pe8;

public class LandTract {
    private double length;
    private double width;

    public LandTract(){

    }
    public LandTract(double length, double width ){
        this.length = length;
        this.width = width;
    }

    // Getters
    public double getLength(){return length;}
    public double getWidth(){return width;}

    // Setters
    public void setLength(double l){ length = l;}
    public void setWidth(double w){width = w;}

    public double getArea(double length, double width){
        return length*width;
    }

    public boolean equals(LandTract l2){
        if(l2 == null){
            return false;
        } else{
            return (length == l2.length && width == l2.width);
        }
    }

    @Override
    public String toString(){
        return "Landtrack : \nLength : "+ length + "\nWidth " + width + "\nArea " + getArea(length, width);
    }

    
}
