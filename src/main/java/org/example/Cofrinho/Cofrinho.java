package org.example.Cofrinho;


import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {
   String proposito;
   Double dinheiro = 0.0;
   Boolean quebrado = false;


void depositar(Double dinheiroDeposito){
 dinheiro += dinheiroDeposito;
}
Double agitar(){
   Double random = ThreadLocalRandom.current().nextDouble(0, dinheiro);
   dinheiro -= random ;
   return random;
}
void quebrar(){
   quebrado = true;
}
}
