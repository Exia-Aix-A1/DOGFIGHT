package jpu2016.dogfight.model;

/**
 * Created by Mandel on 31/05/2017.
 */
public class Position {

    private double x;
    private double y;

    private double maxX;
    private double maxY;


    public Position(final double x, final double y, final double maxX, final double maxY){
        this.setMaxX(maxX);
        this.setMaxY(maxY);
        this.setX(x);
        this.setY(y);
    }
    //Mutateur
    public void setX(double x) {
        if(x < this.getMaxX())
        {
            this.x = x;
        }
        else{
            this.x = this.getMaxX();
        }

    }
    public void setY(double y) {
        if(y < this.getMaxY())
        {
            this.y = y;
        }
        else{
            y = this.getMaxY();
        }
    }

    public void setMaxX(double maxX) {
        this.maxX = maxX;
    }
    public void setMaxY(double maxY) {
        this.maxY = maxY;
    }

    //Assesseur
    public double getMaxX() {
        return maxX;
    }
    public double getMaxY() {
        return maxY;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}
