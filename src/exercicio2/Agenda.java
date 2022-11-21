package exercicio2;


public class Agenda {
    
    private final Pessoa pessoas[];
    
    public Agenda(int tamanho) {
            
        pessoas = new Pessoa [tamanho];
       } 
        
    
    void armazenapessoa (String nome, int idade, float altura) {
        
        boolean sucesso = false;
        
        for (int i = 0; i < pessoas.length; i++) {
            
            if (pessoas[i] == null) {
                
                Pessoa dados = new Pessoa (nome, idade, altura);
                pessoas[i] = dados;
                sucesso = true;
                break;
                
            }
                
          }
        if (sucesso == true) {
                
                System.out.println("<< Pessoa armazenada com sucesso >> ");
                
            } else {
                System.out.println("<< Erro. Sem espaço para armazenar >> ");
            
        }
        
      
               
        
        
    }
    
    void removepessoa (String nome) {
        
        boolean removido = false;
        
        for (int i = 0; i < pessoas.length; i++) {
            
            if (pessoas[i] != null ) {
                
                if (pessoas[i].getname().equals(nome)) {
                    
                    pessoas[i] = null;
                    removido = true;
                    break;
                    
                }
            }
            
        }
        if (removido == true) {
            
            System.out.println("<< Pessoa removida com sucesso >>");
            
        } else {
            
            System.out.println("<< Erro ! Pessoa nao encontrada >>");
            
        }
        
    }
    
    int buscapessoa(String nome) {
        
        int position = 0;
        
        for (int i = 0; i < pessoas.length; i++) {
            
            if (pessoas[i] != null) {
                
                if (pessoas[i].getname().equals(nome)) {
                    
                    position = i;
                    System.out.println("<< A pessoa esta na posicao: "+ position + " >>");
                    break;
                    
                } 
                
            } else {
                
                System.out.println("A pessoa nao existe");
                break;
                
            }
            
        }  
        return position;
    }
    
    void imprimeagenda () {
        
        
            
            for (int i = 0; i < pessoas.length; i++) {
                
                if (pessoas[i] != null) {
                    
                Pessoa dados = pessoas[i];
                System.out.print("\nNome da " + (i+1) + "a pessoa --> " + dados.getname());
                System.out.print("\nIdade da " + (i+1) + "a pessoa --> " + dados.getidade());
                System.out.print("\nAltura da " + (i+1) + "a pessoa --> " + dados.getaltura());
                
                    
                }
                
                
            }
            
        }
    
    void imprimepessoa(int index) {
        
        if (index < 0 || index > (pessoas.length - 1)) {
            
            System.out.println("<< O indice nao existe >>");
            
        } else {
            
            Pessoa dados = pessoas[index];
            
            if (dados == null) {
            
                System.out.println("Nao ha pessoas nesta posicao");
            
        } else {
                
            System.out.print("<< Dados da posicao "+ index +" encontrados com sucesso. >>");
            System.out.print("\nNome --> "+ dados.getname());
            System.out.print("\nIdade --> "+ dados.getidade());
            System.out.print("\nAltura --> "+ dados.getaltura() + "\n");
                
            }
        }      
    }
        
    }
    

