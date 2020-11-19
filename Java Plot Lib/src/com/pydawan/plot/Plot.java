package com.pydawan.plot;

import java.util.ArrayList;
import java.util.List;

import com.pydawan.tuples.Pair;

public class Plot {
	
	/**
	 * Label of the x-axis
	 */
	public String xlabel = "";
	
	/**
	 * Label of the y-axis
	 */
	public String ylabel = "";
	
	/**
	 * Title of the plot
	 */
	public String title = "";
	
	private List<Pair<double[], double[]>> dplots = new ArrayList<>();
	private List<Pair<float[], float[]>> fplots = new ArrayList<>();
	
	public Plot() {
		
	}
	
	/**
	 * Adds a new plot with the given points.
	 * @param x An array containing the x-coordinates of each point
	 * @param y An array containing the y-coordinates of each point
	 */
	public void plot(double[] x, double[] y) {
		if(x.length != y.length)
			throw new RuntimeException("x and y arrays must have the same length");
		
		dplots.add(new Pair<>(x, y));
	}
	
	/**
	 * Adds a new plot for every array in yy
	 * @param x An array containing the x-coordinates of each point
	 * @param yy An array containing an array of the y-coordinates of each point for each plot
	 */
	public void plot(double[] x, double[][] yy) {
		for(double[] y: yy)
			plot(x, y);
	}
	
	/**
	 * Adds a new plot with the given points.
	 * @param x An array containing the x-coordinates of each point
	 * @param y An array containing the y-coordinates of each point
	 */
	public void plot(float[] x, float[] y) {
		if(x.length != y.length)
			throw new RuntimeException("x and y arrays must have the same length");
		
		fplots.add(new Pair<>(x, y));
	}
	
	/**
	 * Adds a new plot for every array in yy
	 * @param x An array containing the x-coordinates of each point
	 * @param yy An array containing an array of the y-coordinates of each point for each plot
	 */
	public void plot(float[] x, float[][] yy) {
		for(float[] y: yy)
			plot(x, y);
	}
	
	
	/**
	 * Saves the plot to a file with the given name.
	 * @param fname The file name
	 */
	public void save(String fname) {
		//TODO
	}
	
	/**
	 * Displays a window that shows the plot
	 */
	public void show() {
		//TODO
	}
}
