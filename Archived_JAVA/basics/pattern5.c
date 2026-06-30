#include<stdio.h>
int main(){
    char pr=65;
    for(int i=1;i<=3;i++)
    {
        for(int j=1;j<=3;j++){
            printf("%c",pr);
        }
        printf("\n");
        pr++;
    }
    return 0;
}