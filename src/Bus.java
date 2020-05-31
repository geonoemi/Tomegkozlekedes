	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;

public class Bus extends Vehicle implements Fossil {


		//private String plateNum;
		
		
		public Bus(String typeOfVehicle, int lineNum, String lineLetter, String way, boolean articulated, boolean lowFloor,
					double operationCost, int numOfSeats, boolean bicycleTransportOpp, int numOfDisabledPlaces,
					boolean needToRepair, String typeOfFuel, boolean hasWheel) {
			super(typeOfVehicle, lineNum, lineLetter, way, articulated, lowFloor, operationCost, numOfSeats, bicycleTransportOpp,
					numOfDisabledPlaces, needToRepair, typeOfFuel, hasWheel);
		}
	
		
		public static void main(String[] args) {
		
			readIn("buses.txt");
			for(Vehicle v: vehicles) {
				if(v.getClass().equals(Bus.class)) {
					System.out.println("This is a bus.");
				}
				if(v.lowFloor && v.numOfDisabledPlaces>=1) {
					//Vehicle wheelchairAccessibleVehicle=new WheelChairAccessible(v.lineNum, v.lineLetter, v.way, v.articulated, v.lowFloor,
						//	v.operationCost,  v.numOfSeats, v.bicycleTransportOpp, v.numOfDisabledPlaces, v. needToRepair, v.typeOfFuel, v.hasWheel);
					wheelChairAccessibleVehicles.add((WheelChairAccessible) v);
				}
					
				if(v.needToRepair) {
					toService.add(v);
				}	
				
				if(v.bicycleTransportOpp) {
					bicycleVehicles.add(v);
				}
				if(v.typeOfFuel.contentEquals("petrol") || v.typeOfFuel.contentEquals("diesel oil")) {
					fossilVehicles.add(v);
				}else {
					electricVehicles.add(v);
				} 
			}
		}

	}


