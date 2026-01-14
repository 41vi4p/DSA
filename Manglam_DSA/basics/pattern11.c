#include<stdio.h>
int main()
{
    int p=0;
    for(int i=1;i<=5;i++)
    {
        for(int j=4-p;j>=1;j--){
            printf(" ");
        }
        p++;
        for(int j=1;j<=i;j++){
            printf("*");
        }
        printf("\n");
    }
    return 0;
}