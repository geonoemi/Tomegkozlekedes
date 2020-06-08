import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Tram extends Vehicle {

	protected static ArrayList<Tram> trams=new ArrayList<>();
	protected static ArrayList<String> tramsLineNums=new ArrayList<>();
	
	public Tram(String lineNum, boolean articulate, boolean lowFloor, double operationCost, int numOfSeats,
			boolean bicycleTransportOpp, int numOfDisabledPlaces, boolean needToRepair, String typeOfFuel,
			boolean hasWheel, String typeOfVehicle) {
		super(lineNum, articulate, lowFloor, operationCost, numOfSeats, bicycleTransportOpp, numOfDisabledPlaces, needToRepair,
				typeOfFuel, hasWheel, typeOfVehicle);
	}

	public static void readIn(String fileName){ 
		
		try {
			
			FileReader reader=new FileReader(fileName);
			BufferedReader buffer=new BufferedReader(reader);
			String line=null;
			int i=0;
			
			while((line=buffer.readLine())!=null) {
				
					String parts[] = line.split(",");
					
					lineNums.add(parts[0]);
					isArticulate.add(Boolean.valueOf(parts[1]));
					isLowFloor.add(Boolean.parseBoolean(parts[2]));
					operationCosts.add(Double.parseDouble(parts[3]));
					numberOfSeats.add(Integer.parseInt(parts[4]));
					hasBicycleTransportOpp.add(Boolean.parseBoolean(parts[5]));
					disabledPlaces.add(Integer.parseInt(parts[6]));
					needsToRepair.add(Boolean.parseBoolean(parts[7]));
					fuelTypes.add(parts[8]);
					hasWheels.add(Boolean.parseBoolean(parts[9]));
					typeOfVehicles.add(parts[10]);
									
					Tram tram=new Tram(lineNums.get(i), isArticulate.get(i), isLowFloor.get(i), operationCosts.get(i),  numberOfSeats.get(i),
												hasBicycleTransportOpp.get(i),  disabledPlaces.get(i), 	needsToRepair.get(i), fuelTypes.get(i), 
												hasWheels.get(i), typeOfVehicles.get(i));
					trams.add(tram);				
			
				i++;
			}
			
			buffer.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}catch(IOException e) {
			System.out.println("e.getMessage()");
		}catch (InputMismatchException exception) {
			System.out.println("Not appropriate input type.");
		}		
	}
	
	public static void fillTram(){
		
		for(Vehicle vehicle: vehicles) {
			
			if(vehicle.typeOfFuel.equals("electrical energy") && !vehicle.hasWheel) {
				
				Tram tram=new Tram(vehicle.lineNum,  vehicle.articulate, vehicle.lowFloor,
			 			vehicle.operationCost, vehicle.numOfSeats, vehicle.bicycleTransportOpp, vehicle.numOfDisabledPlaces,
			 			vehicle.needToRepair, vehicle.typeOfFuel, vehicle.hasWheel, vehicle.typeOfVehicle);

				trams.add((Tram) tram);
			}
		}
	}	
	
	public static void printTram() {
		fillTram();
		for(Vehicle tram:trams) {
			System.out.println(tram);
		}
	}
	
	public static void fillTramLineNums() { //used in printTramLineNums()
		//fillVehicles();
		for(Vehicle tram:trams) {
			tramsLineNums.add(tram.lineNum);
		}
	}
	
	public static void printTramLineNums() { //used in Route.getARoute()
		
		tramsLineNums.clear();
		fillTramLineNums();
		for(String linenum: tramsLineNums) {
			System.out.println(linenum);
		}
	}
	public static void main(String[] args) {
		readIn("classes files\\trams.txt");
		fillTram();

		//printTramLineNums();	
	}
}


