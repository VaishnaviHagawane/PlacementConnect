#include <stdio.h>
int main()
{
   char str[30];
   int i,length,flag=0;
   printf("Enter the String: ");
   scanf("%s",str);
   length= strlen(str);
   for(i=0;i<length;i++)
   {
       if(str[i]==str[length-i-1])
         flag=0;
       else
         flag=1;
         break;
   }
   if(flag==1)
     printf("String is not a palindrome ");
    else
      printf("String is a palindrome ");
    return 0;
}
