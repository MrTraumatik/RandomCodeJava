/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author dedec
 */
public class MainMoment {
    
    public static void main(String[] args) {
        
        int h1 = 04;
        int m1 = 53;
        int s1 = 16;
        Moment moment1 = new Moment(h1, m1, s1);
        System.out.println(moment1);
        
        int h2 = 23;
        int m2 = 06;
        int s2 = 06;
        Moment moment2 = new Moment(h2, m2, s2);
        System.out.println(moment2);
        
        int h3 = 23;
        int m3 = 59;
        int s3 = 59;
        Moment moment3 = new Moment(h3, m3, s3);
        System.out.println(moment3);
        
        //Comment créer un moment avec la méthode moment??????
        //System.out.println(Moment.Moment(03, 25, 49));
              
        // exactement le meme affichage que le sout!
        System.out.println(moment1.toString());
        
        System.out.println(moment1.getSec(h1, m1, s1));
        System.out.println(moment2.getMin(h2, m2, s2));
        System.out.println(moment3.getHour(h3, m3, s3));
        
        System.out.println(moment1.equals(moment3));
        System.out.println(moment1.equals(moment1));
        
        
        System.out.println(moment2.setToNull());
    
        
        System.out.println(moment1.compareTo(moment3));
        
        
    
    }
    
    
    
}
