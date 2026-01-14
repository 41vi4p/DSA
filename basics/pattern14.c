#include<stdio.h>
int main()
{
    for(int i=1;i<=5;i++)
    {
        if(i==3)
        {
            printf("**");
        }
        if(i!=3)
        {
            printf("  *");
        }
        if(i==3)
        {
            printf("***");
        }
        printf("\n");
    }
    return 0;
}