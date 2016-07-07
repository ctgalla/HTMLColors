package com.gallagher.hib3;

public class Color {
	private int id;
	private String name;
	private int red;
	private int green;
	private int blue;
	
	//I can get away without the no-args constructor
	//because this is just a subclass of Object
	//Object'd default constructor will null/zero data members for me
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the red
	 */
	public int getRed() {
		return red;
	}
	/**
	 * @param red the red to set
	 */
	public void setRed(int red) {
		this.red = red;
	}
	/**
	 * @return the green
	 */
	public int getGreen() {
		return green;
	}
	/**
	 * @param green the green to set
	 */
	public void setGreen(int green) {
		this.green = green;
	}
	/**
	 * @return the blue
	 */
	public int getBlue() {
		return blue;
	}
	/**
	 * @param blue the blue to set
	 */
	public void setBlue(int blue) {
		this.blue = blue;
	}
	

}
