package model;

public class Calculadora{
    /**
     * Projeto de uma calculadora simples que recebe duas notas do aluno
     * e retorna a média dele, em seguida sera implementada outro metodo 
     * simples que recebe duas notas e informa se o aluno foi aprovado caso tenha média acima
     * de 6.0 ou reprovado caso média esteja a baixo
     */
     
	public double calcular(double x, double y){
        double media = (x+y) * 0.5;
        return media;
    }
    
}