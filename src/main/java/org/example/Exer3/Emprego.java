package org.example.Exer3;

public class Emprego {
String nome;
String cargo;
Double salario;

void reajuste(Double porcentagem){
salario += salario * (porcentagem/100);
}
void mostrar(){
    System.out.printf("""
                Nome: %s
                Cargo: %s
                Salario: %.2f
                """.formatted(nome,cargo,salario));
}
}
