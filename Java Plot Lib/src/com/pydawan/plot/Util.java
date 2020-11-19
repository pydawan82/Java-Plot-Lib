package com.pydawan.plot;

public final class Util {
	
	private Util() {}
	
	/**
	 * 
	 * @param lo
	 * @param hi
	 * @param split
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static double[] linSpace(double lo, double hi, int split) {
		if(split < 0)
			throw new IllegalArgumentException("Split value must be a positive integer.");
		
		if(split == 1)
			return new double[] {lo};
		
		double[] arr = new double[split];
		double delta = hi-lo;
		
		for(int i=0; i<split; i++) {
			arr[i] = lo + delta*((double)i/(split-1));
		}
		
		return arr;
	}
	
	/**
	 * 
	 * @param lo
	 * @param hi
	 * @param space
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static double[] linSpace(double lo, double hi, double space) {
		if(space == 0)
			throw new IllegalArgumentException("Space value must be non-nul.");
		
		double delta = hi-lo;
		space = Math.signum(delta) * Math.abs(space);
		double dlen = delta/space;
		
		if(dlen > Integer.MAX_VALUE)
			throw new RuntimeException("");
		
		int len = (int) dlen;
		
		double[] arr = new double[len];
		double value = lo;
		for(int i=0; i<len; i++) {
			arr[i] = value;
			value += space;
		}
		
		return arr;
	}
	
	/**
	 * 
	 * @param lo
	 * @param hi
	 * @param split
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static float[] linSpace(float lo, float hi, int split) {
		if(split < 0)
			throw new IllegalArgumentException("Split value must be a positive integer.");
		
		if(split == 1)
			return new float[] {lo};
		
		float[] arr = new float[split];
		float delta = hi-lo;
		
		for(int i=0; i<split; i++) {
			arr[i] = lo + delta*((float)i/(split-1));
		}
		
		return arr;
	}
	
	/**
	 * 
	 * @param lo
	 * @param hi
	 * @param space
	 * @return
	 * @throws IllegalArgumentException
	 */
	public static float[] linSpace(float lo, float hi, float space) {
		if(space == 0)
			throw new IllegalArgumentException("Space value must be non-nul.");
		
		float delta = hi-lo;
		space = Math.signum(delta) * Math.abs(space);
		float dlen = delta/space;
		
		if(dlen > Integer.MAX_VALUE)
			throw new RuntimeException("");
		
		int len = (int) dlen;
		
		float[] arr = new float[len];
		float value = lo;
		for(int i=0; i<len; i++) {
			arr[i] = value;
			value += space;
		}
		
		return arr;
	}
}
