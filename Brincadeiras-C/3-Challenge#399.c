/*
Challenge

Assign every lowercase letter a value, from 1 for 'a' to 26 for 'z'. Given a string of lowercase letters, find the sum of the values of the letters in the string.


lettersum("") => 0
lettersum("a") => 1
lettersum("z") => 26
lettersum("cab") => 6
lettersum("excellent") => 100
lettersum("microspectrophometries") => 317

*/

#include<stdio.h>
#include<string.h>

//Função Principal
int main(){
	
	char strg [100];
	int i, sum = 0;
	
	gets(strg);
	//É -96, pois o exercício pede para considerar LowCase(97 a 122) -> tabela ASCII
	for(i =0; i<strlen(strg); i++){
		if(strg[i]!=240){
			sum += (strg[i]-96);
		}
	}
	printf("\n%d",sum);

	return 0;
}