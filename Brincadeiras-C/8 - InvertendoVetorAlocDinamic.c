#include<stdio.h>
#include<stdlib.h>
#include<locale.h>

//Fun��o Principal
int main(){

	setlocale(LC_ALL,"Portuguese");

	int *p, temp,j,i;
	p = (int*)malloc(20*sizeof(int));
	//Receber os n�meros
	for(i = 0; i<20; i++){
		scanf("%d",&p[i]);
	}
	j=i-1;
	//inveter as posi��es do vetor
	for( i = 0; i<10; i++){
		temp = p[i];
		p[i] = p[j];
		p[j] = temp;
		j--;
	}	
	printf("\nINVERTIDO\n\n");
	//Imprimir vetor
	for(i = 0; i<20; i++){
		printf("\nPosi��o [%d]: %d\n",i,p[i]);
	}
	free(p);
	return 0;
}

