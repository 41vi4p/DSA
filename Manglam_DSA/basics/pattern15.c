#include<stdio.h>
int main()
{
    for(int i=1;i<=5;i++)
    {
        if(i==1)
        {
            printf("*****");
        }
        if(i!=1 && i!=5)
        {
            printf("*   *");

        }
        if(i==5)
        {
            printf("*****");
        }
        printf("\n");
    }
    return 0;
}