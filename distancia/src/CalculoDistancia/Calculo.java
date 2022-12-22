package CalculoDistancia;

public class Calculo {

    public Double distancia;
    public Double consumo;
    public Double resultado;
    public Double combustivel;
    public Double valorTotal;


    public Double calculoConsumo(double distancia, double consumo){
        this.distancia = distancia;
        this.consumo = consumo;

        this.resultado = distancia / consumo;

        return this.resultado;
    }

    public Double calculoCombustivel(double combustivel){
        this.combustivel = combustivel;
        this.valorTotal = resultado * combustivel;

        return this.valorTotal;

    }

}

