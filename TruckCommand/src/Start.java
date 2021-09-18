
public class Start implements Command{
	
	private Device device;

	public Start(Device fireTruck) {
		device = fireTruck;
	}

	@Override
	public void execute() {
		device.on();
		
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

}
