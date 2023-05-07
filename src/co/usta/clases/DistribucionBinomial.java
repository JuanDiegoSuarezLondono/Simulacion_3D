package co.usta.clases;

public class DistribucionBinomial {

	public int distribucionBinomial(int n, double p) {
		int x=0;
		int i=1;
		double ui;
		
		while(i<=n) {
			ui= Math.random();
			if(ui<=p) {
				x++;
			}
			i++;
		}
		
		return x;
	}
}
