package balloonValidation;

public class BaloonValidation {
public static boolean baloonColourValidation(String baloonColour) {
if(baloonColour.equalsIgnoreCase("Green")||
baloonColour.equalsIgnoreCase("Yellow")||
baloonColour.equalsIgnoreCase("White")||
baloonColour.equalsIgnoreCase("Gold")||
 baloonColour.equalsIgnoreCase("Red")){
	return true;
}
else {
	return false;
}}
public static boolean baloonPriceValidation(double baloonPrice){
	if(baloonPrice>=2 && baloonPrice<=15) {
		return true;
	}
	else {
		return false;
	}
}
}
