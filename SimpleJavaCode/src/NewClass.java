import java.util.LinkedList;
import java.util.Queue;

public class NewClass {
    public static int findMax(Queue q, int tailletemp, int taille){
        int current;
        int max=0;
        for(int i=1;i<=taille;i++){
            current=(int) q.remove();
            if((current>max)&&(i<tailletemp)){
                max=current;
            }
            q.add(current);
        }
        return max;
    }
    
    public static void order(Queue q, int max,int taille){
        int current;
        for(int i=1;i<=taille;i++){
            current=(int) q.remove();
            if(current!=max){
                q.add(current);
            }
        }
        q.add(max);
    }
    
    public static void sort(Queue q){
        Queue<Integer> newqueue=new LinkedList<>();
        int current;
        int taille = q.size();
        for(int i=0;i<taille;i++){
            current=(int) q.remove();
            if((current%2)!=0){
                newqueue.add(current);
            }
        }
        int max;
        int taillee=newqueue.size();
        for(int i=0;i<taillee;i++){
            max=findMax(q, taillee-i, taillee);
            order(q, max, taillee);
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(0);
        q.add(4);
        q.add(25);
        q.add(20);
        q.add(11);
        q.add(3);
        q.add(7);
        q.add(8);
        q.add(73);
        q.add(2);
        q.add(4);
        
        sort(q);
        
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
