
package transito;

import javax.swing.*;

public class ClasseMetodos {
    public Transito[] CadastraEstatistica (Transito[]transito) 
    {
        for (int i = 0; i < 5; i++)
        {
            transito[i].codigocidade = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo da cidade"));
            transito[i].nomecidade = JOptionPane.showInputDialog("Informe o nome da cidade");
            transito[i].qtdacidentes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de acidentes"));
        }
        
    return transito;
    }
    
    public void qtdAcidentes(Transito[]transito)
    {
        for (int i = 0; i < 5; i++)
        {
            if (transito[i].qtdacidentes > 100 && transito[i].qtdacidentes < 500){
                System.out.println("A quantidade de acidentes da cidade " +transito[i].nomecidade+ " é de " +transito[i].qtdacidentes);
            }
        }
    }
    
    public void pMaiorMenor (Transito[]transito)
    {
        for(int i = 0; i < 4; i++)
        {
            for(int j = i+1; j < 5; j++)
            {
                if (transito[i].qtdacidentes > transito[j].qtdacidentes)
                {
                    Transito aux = transito[i];
                    transito[i] = transito[j];
                    transito[j] = transito[i];
                    
                    JOptionPane.showMessageDialog(null, transito[0].nomecidade+ " com " +transito[0].qtdacidentes+ " acidentes " + transito[4].nomecidade+ " com" +transito[4].qtdacidentes+" acidentes");
                }
            }
        }
    }
    
    public void pAcima (Transito[]transito)
    {
        int soma = 0;
        for (int i = 0; i < 5; i++)
        {
            soma += transito[i].qtdacidentes;
        }
        int media = soma/5;
        
        for (int i = 0; i < 5; i++)
        {
            if (transito[i].qtdacidentes > media)
            {
                System.out.println(transito[i].nomecidade+ " está acima da media");
            }
        }
        
    }
}
