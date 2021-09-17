package main;

public class MoodAnalyser {
	
	String message;
	
	public MoodAnalyser() {
		
	}
	
	public MoodAnalyser(String message) {
		this.message=message;
	}

	public String analyzeMood(String message) throws MoodAnalysisException {
		// TODO Auto-generated method stub
		this.message = message;
		return analyzeMood();
	}

	public String analyzeMood() throws MoodAnalysisException  {
		// TODO Auto-generated method stub
		
		try {	
			if(message.contains("SAD")) {
				return "SAD";
			}else {
					return "HAPPY";
				  }
		    }catch(NullPointerException e) {
		    	throw new MoodAnalysisException("Please enter a valid mood!!!");
		    }
		}

}
