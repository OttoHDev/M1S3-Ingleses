import Login.Login;

import java.util.ArrayList;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        try{
            System.out.print("Digite seu nome: ");
            String nome = ler.nextLine();

            if(nome.isBlank()){
                throw new Exception("O nome não foi informado!!!");
            }
            System.out.println("Meu nome é "+nome);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Programa desenvolvido no FuturoDEV");
        }


        //Lista de Login
        /*ArrayList<Login> listaLogin = new ArrayList<>();
        Login log01 = new Login("Otto", 12347);
        listaLogin.add(log01);
        Login log02 = new Login("João", 12345);
        listaLogin.add(log02);
        Login log03 = new Login("Fulano", 22222);
        listaLogin.add(log03);
        Login log04 = new Login("Ciclano", 11111);
        listaLogin.add(log04);
        Login log05 = new Login("Ana", 77777);
        listaLogin.add(log05);

        //Variaveis
        String usuario;
        int senha;
        boolean acesso = false;
        Scanner ler = new Scanner(System.in);

        try{
            System.out.print("Digite o usuário: ");
            usuario = ler.nextLine();
            System.out.print("Digite a senha: ");
            senha = ler.nextInt();

            //if()

            //listaLogin
            for (Login item : listaLogin) {
                if(usuario.equals(item.usuario)){
                    if(senha == item.senha){
                        acesso = true;
                    }
                }
            }
        }catch (Exception ex){
            System.out.println("ERRO!!!");
        }*/

        /*Scanner ler = new Scanner(System.in);
        final int senhaSecreta = 123456;

        try{
            System.out.print("Digite a Senha: ");
            int senha = ler.nextInt();

            if(senha == senhaSecreta){
                System.out.println("BEM VINDO AO FUTURODEV!!!");
            }
            else{
                throw new Exception("Senha Inválida!!!");
            }

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }*/

        /*try{
            System.out.print("Digite o 1º número: ");
            int num1 = ler.nextInt();
            System.out.print("Digite o 2º número: ");
            int num2 = ler.nextInt();

            System.out.print("\n"+num1+" + "+num2+" = "+(num1+num2));
        }
        catch (Exception ex){
            System.out.println("ERRO - Valor informado não é um número!!!");
        }*/




    }

}
