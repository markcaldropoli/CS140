package exam01;

import java.util.ArrayList;

public class VectorPlot {
	private ArrayList<Vector> vectors = new ArrayList<>();

	public void addVector(Vector vector) {
		vectors.add(vector);
	}

	public Vector findResultant() {
		double hsum = 0;
		double vsum = 0;
		if(vectors == null || vectors.size() == 0) {
			Vector newVector = new Vector(0.0,0.0);
			return newVector;
		}
		for(int i=0; i<vectors.size(); i++) {
			if(vectors.get(i) != null) {
				hsum += vectors.get(i).getHorz();
			}
			if(vectors.get(i) != null) {
				vsum += vectors.get(i).getVert();
			}
		}
		Vector newVector = new Vector(hsum,vsum);
		return newVector;
	}

	public int numMagnitudeAbove(double magnitude) {
		int count = 0;
		for(int i=0; i<vectors.size(); i++) {
			if(vectors.get(i) != null && vectors.get(i).magnitude() > magnitude) {
				count++;
			}
		}
		return count;
	}
}
