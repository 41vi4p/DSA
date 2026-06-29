#include<stdio.h>
int main()
{
    int pr=1;
    for(int i=1;i<=4;i++)
    {
        for(int j=1;j<=3;j++){
            printf("%d",pr);
            pr++;
        }
        printf("\n");
        pr=1;
    }
    return 0;
}