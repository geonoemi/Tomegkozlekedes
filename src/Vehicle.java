import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
import java.util.InputMismatchException;
	
public abstract class Vehicle {
	//TODO make it abstract
		
		protected String lineNum;
		protected boolean articulate;
		protected boolean lowFloor;
		protected double operationCost;
		protected int numOfSeats;
		protected boolean bicycleTransportOpp;
		protected int numOfDisabledPlaces;
		protected boolean needToRepair;
		protected String typeOfFuel;
		protected boolean hasWheel;
		protected String typeOfVehicle;
		
		protected static ArrayList<String> lineNums=new ArrayList<>();
		protected static ArrayList<Boolean> isArticulate=new ArrayList<>();
		protected static ArrayList<Boolean> isLowFloor =new ArrayList<>();
		protected static ArrayList<Double> operationCosts=new ArrayList<>();
		protected static ArrayList<Integer> numberOfSeats =new ArrayList<>();
		protected static ArrayList<Boolean> hasBicycleTransportOpp =new ArrayList<>();
		protected static ArrayList<Integer> disabledPlaces =new ArrayList<>();
		protected static ArrayList<Boolean> needsToRepair =new ArrayList<>();
		protected static ArrayList<String> fuelTypes =new ArrayList<>();
		protected static ArrayList<Boolean> hasWheels =new ArrayList<>();
		protected static ArrayList<String> typeOfVehicles =new ArrayList<>();

		protected static ArrayList<Vehicle> vehicles=new ArrayList<>();
			
		protected static ArrayList<Vehicle> needsService = new ArrayList<>();
		protected static ArrayList<Vehicle> bicycleVehicles=new ArrayList<>();
		
		
		
		public Vehicle(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats,
						boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair,String typeOfFuel,
						boolean hasWheel, String typeOfVehicle) {
		

			this.lineNum=lineNum;
			this.articulate=articulate;
			this.lowFloor=lowFloor;
			this.operationCost=operationCost;
			this.numOfSeats=numOfSeats;
			this.bicycleTransportOpp=bicycleTransportOpp;
			this.numOfDisabledPlaces=numOfDisabledPlaces;
			this.needToRepair=needToRepair;
			this.typeOfFuel=typeOfFuel;
			this.hasWheel=hasWheel;
			this.typeOfVehicle=typeOfVehicle;
		
		}
		
	/*	
				
		public static void fillNeedToRepairVehicles() {
				
			for (Vehicle vehicle : vehicles) {
				if(vehicle.needToRepair) {
					needsService.add(vehicle);
				}	
			}
		}	
		
		public static void printNeedToRepair() {
			
			fillNeedToRepairVehicles();
			for( Vehicle repair:needsService) {
				System.out.println(repair);
			}
		}
		
		public static void fillBicycleVehicles() {
			
			for (Vehicle vehicle : vehicles) {
				
				if(vehicle.bicycleTransportOpp) {
					bicycleVehicles.add(vehicle);
				}
			}
		}
		
		public static void printBicycleVehicles() {
			
			fillBicycleVehicles();
			for( Vehicle bicycle:bicycleVehicles) {
				System.out.println(bicycle);
			}
		}
*/
		public  String toString() {
			
			return lineNum+" "+articulate+" "+ lowFloor+" "+  operationCost
					+" "+numOfSeats+" "+	bicycleTransportOpp+" "+numOfDisabledPlaces
					+" "+needToRepair+" "+typeOfFuel+" "+hasWheel+" "+typeOfVehicle;
		}	
		
	
}
