/*
 * By: Salman Alessa
 * 
 * Lab 7 parts(1,2,3,4,5,6,7)
 * 
 * 
 * Github LINK ( https://github.com/MrHooRa/CSC111-LAB07 ).
 * Please if there is a bug or want to contact me, you can contact me at (salman.m.alessa@gmail.com).
 */

public class TV {
	// Variables
	int channel;
	int volumeLevel;  // Should I put default Value???
	boolean on;
	
	// Methods
	
	// Method [1]: turn on the TV
	// Here we will use DATA TYPE = void, because there are no output!!
	public void turnOn() {
		on = true;
	}
	
	// Method [2]: turn of the TV
	public void turnOff() {
		on = false;
	}
	
	// Method [3]: Check if TV is on!
	// Here we have output (Boolean)
	public String isOn() {
		String isTvOn;
		
		if(on == true) {
			isTvOn = "On";
		}else {
			isTvOn = "Off";
		}
		
		return isTvOn;
		
	}
	
	// Method [4]: volume level Up
	public void volumeLevelUp(int vol) {
		
		int newVolume;
		
		// New volume
		newVolume = volumeLevel + vol;
		
		// Check if the new Volume is less than 9!
		if(newVolume <= 8) {
			volumeLevel = newVolume;
		}
		
	}
	
	// Method [5]: volume level Down
	public void volumeLevelDown(int vol) {
		
		int newVolume;
		
		// New volume
		newVolume = volumeLevel + vol;
		
		// Check if the new Volume is more than 0!
		if(newVolume >= 0) {
			volumeLevel = newVolume;
		}
		
	}
	
	// Method [6]: Channel Up
	public void channelUp(int ch) {
		
		int newChannel;
		
		// New channel
		newChannel = channel + ch;
		
		// Check if the new channel is less than 100!
		if(newChannel <= 100) {
			channel = newChannel;
		}
		
	}
	
	// Method [7]: Channel Down
	public void channelDown(int ch) {
		
		int newChannel;
		
		// New channel
		newChannel = channel - ch;
		
		// Check if the new channel is more than 0!
		if(newChannel >= 0) {
			channel = newChannel;
		}
		
	}

	// Method [8]: Return all information about TV
	public String toString() {
		return "TV is " + isOn() + " and current channel is " + channel +
				" and current volume level is " + volumeLevel +".";
	}

	public static void main(String[] args) {
		
		// Create new object called tv1
		TV tv1 = new TV();
		
		// Turn on tv1
		tv1.turnOn();
		
		// Set channel 20
		tv1.channelUp(20);
		
		// Set volume 4
		tv1.volumeLevelUp(4);
		
		// Display info about tv1
		if(tv1.isOn() == "On") {
			System.out.println(tv1.toString());
		}
		
	}

}
