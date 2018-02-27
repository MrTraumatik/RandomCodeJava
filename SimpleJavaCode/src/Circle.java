/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author dedec
 */
public class Circle {

    private Point centre;
    private double rayon;
    public static final double PI = Math.PI;
    
    public Circle(Point centre, double rayon){
        this.centre=centre;
        this.rayon=rayon;
    }
    
    public Point getCenter(){
        return centre;        
    }

    public double getRayon(){
        return rayon;
    }
    
    public double getDiamètre(){
        return rayon*2;
    }
    
    public String toString(){     
        return "cercle de centre "+ centre + "et de rayon " + rayon;
    }
    
    public Circle move(double dx, double dy){
        centre = centre.move(dx, dy);
        return new Circle(centre, rayon);
    }
    
    public double surface(){
        return Math.PI*Math.pow(rayon, 2);
    }
    
    public boolean isInCircle(Point p){
        double cX = centre.getX();
        double cY = centre.getY();
        double pX = p.getX();
        double pY = p.getY();
        return (Math.pow(pX-cX, 2) + Math.pow((pY-cY),2)) <= Math.pow(rayon, 2);
    }
    
    public boolean intersection(Circle otherCercle){
        
        double r = rayon-otherCercle.rayon;
        double r2 = rayon+otherCercle.rayon;
        
        double cX = centre.getX();
        double cY = centre.getY();
        double pX = otherCercle.centre.getX();
        double pY = otherCercle.centre.getY();
                
        boolean condition1 = Math.pow(r, 2)<= (Math.pow(pX-cX, 2) + Math.pow((pY-cY),2));
        boolean condition2 = Math.pow(r2, 2)>= (Math.pow(pX-cX, 2) + Math.pow((pY-cY),2));
        
        return condition1 && condition2;
        
    }
     public Circle makeCircle(Point p1, Point p2){
      double distance = p1.distance(p2);
      double rayonR = distance/2;
      double x = p1.getX()+p2.getX() /2;
      double y = p1.getY()+p2.getY() /2;
      
      Point centreC = new Point(x, y);
      
      return new Circle(centreC, rayonR);
      
      
    }
    
   
    



    
}
