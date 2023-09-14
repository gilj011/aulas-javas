package org.example.Registro;

import java.util.Random;
import java.util.Scanner;

public class Usuario {
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

public void menu(){
    System.out.println("""
            \n\n\n\n\n\n\n
            Seja bem Vindo %s 
            O que você deseja fazer hoje?
            
            1-Ver o funcionamento dos componentes
           
            2- Sair
            """);
    Integer escolhaMenu = scanner.nextInt();
    switch (escolhaMenu){
        case 1:
            monitoramento();
            break;
        case 2 :
            sair();
    }


}
public void monitoramento(){
    Random gerador = new Random();
    Double usoCPU = gerador.nextDouble() * 96; ;
    Double usoRam = gerador.nextDouble() * 96; ;
    Double usoDisco = gerador.nextDouble() * 96; ;



    System.out.println("""
            Uso do disco: %.2f%
            Uso do CPU: %.2f%
            Uso do RAM: %.2f%
            
            1- Medir novamente
            2- Voltar
            """.formatted(usoDisco,usoCPU, usoRam));
    Integer escolhaMonitoramento = scanner.nextInt();
    switch (escolhaMonitoramento){
        case 1:
            monitoramento();
        case 2:
            menu();
    }
}
public void sair(){
    System.exit(0);
}




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
