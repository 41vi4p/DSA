#include "program_1_to_10.cpp"
#include "program_11_to_20.cpp"

using namespace std;

int main(){
    int n;
    cout<<"Enter Program number to print (1-20): ";
    cin>>n;
    switch (n)
    {
    case 1:
        cout<<"Enter number of rows: ";
        int r;
        cin>>r;
        p1(r);
        break;
    case 2:
        cout<<"Enter number of rows: ";
        cin>>r;
        p2(r);
        break;
    case 3:
        cout<<"Enter number of rows: ";
        cin>>r;
        p3(r);
        break;      
    case 4:
        cout<<"Enter n: ";
        cin>>r;
        p4(r);
        break;
    case 5:
        cout<<"Enter n: ";
        cin>>r;
        p5(r);
        break;
    case 6:
        cout<<"Enter n: ";
        cin>>r;
        p6(r);
        break;
    case 7:
        cout<<"Enter n: "<<endl;
        cin>>r;
        p7(r);
        break;
    case 8:
        p8();
        break;
    case 9:
        p9();
        break;
    case 10:
        p10();
        break;
    case 11:
        p11();
        break;
    case 12:
        p12();
        break;
    case 13:
        p13();
        break;
    case 14:
        p14();
        break;
    case 15:
        p15();  
        break;
    case 16:
        p16();
        break;
    case 17:
        p17();
        break;
    case 18:
        p18();
        break;
    case 19:
        p19();
        break;
    case 20:
        p20();
        break;
    default:
        break;
    }
    return 0;
}