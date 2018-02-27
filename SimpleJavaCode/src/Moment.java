/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author dedec
 */
public class Moment {
    
    private int hour;
    private int minute;
    private int seconde;
   
    
    public Moment(int hour, int min, int sec){
        if((hour<0)||(hour>23)||(min<0)||(min>59)||(min<0)||(sec<0)||(sec>59)){
            throw new IllegalArgumentException();
        }
     
        this.hour=hour;
        this.minute=min;
        this.seconde=sec;
    }
    
    public String toString(){
        return hour+"heures "+minute+"minutes "+seconde+"secondes" ;
    }

    public int getHour(int h, int m, int s){
        return h;
    }
    
    public int getMin(int h, int m, int s){
        return m;
    }
    
    public int getSec(int h, int m, int s){
        return s;
    }
    
    public boolean equals(Moment other){
        return ((this.hour==other.hour)&&(this.minute==other.minute)&&(this.seconde==other.seconde));
    }
    
    public Moment setToNull(){
        Moment mom0 = new Moment(00,00,00);
        return mom0;
    }
    
    public int toSeconds(Moment m){
        int totalSec=0;
        totalSec = (m.hour/3600) + (m.minute/60) + m.seconde ;
        return totalSec;
    }
    
    public int compareTo(Moment other){
        Moment momCourant = new Moment(this.hour, this.minute, this.seconde);
        int secMomCour = momCourant.toSeconds(momCourant);
        int secOther = other.toSeconds(other);
        if(secMomCour==secOther){
            return 0;
        }else if(secMomCour>secOther){
            return 1;
        }else{
            return -1;
        }
    }
    
    
}
