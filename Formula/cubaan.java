package Formula;

public class cubaan 
{
	public static void main(String[]args)
	{
		int Array[]={100,200,300,400,500};
		int y=0;
		for(int i:Array)
		{
			System.out.println("value "+y+": "+i);
			y++;
		}
		
		//Array=reverse(Array);
		int []Array2=reverse(Array);
		System.out.println();
		for(int i=0;i<Array2.length;i++)
		{
			System.out.println("value "+i+": "+Array2[i]);
		}
	}
	
	public static int[] reverse(int[] Array)
	{
		int [] res=new int[Array.length];
		int j=res.length-1;
		for(int i=0;i<res.length;i++)
		{
			res[i]=Array[j];
			j--;
		}
		return res;
	}
}
