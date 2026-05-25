#include<stdio.h>
int main(){
    for(int i=1;i<=9;)
    {
        for(int j=1;j<=3;j++)
        {
            printf("%d",i);
            i++;
        }
        printf("\n");
    }
    return 0;
}