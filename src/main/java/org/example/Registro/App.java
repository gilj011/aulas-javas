package org.example.Registro;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario admin = new Usuario("admin","admin@admin.com","admin");

            System.out.println("""
                Olá, seja bem vindo
                O que deseja?
             
                1-Login
                2-Sair
                
                """);
            Integer respostaInicio = scanner.nextInt();
            Boolean sucesso = false;
            if (respostaInicio == 1){

                while (!sucesso){
                    System.out.println("""
                            Digite seu email:
                            """);
                    String email = scanner.next();

                    System.out.println("""
                            Digite sua senha:
                            """);
                    String senha = scanner.next();
                    if (email.equalsIgnoreCase(admin.getEmail()) && senha.equals(admin.getSenha())){
                        System.out.println("""
                                \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n
                                Você foi logado com sucesso, seja bem vindo %s
                                """.formatted(admin.getNome()));
                        sucesso = true;
                        admin.menu();
                    }else{
                        System.out.println("""
                                Login ou senha invalidos, tente novamente!
                                
                              
                                """);


                         }
                }

            }

    }
}
