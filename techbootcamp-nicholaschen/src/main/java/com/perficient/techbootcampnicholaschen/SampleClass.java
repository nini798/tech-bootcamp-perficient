package com.perficient.techbootcampnicholaschen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleClass {
    private static final Logger log = LoggerFactory.getLogger(SampleClass.class);
	
	private SampleObject sample;
	
	public SampleClass(SampleObject sample) {
		this.sample = sample;
	}
	
	public int checkVal() {
		return sample.getValue();
	}
	
	public static void main(String[] args) {
		log.info("info message");
		log.debug("debugging");
		log.error("Error!");
	}
}
