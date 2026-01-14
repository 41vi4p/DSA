#include<stdio.h>
int main(){
    int pr=3;
    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=3;j++){
            printf("%d",pr);
        }
        printf("\n");
        pr--;
    }
    return 0;
}