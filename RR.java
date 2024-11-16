/**
   @author Josué Juárez García
   Carnet: 24001878
   Sección: B
   
   @author Herber Josue Gómez Esquit
   Carnet: 24001878
   Sección: B
**/
package scheduler.scheduling.policies;
import scheduler.processing.*;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.LinkedList;

public class RR extends Policy implements Enqueable{

   LinkedList<SimpleProcess> rr_lista = new LinkedList<>();
   int quantum = 0;

   public RR(int q){
      super();
      this.quantum = q;
   }
   public int getQuantum(){
      return this.quantum;
   }

   public void add(SimpleProcess p){
      rr_lista.add(p);
   }

   public void remove(){
      if (!rr_lista.isEmpty()){
         rr_lista.removeFirst();
      }
   }

   public SimpleProcess next(){
      if (rr_lista.isEmpty()){
            return null;
      }else{
        SimpleProcess Pcambio = rr_lista.removeFirst();
        rr_lista.addLast(Pcambio);
        return Pcambio;
      }
   }
}  
