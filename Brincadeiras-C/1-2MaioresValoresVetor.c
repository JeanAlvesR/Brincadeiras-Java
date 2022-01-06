/*
Para uma amiga:
Faça um algoritmo, em linguagem c, que crie um vetor com n números inteiros e que permita o usuário inserir cada um dos números, por fim, encontre e exiba os dois maiores números inseridos e suas respectivas posições no vetor


*/
//Biblioteca
#include<stdio.h>
#include<locale.h>

//função para impressao

void impressao(int aux1, int aux2, int i1, int i2){

    //Impressão dos dois maiores valores.
    printf("\n\nO maior valor é: %d e está no indice %d.\n",aux1, i1);
    printf("O segundo maior valor é: %d e está no indice %d.\n\n",aux2, i2);

}

//Função para fazer a entrada, verificação e impressão. Boa prática de programação.
void funcPegaDoisMaioresVal(){
    //declaração das variáveis
    int n, i, aux1 = 0, aux2 = 0, indice1 = 0, indice2 = 0;
    
    printf("Inserir tamanho do vetor: ");
    scanf("%d",&n);
    //Declaração do vetor de tamanho n.
    int vetor[n];

    //Laço para receber os valores do usuário
    for(i=0; i<n;i++){
        printf("\nInserir valor no vetor de posição %d: ",(i));
        scanf("%d",&vetor[i]);
    }
    //Pega os dois maiores valores.
    for(i=0; i<n;i++){
        if(vetor[i]>aux1){
            if(aux1>aux2){
                aux2 = aux1;
                indice2 = indice1;
            }
            aux1 = vetor[i];
            indice1 = i;
        }
        if(vetor[i]>aux2 && i!=indice1){
            aux2 = vetor[i];
            indice2 = i;
        }
    }
    //Função para impressão
    impressao(aux1, aux2, indice1, indice2);
    
}


//função principal
int main(){
    //função para mudar o idioma.
    setlocale(LC_ALL, "Portuguese");
    //Chamada de função sem retorno.
    funcPegaDoisMaioresVal();

    return 0;
}