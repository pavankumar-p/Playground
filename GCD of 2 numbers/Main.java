#include <stdio.h>
int main()
{
 int i,j,a,b;
  scanf("%d%d",&i,&j);
  if(i>j)
    a=j;
  else
    a=i;
  for(a;a>0;a--)
  {
    if(i%a==0&&j%a==0)
    {printf("%d",a);
     break;
    }
  }
  
   return 0;
}