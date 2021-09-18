
public class Stop implements Command{
	
	private Device device;

	public Stop(Device tanker) {
		 device = tanker;
	}

	@Override
	public void execute() {
	 
		device.off();
		
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

}
