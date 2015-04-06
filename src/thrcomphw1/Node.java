package thrcomphw1;

public class Node {

	private char chr;
	private boolean acceptState;
	private int stateNumber;
	private boolean accpt;


	public Node(char cr, boolean accState, int state)
	{
		chr = cr;
		acceptState = accState;
		stateNumber = state;
		accpt = false;
	}

	public void printState()
	{
		System.out.print(" " + stateNumber + ",");
	}

	public boolean moveNext(char temp)
	{
		setAccept(temp);
		if((accpt == true) && (acceptState == true))
			return false;
		if(temp == chr)
			return true;
		else
			return false;
	}

	public void setAccept(char temp)
	{
		if(acceptState == true)
		{
			if(temp == chr)
				accpt = true;
		}
	}

	public boolean accepted()
	{
		if(acceptState)
		{
			if(accpt)
				return true;
			else
				return false;
		}
		else
			return false;
	}



}
