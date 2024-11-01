package transito;

import javax.swing.JOptionPane; 
import java.io.IOException;

public class Principal {
    public static void main (String args[]) throws IOException{
        Transito[] transito = new Transito[5];
        
        for (int i = 0; i <5; i++)
        {
            transito[i] = new Transito();
        }
        
        ClasseMetodos m = new ClasseMetodos();
        
        int opc = 0;
        while (opc!=9)
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastra Estatístiva \n 2-Consulta por quantidade de acidentes \n 3-Consulta por estatísticas de acidentes \n 4-Acidentes acima de média das 10 cidades \n 9-FINALIZA"));
            
            switch(opc) {
                case 1: transito = m.CadastraEstatistica(transito);
                break;
                
                case 2: m.qtdAcidentes(transito);
                break;
                
                case 3: m.pMaiorMenor(transito);
                break;
                
                case 4: m.pAcima(transito);
                break;
                      
                case 9: JOptionPane.showMessageDialog(null, "FINALIZADO");
                break;
                
                default: JOptionPane.showMessageDialog(null, "Opção inválida"); 
            }
        }
    }
}
