public Class Kreis {
	private double x // x-Koordinate des Mittelpunktes
	private double y; // y-Koordinate des Mittelpunktes
	private r; // Radius
	
	public void Kreis(double x_mittel, y_mittel, radius){
		x = x_mittel;
		y = y_mittel;
		rad = radius;
	}
	public ermittleUmfang()
		double umfang
		umfang = 2*Math.PI*r;
		return umfang;
	}
	double ermittleFlaecheninhalt(){
		return PI*r*r;
	}
	public ausgabe(){
		System.out.println("xMittel: " + x);
		System.out.println("yMittel: " + y);
		System.out.println("Radius:  " + r);
	}
}
