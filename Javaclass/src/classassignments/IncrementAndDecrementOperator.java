package classassignments;

 class IncrementAndDecrementOperator 
 {
public static void main(String[] args)
{
	int x=7;
	int y=20;
    int res=(x++ - x-- + y++ - --y);
    System.out.println("Output 1:"+res);
    


int w=20;
int z=200;
int res1=(w++ + --w - ++z - --z + --w);
System.out.println("Output 2:"+res1);

int g=1;
int h=0;
int res2=(++g + --g - h++ +h--);
System.out.println("Output 3:"+res2);

int num1=5;
int num2=9;
int res3=(++num1 - --num2 + --num1);
System.out.println("Output 4:"+res3);


}
}
