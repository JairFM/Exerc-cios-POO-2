
package exercicio2;

public class Pessoa {
    
    String nome;
    int idade;
    float altura;
    
    public Pessoa (String nome, int idade, float altura) {
        
        this.nome = nome;
        this.idade = idade;
        this.altura = altura; 
    }
    
    public void setname (String nomes) {
        nomes = nome;
        
    }
    public String getname() {
        
        return nome;
    }
    
    public void setidade(int idades) {
        
        idades = idade;
        
    }
    
    public int getidade(){
        
        return idade;
    }
    
    public void setaltura (float alturas) {
        
        alturas = altura;
        
    }
    
    public float getaltura() {
        
        return altura;
    }
    
}


