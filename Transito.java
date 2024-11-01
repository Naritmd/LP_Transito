package transito;

class Transito{
int codigocidade;
String nomecidade;
int qtdacidentes; 

Transito(){
    this(0, " ", 0);
}

Transito(int cidade, String nome, int acidentes){
    codigocidade = cidade;
    nomecidade = nome;
    qtdacidentes = acidentes;
} 
}