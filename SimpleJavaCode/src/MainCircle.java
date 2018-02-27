/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Richard
 */
public class MainCircle {
    
    public static void main(String[] args) {
        Point centre = new Point(2, 5);
        Circle cercle = new Circle(centre, 3);
        System.out.println(cercle);
        System.out.println(cercle.surface());
        System.out.println(cercle.move(8, 5));
        Point otherPoint = new Point(10, 10);
        System.out.println(cercle.isInCircle(otherPoint));
        Point c = new Point(2, 10);
        Circle otherCercle = new Circle(c, 5);
        System.out.println(cercle.intersection(otherCercle));
        Circle newCercle = new Circle(c,0);
        System.out.println(newCercle.makeCircle(c, centre));
    }
    
}
