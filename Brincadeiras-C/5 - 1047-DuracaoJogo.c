/*
Tempo de Jogo com Minutos

Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .


*/

#include<stdio.h>

int main(){

	int Hi,Mi,Hf,Mf,horas = 0, minutos;
	scanf("%d %d %d %d",&Hi,&Mi,&Hf,&Mf);
	
	if(Hf>Hi || (Hf == Hi && Mf > Mi)){
		minutos = Hf*60+Mf  - (Hi*60+Mi);
	}
	else{ minutos = 24*60+(Hf*60+Mf - (Hi*60+Mi));	
	}
	
		horas = minutos/60;
		minutos = minutos%60;
				
	printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",horas,minutos);
	return 0;
}
