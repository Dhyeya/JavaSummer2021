
public class PlanetApp {
	public static void main(String[] args) {
		System.out.println("---------------------------------------------------------------------------------------------------------");
		System.out.println("Name	| Orbital Period | Distance From Sun | Surface Area     | Length Of Day | Radius | has Rings |");
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		Planet Mercury = new Planet();
		Mercury.setPlanetName("Mercury");
		Mercury.setOrbitalPeriod("88"); // (days)
		Mercury.setDistanceFromSun("36 mil"); // (miles)
		Mercury.setSurfaceArea("29 mil"); // (sq miles)
		Mercury.setLengthOfDay("1,408"); // (hours)
		Mercury.setRadius("1,516"); // (miles)
		Mercury.setHasRings("No"); // (no rings)
		
		Mercury.printPlanetDetails();
		
		Planet Venus = new Planet();
		Venus.setPlanetName("Venus");
		Venus.setOrbitalPeriod("225");
		Venus.setDistanceFromSun("67.2 mil");
		Venus.setSurfaceArea("178 mil");
		Venus.setLengthOfDay("5,832");
		Venus.setRadius("3,760");
		Venus.setHasRings("No");
		
		Venus.printPlanetDetails();
		
		Planet Earth = new Planet();
		Earth.setPlanetName("Earth");
		Earth.setOrbitalPeriod("365");
		Earth.setDistanceFromSun("91.3 mil");
		Earth.setSurfaceArea("196.9 mil");
		Earth.setLengthOfDay("24");
		Earth.setRadius("3,959");
		Earth.setHasRings("No");
		
		Earth.printPlanetDetails();
		
		Planet Mars = new Planet();
		Mars.setPlanetName("Mars");
		Mars.setOrbitalPeriod("687");
		Mars.setDistanceFromSun("142 mil");
		Mars.setSurfaceArea("55.907 mil");
		Mars.setLengthOfDay("25");
		Mars.setRadius("2,106");
		Mars.setHasRings("No");
		
		Mars.printPlanetDetails();
		
		Planet Jupiter = new Planet();
		Jupiter.setPlanetName("Jupiter");
		Jupiter.setOrbitalPeriod("630");
		Jupiter.setDistanceFromSun("484 mil");
		Jupiter.setSurfaceArea("23.71 bil");
		Jupiter.setLengthOfDay("10");
		Jupiter.setRadius("43,441");
		Jupiter.setHasRings("Yes");
		
		Jupiter.printPlanetDetails();
		
		Planet Saturn = new Planet();
		Saturn.setPlanetName("Saturn");
		Saturn.setOrbitalPeriod("10,759");
		Saturn.setDistanceFromSun("890 mil");
		Saturn.setSurfaceArea("16.49 bil");
		Saturn.setLengthOfDay("11");
		Saturn.setRadius("36,184");
		Saturn.setHasRings("Yes");
		
		Saturn.printPlanetDetails();
		
		Planet Uranus = new Planet();
		Uranus.setPlanetName("Uranus");
		Uranus.setOrbitalPeriod("30,689");
		Uranus.setDistanceFromSun("1.8 bil");
		Uranus.setSurfaceArea("3.12 bil");
		Uranus.setLengthOfDay("17");
		Uranus.setRadius("15,759");
		Uranus.setHasRings("Yes");
		
		Uranus.printPlanetDetails();
		
		Planet Neptune = new Planet();
		Neptune.setPlanetName("Neptune");
		Neptune.setOrbitalPeriod("60,190");
		Neptune.setDistanceFromSun("2.8 bil");
		Neptune.setSurfaceArea("2.9 bil");
		Neptune.setLengthOfDay("16");
		Neptune.setRadius("15,299");
		Neptune.setHasRings("Yes");
		
		Neptune.printPlanetDetails();
		
		
	}
	
}
