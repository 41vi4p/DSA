//accept number from user and check last digit of that number is even or odd
#include<stdio.h>
void msg(); //function declaration

int main()
{
    msg();//function calling
    return 0;
}

//function implementation
void msg()
{
    int x;
    printf("enter a no.=");
    scanf("%d",&x);
    x=x%10;
    if(x%2==0)
    {
        printf("No. is even\n");
    }
    else
    {
        printf("No. is odd\n");
    }
}