package CalculoDistancia;

import javax.swing.JOptionPane;

public class AppConsumo {

    public static void main (String[] args){

        Calculo calculo = new Calculo();

        String valorDistancia;
        String valorConsumo;
        String valorCombustivel;

        Object[] continuar = {"Sim", "Não"};
		Object desejaContinuar; 

        do{
            valorDistancia = JOptionPane.showInputDialog("Qual a distancia em KM do seu trajeto? ");
            valorConsumo = JOptionPane.showInputDialog("Qual o consumo em Km/L do seu veiculo? ");
            valorCombustivel = JOptionPane.showInputDialog("Qual o valor do Combustivel que usou para abastecer");

            valorDistancia = valorDistancia.replace(",",".");
            valorConsumo = valorConsumo.replace(",", ".");
            valorCombustivel = valorCombustivel.replace(",",".");

            JOptionPane.showMessageDialog(null,"Voce vai utilizar " + String.format("%.2f", calculo.calculoConsumo(Double.parseDouble(valorDistancia),Double.parseDouble(valorConsumo)))+ " litros de combustivel. \n" 
            + "E custara "+ String.format("%.2f", calculo.calculoCombustivel(Double.parseDouble(valorCombustivel))) +" reais em combustivel");


            desejaContinuar = JOptionPane.showInputDialog(null, "Deseja realizar uma nova operação ?", "Sim", JOptionPane.INFORMATION_MESSAGE, null, continuar, continuar[0]);
        }while(desejaContinuar == "Sim");
		
		// Encerrar o programa
		System.exit(0);


    }
    
}
