package org.example.Exer3;

public class App {
    public static void main(String[] args) {
        Emprego emprego1 = new Emprego();
        Emprego emprego2 = new Emprego();

        emprego1.nome = "João";
        emprego1.cargo = "Analista de sistemas";
        emprego1.salario = 5400.0;
        emprego1.mostrar();
        System.out.println("-------------------------");
        emprego2.nome = "Felipe";
        emprego2.cargo = "Gerente de sistemas";
        emprego2.salario = 7800.0;
        emprego2.mostrar();
    }
}
