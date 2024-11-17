/** Clase B

   @author Jose Antonio Cruz Barrios
   Carnet: 24000463
   
   @author Josue Juarez Garcia
   Carnet:24001878
**/
import scheduler.*;
public class ProcessScheduler{
    //// clase para iniciar los procesos unicamente//////
        /////////////////////////////////////////
        //////////campos definidos//////////////
        
        public static void main(String[]args){
            if (args.length < 6 || args[0] == null || args[1] == null || args[2] == null || args[3] == null || args[4] == null || args[5] == null){
                System.out.println(" |ERROR| SE REQUIEREN AL MENOS 6 ARGUMENTOS ");
                return;
            }
            Scanner scanner = new Scanner(System.in);
            Thread inSalida = new Thread(new Runnable() {
            public void run(){
                String ingreso ="";
                while (true){
                    ingreso = scanner.nextLine();
                    if (input.equalsIgnoreCase("q") || input.isEmpty()){
                        System.out.println("Saliendo...");
                        System.exit(0);
                    }
                }
              }
            });
            inSalida.start();
          
            try{
                the_process cpu = new the_process(args);
            

            switch(args[0]){
                case "-fcfs":
                    System.out.println(" politica FCFS sleccionada.");
                    cpu.start_process();
                    break;

                case "-lcfs":
                    System.out.println(" politica LCFS sleccionada.");
                    cpu.start_process();
                    break;

                case "-pp":
                    System.out.println(" politica PP sleccionada.");
                    cpu.start_process();
                    break;

                case "-rr":
                    System.out.println(" politica Round Robin sleccionada.");
                    cpu.start_process();
                    break;

                case "-dual":
                    System.out.println(" Politica Dual seleccionada. ");
                    cpu.start_process();
                    break;

                default:
                    System.out.println("politica no valida"+args[0]);
                    break;

        }
         }catch(Exception e){
            System.out.println(" error ejecucion "+e.getMessage());
         }
        

    }

}
