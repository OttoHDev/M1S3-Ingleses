import Heranca.Aluno;
import Heranca.Funcionario;
import Heranca.Pessoa;
import HerancaAnimais.*;
import RevisaoPOO.aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Inicio Aula 1 ----------------------------------------------
        //------------------------------------------------------------
        /*aluno novoAluno = new aluno();

        novoAluno.setMatricula("123dfg");
        novoAluno.setCEP("000000-000");*/

        /*Aluno aluno01 = new Aluno("111.111.123-66", "Fulano", 22, "POO", 2);*/

        //Inicio Aula 2 ----------------------------------------------
        //------------------------------------------------------------

        /*Cachorro dog = new Cachorro("Totó", "Marron", false);
        Gato cat = new Gato("Missi", "Tricolor", true);
        Sapo frog = new Sapo("Kako", "Verde");
        Morcego bat = new Morcego("Dracula", "Branca", false);

        System.out.print("\nO cachorro "+dog.nome+" da cor "+dog.corPelo+" está ");
        //dog.andar();
        System.out.print("\nO gato "+cat.nome+" da cor "+cat.corPelo+" está ");
        //cat.andar();
        System.out.print("\nO sapo "+frog.nome+" da cor "+frog.corPele+" está ");
        //frog.andar();
        System.out.print("\nO morcego "+bat.nome+" da cor "+bat.corPelo+" está ");
        bat.andar();*/

        /*Scanner ler = new Scanner(System.in);
        int opc;

        System.out.println("Escolha o animal a ser apresentado!");
        System.out.println("[1] Totó\n[2] Missi\n[3] Kako\n[4] Dracula");
        System.out.print("Escolha sua opção: ");
        opc = ler.nextInt();

        switch (opc){
            case 1:
                Cachorro dog = new Cachorro("Totó", "Marron", false);
                System.out.println(dog.nome+" da cor "+dog.corPelo);
                System.out.println("Locomover: "+dog.locomover());
                System.out.println("Comunicar: "+dog.comunicar());
                System.out.println("Atacar: "+dog.atacar());
                System.out.println("Comer: "+dog.comer());
                break;
            case 2:
                Gato cat = new Gato("Missi", "Tricolor", true);
                System.out.println(cat.nome+" da cor "+cat.corPelo);
                System.out.println("Locomover: "+cat.locomover());
                System.out.println("Comunicar: "+cat.comunicar());
                System.out.println("Atacar: "+cat.atacar());
                System.out.println("Comer: "+cat.comer());
                break;
            case 3:
                Sapo frog = new Sapo("Kako", "Verde");
                System.out.println(frog.nome+" da cor "+frog.corPele);
                System.out.println("Locomover: "+frog.locomover());
                System.out.println("Comunicar: "+frog.comunicar());
                System.out.println("Atacar: "+frog.atacar());
                System.out.println("Comer: "+frog.comer());
                break;
            case 4:
                Morcego bat = new Morcego("Dracula", "Branca", false);
                System.out.println(bat.nome+" da cor "+bat.corPelo);
                System.out.println("Locomover: "+bat.locomover());
                System.out.println("Comunicar: "+bat.comunicar());
                System.out.println("Atacar: "+bat.atacar());
                System.out.println("Comer: "+bat.comer());
                break;
            default:
                System.out.println("Código Inválido");
        }*/

        /*Pessoa pessoa01 = new Aluno("111.111.111-45","Ciclana", 19, "Artes", 1);
        Pessoa pessoa02 = new Funcionario("222.222.222-55", "Marcia",23,1200.00);

        //ArrayList<Aluno> listaAlunos = new ArrayList<>();
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        listaPessoas.add(pessoa01);
        listaPessoas.add(pessoa02);

        //listaAlunos.add((Aluno)pessoa01);

        System.out.println(pessoa01.getClass());
        System.out.println(pessoa02.getClass());*/

        int opc = 0;
        ArrayList<Animal> listaAnimais = new ArrayList<>();
        String nome;

        System.out.println("Escolha o animal a cadastrado!!");
        System.out.println("[1] Cachorro\n[2] Gato\n[3] Morcego\n[4] Sapo\n [5] Sair");
        System.out.print("Escolha sua opção: ");


        do{
            Scanner ler = new Scanner(System.in);
            System.out.println("Escolha o animal a cadastrado!!");
            System.out.println("[1] Cachorro\n[2] Gato\n[3] Morcego\n[4] Sapo\n [5] Sair");
            System.out.print("Escolha sua opção: ");
            opc = ler.nextInt();

            switch (opc){
                case 1:
                    //Adição do cachorro
                    System.out.print("\nNome do Cachorro: ");
                    nome = ler.nextLine();
                    Animal novoDog = new Cachorro(nome,"Preto", false);
                    listaAnimais.add(novoDog);
                    break;
                default:
                    System.out.println("Opção Inválida!!!");
            }



        }while (opc != 5);

















    }
}