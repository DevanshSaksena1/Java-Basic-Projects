class p9
{
	public static void main(String args[])
	{

	float bs=10000f,da,hra,pf,l,gs;
	da=(float)(bs*0.4);
	hra=(float)(bs*0.2);
	pf=(float)(bs*0.08);	
	l=(float)(bs*0.03);
	
	gs=bs+da+hra-pf-l;
	
	System.out.println("Gross salary ="+ gs);
	

	}
}