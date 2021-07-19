
public class Planet {
	public String planetName;
	public String orbitalPeriod;
	public String distanceFromSun;
	public String surfaceArea;
	public String lengthOfDay;
	public String radius;
	public String hasRings;
	
	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}
	
	public String getPlanetName() {
		return planetName;
	}
	
	public void setOrbitalPeriod(String orbitalPeriod) {
		this.orbitalPeriod = orbitalPeriod;
	}
	
	public String getOrbitalPeriod() {
		return orbitalPeriod;
	}
	
	public void setDistanceFromSun(String distanceFromSun) {
		this.distanceFromSun = distanceFromSun;
	}
	
	public String getDistanceFromSun() {
		return distanceFromSun;
	}
	
	public void setSurfaceArea(String surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	
	public String getSurfaceArea() {
		return surfaceArea;
	}
	
	public void setLengthOfDay(String lengthOfDay) {
		this.lengthOfDay = lengthOfDay;
	}
	
	public String getLengthOfDay() {
		return lengthOfDay;
	}
	
	public void setRadius(String radius) {
		this.radius = radius;
	}
	
	public String getRadius() {
		return radius;
	}
	
	public void setHasRings(String hasRings) {
		this.hasRings = hasRings;
	}
	
	public String getHasRings() {
		return hasRings;
	}
	
	
	
	public void printPlanetDetails() {
		System.out.println(planetName + " |      " + orbitalPeriod + " (days) |  " + distanceFromSun + " (mi)   |  " + surfaceArea + " (sq mi)   |      " + lengthOfDay + " (hr)  | " + radius + " (mi)|    " + hasRings);
		System.out.println("---------------------------------------------------------------------------------------------------------");
	}
}
