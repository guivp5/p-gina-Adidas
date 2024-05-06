#include <stdio.h>

int main() {

    int X, i, mult;

    printf("Digite o numero da tabuada que voce vai querer: ");
    scanf("%d", &X);

    mult = 0;
    for (i = 1; i <= 50; i++)
    {
        mult = X * i;
        printf("%d x %d = %d\n", X, i, mult);
    }

    return 0;
}