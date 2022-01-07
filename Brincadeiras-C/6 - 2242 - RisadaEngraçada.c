/*
Em chats, é muito comum entre jovens e adolescentes utilizar sequências de letras, que parecem muitas vezes aleatórias, para representar risadas. Alguns exemplos comuns são:

huaauhahhuahau
hehehehe
ahahahaha
jaisjjkasjksjjskjakijs
huehuehue

Cláudia é uma jovem programadora que ficou intrigada pela sonoridade das “risadas digitais”. Algumas delas ela nem mesmo consegue pronunciar! Mas ela percebeu que algumas delas parecem transmitir 
melhor o sentimento da risada que outras. A primeira coisa que ela percebeu é que as consoantes não interferem no quanto as risadas digitais influenciam na transmissão do sentimento.
A segunda coisa que ela percebeu é que as risadas digitais mais engra¸cadas são aquelas em que as sequências de vogais são iguais quando lidas na ordem natural (da esquerda para a direita) ou 
na ordem inversa (da direita para a esquerda), ignorando as consoantes. Por exemplo, “hahaha” e “huaauhahhuahau” estão entre as risadas mais engraçadas, enquanto “riajkjdhhihhjak” e “huehuehue” não estão entre as mais engraçadas.

Cláudia está muito atarefada com a análise estatística das risadas digitais e pediu sua ajuda para escrever um programa que determine, para uma risada digital, se ela é das mais engraçadas ou não.

Entrada
A entrada é composta por uma linha, contendo uma sequência de no máximo 50 caracteres, formada apenas por letras minúsculas sem acentuação. As vogais são as letras ‘a’,‘e’,‘i’,‘o’,‘u’. A sequência contém pelo menos uma vogal.

Saída
Seu programa deve produzir uma linha contendo um caractere, “S” caso a risada seja das mais engra¸cadas, ou “N” caso contrário.



*/

#include<stdio.h>
#include<string.h>

int main(){
	
	char entrada[51],vogais[51];
	int i, j = 0;
	scanf("%s",entrada);
	
	for(i = 0; i<strlen(entrada); i++){
		
		if(entrada[i] == 97 || entrada[i] == 101 || entrada[i] == 105 || entrada[i] == 111 || entrada[i] == 117){
			vogais[j] = entrada[i];
			j++;
		}
	
	}
	vogais[j]='\0';
	entrada[j]='\0';
	for(i=0; i<strlen(vogais); i++){
		j--;
		entrada[j] = vogais[i];
	}
		if(strcmp(vogais,entrada)==0){printf("S\n"); }
		else printf("N\n");
	return 0;
}

