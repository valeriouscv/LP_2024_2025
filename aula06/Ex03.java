package aula06;
public class Ex03 {
    public static void main(String[] args) {
        int a=1,b=a;//a=1, b=1
        a=a++*++b;  //a=(1)*(2)=2, b=2;
        b=b++*2*a;  //a=2, b=(2)*2*2=8 <=> b=8
        int c=a--*2;//a=2, b=8, c=4, a depois =1
    }
}
