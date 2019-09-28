package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {


        int ant = 1;
        int prox = 0;
        int atual = 0;
        
        
        for (int i = 1; i <= 15; i++){
            prox = atual + ant ;
            System.out.println(prox);
            ant = atual;
            atual = prox;    
                
            }  
               
        }
        
    }
    

