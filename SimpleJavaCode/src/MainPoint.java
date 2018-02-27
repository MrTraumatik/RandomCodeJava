/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Richard
 */
public class MainPoint {
    
    public static void main(String[] args) {
        Point point1 = new Point(2, 3);
        Point point2 = new Point(4, 5);
        System.out.println("affiche le x de point1");
        System.out.println(point1.getX());
        System.out.println("affiche le y de point 2");
        System.out.println(point2.getY());
        System.out.println("affiche le point1 move 5-7");
        System.out.println(point1.move(5, 7));
        System.out.println("affiche la distance point1 a point 2");
        System.out.println(point1.distance(point2));
        System.out.println("distance ordonné à origine");
        System.out.println(point1.distance());
        System.out.println("le milieu de 1 et 2");
        System.out.println(point1.middle(point2));
        
        
    }
    
}
