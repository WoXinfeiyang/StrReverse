#include <stdio.h>
#include <stdlib.h>

void ReverseWord(char *front,char *end)
{
	while(front<end)
	{
		char temp=*front;
		*front++=*end;
		*end--=temp;	
	}
}

char * Reverse(char *s)
{
	char *pre=s;
	char *current=s;
	
	while(*current!='\0')
	{

		if(*current==' ')
		{
			ReverseWord(pre,current-1);
			current++;
			pre=current;	
		}
		else
		{
			current++;	
		}
	
	}
	ReverseWord(pre,current-1);
	ReverseWord(s,current-1);
	return s;
}


int main(int argc, char *argv[]) 
{
	char a[]="how are you ?";
	printf("Ô­Ê¼×Ö·û´®:%s\n",a);
	printf("ÄæÐòÖ®ºóµÄ×Ö·û´®:%s\n",Reverse(a));

	return 0;
	
}
