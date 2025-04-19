package opps_programming_optimizing_style2;

public class Baloon {
	private String baloonGas="Helium"; 
private String baloonColour;
private double baloonPrice;
public Baloon(String baloonColour,double baloonPrice)
{
	if(BaloonValidation.baloonColourValidation(baloonColour))
	 {
	   this.baloonColour=baloonColour;
     }
	else
	{
		System.err.println("Invalid Color");
	}
	if(BaloonValidation.baloonPriceValidation(baloonPrice))
	{
		this.baloonPrice=baloonPrice;
	}
	else
	{
		System.err.println("Invalid Price");
	}
}
public double Coverpaisa()
{
	double paisa=baloonPrice*100;
	return paisa;
}
public void Display() {
	System.out.println("-------Baloon Information---------");
	System.out.println("Baloon Colour:"+baloonColour);
	System.out.println("Baloon Price:"+baloonPrice);
	System.out.println("Baloon Gas:"+baloonGas);
	System.out.println("Covert Rupees To Paisa:"+Coverpaisa());


}
}
/*a.program for Baloon
b.ballon characterstics are ballon colour,baloon gas,price of a baloon.
data Requrement:
a. baloons can be white,yellow,green,gold,silver
b.all the baloon are fill with helium gas
c.ballon price range is 2-15rs.
Perform Below opertion
1.intiliazation
b.Conver to rupes to Paisa
c.display ballon information.
Create a separate Validation layer,Business Logic layer ,User Layer.
*/