package exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {
        
    
    int idade;
    float altura;
    int opcao;
    int index;
    String nome;
        
        Agenda agenda = new Agenda(10);
        
        Scanner read = new Scanner(System.in);
        
        while (true) {
        
        System.out.println("1. Armazenar pessoa");
        System.out.println("2. Remover pessoa");
        System.out.println("3. Buscar pessoa");
        System.out.println("4. Imprimir agenda");
        System.out.println("5. Imprimir indice especifico da agenda");
        System.out.println("6. Encerrar o programa");
        opcao = Integer.parseInt(read.nextLine());
        
        switch (opcao) {
            
            case 1 -> {
                
                System.out.print("Insira o nome da pessoa --> ");
                nome = read.nextLine();
                System.out.print("Insira a idade da pessoa --> ");
                idade = Integer.parseInt(read.nextLine());
                System.out.print("Insira a altura da pessoa (com ponto) --> ");
                altura = Float.parseFloat(read.nextLine());
                
                agenda.armazenapessoa(nome, idade, altura);
                break;
        }
            
            case 2 -> {
                
                System.out.println("Informe o nome da pessoa que deseja remover");
                nome = read.nextLine();
   
                agenda.removepessoa(nome);
                break;
                
            }
            
            case 3 -> {
                
                System.out.println("Informe o nome da pessoa que deseja procurar");
                nome = read.nextLine();
                agenda.buscapessoa(nome);
                
                
            }
            
            case 4 -> {
                
                agenda.imprimeagenda();
                
            }
            
            case 5 -> {
                
                System.out.println("Informe o indice da pessoa que deseja imprimir");
                index = Integer.parseInt(read.nextLine());
                agenda.imprimepessoa(index);
                
            }
            
            case 6 -> {
                
                System.exit(0);
                
            }
            }
        
            
    }
    
}
}
