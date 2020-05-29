
public class Trolley extends Vehicle implements Electric {

		
		public Trolley(int lineNum, String lineLetter, String way, boolean articulated, boolean lowFloor, double operationCost, int numOfSeats,
				boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair,String typeOfFuel) {
			super( lineNum,  lineLetter,  way,  articulated,  lowFloor,  operationCost,  numOfSeats,
					 bicycleTransportOpp,  numOfDisabledPlaces,  needToRepair, typeOfFuel); 
		}

		

		@Override
		public boolean canRunAlongHere(boolean hasPantograph) {
			
			return true;
		}
		public static void main(String[] args) {
			
			readIn("trolik.txt");
			
		}	
	}
