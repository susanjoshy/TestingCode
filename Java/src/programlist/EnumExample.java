/*Write a program that defines an enum having months of the year and then prints the
value of all the enum elements.
*/

package programlist;

public class EnumExample {
	//public enum Days{
		//Sun,Mon,Tue
	public enum Months{
		Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec
	}

	public static void main(String[] args) {
		System.out.println("the enum values are");
		for(Months m:Months.values())
			System.out.println(m);
		/*Days day=Days.Mon;
	for(Days d:Days.values()){
	System.out.println(d);

	}*/
	/*switch(day){
	case Sun:System.out.println("sunday");
	break;
	case Mon:System.out.println("Monday");
	break;
	case Tue:System.out.println("Tuesday");
	break;
	
	}*/

}
}