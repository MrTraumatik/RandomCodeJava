

public class Point {
/**
 * Objet de la classe : un Point.
 */
    private double x;       //son abssice.
    private double y;       //son ordonnée.
    public static final Point ORIGINE=new Point(0,0);
    
    /**
     * Création du point.
     */
    public Point(double x, double y){
        this.x=x;
        this.y=y;

    }
    /**
     * Déplacer le point 
     * @param dx la distance à ajouter à x.
     * @param dy la distance à ajouter à y.
     * @return retourne le point a sa nouvelle position.
     */
    public Point move(double dx, double dy){
        this.x+=dx;
        this.y+=dy;
        return new Point(x,y);
    }
    /**
     * retourne le x.
     */
    public double getX(){
        return x;
    }
    /**
     * retourne le y.
     */
    public double getY(){
        return y;
    }
    /**
     * Affiche en string la position du point.
     */
    public void display(){
        System.out.println("("+x+","+y+")");
    }
    /**
     * change les 'println' avec la position?
     */
    public String toString(){
        return "("+x+","+y+")";
    }
    /**
     * @return la distance entre le point et un autre donné en param.
     */
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y, 2));
    }
    /**
     * @return la distance entre le point et l'origine.
     */
    public double distance(){
        return distance(ORIGINE);
    }
    
    public Point middle(Point p){
        double newX = (this.x+p.x)/2;
        double newY = (this.y+p.y)/2;
        return new Point(newX, newY);
    }
}
