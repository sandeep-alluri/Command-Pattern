
public class TestTruckCommandDemo {

	public static void main(String[] args) {
		
		Device fireTruck = new FireTruck();
		
		Start startCommand = new Start(fireTruck);
		
		RemoteSystem remoteCall = new RemoteSystem(startCommand);
		
		remoteCall.press();
		
		System.out.println("\n");
		
		Device tanker = new Tanker();
		
		Stop stopCommand = new Stop(tanker);
		
		RemoteSystem remoteStopButton = new RemoteSystem(stopCommand);
		
		remoteStopButton.press();
 
		System.out.println("\n");
		
		 Device cementTruck = new CementTruck();
			
			Start startCommandNew = new Start(cementTruck);
			
			RemoteSystem remoteButton = new RemoteSystem(startCommandNew);
			
			remoteButton.press();  
		 

	}

}
