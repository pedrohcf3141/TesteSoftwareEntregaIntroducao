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
        // tratamento da função em caso de retorno negativo retorna -1
        if(media < 0.0){
            media = -1.0;
        }
        // tratamento da função em casos de valores superiores a 10 retorna 10
        else if(media >10.0){
            media = 10.0;
        }
        return media;
    }
    
    public String aprovacao(double x, double y){
        double media = (x+y) * 0.5;
        String resposta;
        /**
         * Inclusão de casos adiocionais para se familiarizar com os novos casos acima
         * foi pensado incluao de ifs para podermos ajustar para switch no proximo push
         */

        if (media < 0.0){
            resposta = "Media inválida, valor negativo";
        } else if (media < 6.0){
            resposta = "Aluno Reprovado";
        } else if (media <= 10.0){
            resposta = "Aluno Aprovado";
        } else {
            resposta = "Media inválida, valor superior a 10";
        }
        return resposta;
    }
}