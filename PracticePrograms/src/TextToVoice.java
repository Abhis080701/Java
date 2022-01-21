
public class TextToVoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			
			System.setProperty("freetts.voices","com.sun.speech.freetts.en.us"+".cmu_us_kal.KevinVoiceDirectory");
			
			
		}catch (Exception e) {
			// TODO: handle exception
		
		System.out.println(e);
		}
		
		
	}

}
