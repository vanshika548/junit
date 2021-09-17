package main;

import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	@Test
	void testMoodAnalysis() throws Exception {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyzeMood("SAD");
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}

	@Test
	void happyMoods()throws Exception {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyzeMood("HAPPY");
		Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}
	
	@Test
	void givenMood_WhenNull_ShouldReturnHappy(){
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood=null;
		try {
			mood = moodAnalyser.analyzeMood();
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals("HAPPY",mood);
	}
	
}
