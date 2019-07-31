#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,hyp;
  scanf("%f%f",&a,&b);
  hyp=hypot(a,b);
  printf("%.2f",hyp);
  return 0;
}