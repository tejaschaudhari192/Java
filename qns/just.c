//Date : --/--/23

#include <stdio.h>
void main()
{
	int rows,i,j;
	
	printf("Enter value : ");
	scanf("%d",&rows);

	for ( i = 1; i <= rows; i++) 
	{
		for ( j = 1; j <= i; j++) 
		{
			if ((i + j) % 2 == 0)
				printf("0");
			else
				printf("1");
		}
			printf("\n");
	}
}