#include<stdio.h>
int main()
{
    int p=0;
    for(int i=5;i>=1;i--)
    {
        for(int j=5-i;j>=1;j--){
            printf(" ");
        }
        for(int j=1;j<=i;j++){
            printf("*");
        }
        printf("\n");
    }
    return 0;
}