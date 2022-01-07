/*
César é um detetive que investiga uma série de roubos que acontecem em sua cidade. 
Em todo lugar que um crime acontece, a pessoa que cometeu tal crime deixa uma mensagem escrita, 
formada por letras maiúsculas e minúsculas. César conseguiu achar 
um padrão nestas mensagens e agora extrai um texto oculto em cada mensagem e pede a sua ajuda para tentar 
descobrir quem está cometendo tais crimes.

Entrada
A entrada é composta por vários casos de teste. A primeira linha contém um número inteiro C (2 <= C <= 99) 
relativo ao número de casos de teste. Nas C linhas seguintes, haverá mensagens codificadas, 
todas com um mesmo padrão em relação ao exemplo abaixo.

Saída
Para cada caso de teste de entrada do seu programa, você deve imprimir o texto extraído da mensagem original.

3
NoTApasCAL                 sapo
atEQUEatabELATERMINE       batata
zoEIrrRRRRa                arroz




*/

#include<stdio.h>
#include <string.h>

int main(){

	int c, i, j, k,temp,aux;
	char str[100], newstr[100];
	scanf("%d",&c);
	for(i = 0; i<c; i++){
		
		scanf("%s",str);
		k = 0;
		//Passa as letras minusculas para o newstr
			for(j = 0; j<strlen(str); j++){
				if(str[j]>=97 && str[j]<=122){
					newstr[k] = str[j];
					k += 1;
				}
			}
			newstr[k] = '\0';
			aux = k-1;
			//inverte a string
			for(j = 0; j<k/2; j++){
				temp = newstr[j];
				newstr[j] = newstr[aux];
				newstr[aux] = temp;
				aux-=1;
			}
			
			printf("%s\n",newstr);
			
	}
	return 0;
}

