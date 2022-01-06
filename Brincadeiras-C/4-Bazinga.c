/*

No oitavo episodio da segunda temporada do seriado The Big Bang Theory, The Lizard-Spock Expansion, Sheldon e Raj discutem qual dos dois é o melhor:
 o filme Saturn 3 ou a série Deep Space 9. A sugestão de Raj para a resolução do impasse é uma disputa de Pedra-Papel-Tesoura. 
 Contudo, Sheldon argumenta que, se as partes envolvidas se conhecem, entre 75% e 80% das disputas de Pedra-Papel-Tesoura terminam empatadas, e então sugere o Pedra-Papel-Tesoura-Lagarto-Spock.

As regras do jogo proposto são:

a tesoura corta o papel;
o papel embrulha a pedra;
a pedra esmaga o lagarto;
o lagarto envenena Spock;
Spock destrói a tesoura;
a tesoura decapita o lagarto;
o lagarto come o papel;
o papel contesta Spock;
Spock vaporiza a pedra;
a pedra quebra a tesoura.

Embora a situação não se resolva no episódio (ambos escolhem Spock, resultando em um empate), não é dificil deduzir o que aconteceria se a disputa continuasse. 
Caso Sheldon vencesse, ele se deleitaria com a vitória, exclamando "Bazinga!"; caso Raj vencesse, ele concluiria que "Raj trapaceou!"; caso o resultado fosse empate, ele exigiria nova partida: "De novo!". 
Conhecidas as personagens do jogo escolhido por ambos, faça um programa que imprima a provável reação de Sheldon.


Entrada
A entrada consiste em uma série de casos de teste. A primeira linha contém um inteiro positivo T (T = 100), que representa o número de casos de teste. 
Cada caso de teste é representado por uma linha da entrada, contendo as escolhas de Sheldon e Raj, respectivamente, separadas por um espaço em branco. 
As escolha possíveis são as personagens do jogo: pedra, papel, tesoura, lagarto e Spock.

Saida
Para cada caso de teste deverá ser impressa a mensagem "Caso #t: R", onde t é o número do caso de teste (cuja contagem se inicia no número um) e R é uma das três reações possíveis de Sheldon: "Bazinga!", "Raj trapaceou!", ou "De novo!".

*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//Função que compara as entradas.
void verificador(char raj[], char shel[], char R[]){
    
    //Caso as entradas forem iguais.
    if((strcmp(raj, shel)==0)){
        strcpy(R, "De novo!");
    }
    else{//Pensando em uma forma melhor...
    	if((strcmp(raj, "tesoura")==0)){
        //condição de vitória
        	if(strcmp(shel,"papel")==0 || strcmp(shel,"lagarto")==0){
           		strcpy(R, "Raj trapaceou!");
        	}
        	else{
            	strcpy(R, "Bazinga!");
        	}
    	}
    	
    	else if((strcmp(raj, "pedra")==0)){
    		if(strcmp(shel,"tesoura")==0 || strcmp(shel,"lagarto")==0){
           	strcpy(R, "Raj trapaceou!");
        	}
        	else{
            	strcpy(R, "Bazinga!");
        	}
		}
		
		else if((strcmp(raj, "papel")==0)){
			if(strcmp(shel,"pedra")==0 || strcmp(shel,"spock")==0){
            	strcpy(R, "Raj trapaceou!");
        	}
        	else{
            	strcpy(R, "Bazinga!");
        	}
		}
		else if((strcmp(raj, "lagarto")==0)){
			if(strcmp(shel,"papel")==0 || strcmp(shel,"spock")==0){
           		strcpy(R, "Raj trapaceou!");
        	}
        	else{
            	strcpy(R, "Bazinga!");
        	}
		}
		else{
			if(strcmp(shel,"tesoura")==0 || strcmp(shel,"pedra")==0){
            	strcpy(R, "Raj trapaceou!");
        	}
        	else{
            	strcpy(R, "Bazinga!");
        	}
		}
    	
	}//Final else
}//Final função.

int main() {
    int T, t = 1;
    //Tamanho com base na maior opção "tesoura" para raj e shel. R com base na maior string de saída.
    char raj[7],shel[7], R[14];
    
    scanf("%d",&T);
    while(T>100 || T<1){
    	
        scanf("%d",&T);
    }
    
    while(T){

        fflush(stdin);
        
        scanf("%s %s", raj, shel);//Sem verificação de entrada.
        
        verificador(raj, shel, R);

        printf("Caso #%d: %s\n\n",t, R);
        t++;
        T--;                 
    }

    return 0;
}