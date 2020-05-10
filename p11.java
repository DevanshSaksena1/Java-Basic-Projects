class p11
{
	public static void main(String args[])
	{
	int cp=2000,sp=2500,profit,loss;
	
	if(sp>cp)
	{
	System.out.println("He made profit ");
	profit=sp-cp;
	System.out.println("profit ="+ profit);
	}
	else if(sp<cp)
	{
	System.out.println("He incurred loss ");
	loss=cp-sp;
	System.out.println("loss ="+ loss);
	}
	
	else
	System.out.println("No Profit No loss");
	
	}
}