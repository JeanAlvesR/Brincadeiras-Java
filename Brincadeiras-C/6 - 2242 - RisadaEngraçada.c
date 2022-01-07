/*
Em chats, � muito comum entre jovens e adolescentes utilizar sequ�ncias de letras, que parecem muitas vezes aleat�rias, para representar risadas. Alguns exemplos comuns s�o:

huaauhahhuahau
hehehehe
ahahahaha
jaisjjkasjksjjskjakijs
huehuehue

Cl�udia � uma jovem programadora que ficou intrigada pela sonoridade das �risadas digitais�. Algumas delas ela nem mesmo consegue pronunciar! Mas ela percebeu que algumas delas parecem transmitir melhor o sentimento da risada que outras. A primeira coisa que ela percebeu � que as consoantes n�o interferem no quanto as risadas digitais influenciam na transmiss�o do sentimento. A segunda coisa que ela percebeu � que as risadas digitais mais engra�cadas s�o aquelas em que as sequ�ncias de vogais s�o iguais quando lidas na ordem natural (da esquerda para a direita) ou na ordem inversa (da direita para a esquerda), ignorando as consoantes. Por exemplo, �hahaha� e �huaauhahhuahau� est�o entre as risadas mais engra�adas, enquanto �riajkjdhhihhjak� e �huehuehue� n�o est�o entre as mais engra�adas.

Cl�udia est� muito atarefada com a an�lise estat�stica das risadas digitais e pediu sua ajuda para escrever um programa que determine, para uma risada digital, se ela � das mais engra�adas ou n�o.

Entrada
A entrada � composta por uma linha, contendo uma sequ�ncia de no m�ximo 50 caracteres, formada apenas por letras min�sculas sem acentua��o. As vogais s�o as letras �a�,�e�,�i�,�o�,�u�. A sequ�ncia cont�m pelo menos uma vogal.

Sa�da
Seu programa deve produzir uma linha contendo um caractere, �S� caso a risada seja das mais engra�cadas, ou �N� caso contr�rio.



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

