package races;

public abstract class Race {

	protected VisionType visionType;
	

	public String checkVisionType() {
		return visionType.vision();
	}
	
	
}
