#include <stdio.h>
int fib(int);
int main(){
    int inp;
    printf("Fibonacci index?\n");
    scanf("%d", &inp);
    int fibe = fib(inp);
    printf("Index %d is %d", inp, fibe);
    return 0;
}
int fib(int num){
    if (num==0){
        return 0;
    } else if (num==1){
        return 1;
    } else {
        return fib(num-1)+fib(num-2);
    }
}