package main;

public class Produkt {

	private String namn;
	private String kategori;
	private double pris;
	
	
	public void setNamn(String namn) {
		this.namn = namn;
	}
	
	public String getNamn() {
		return namn;
	}
	
	public void setKategori(String kategori) {
		this.kategori = kategori;
	}
	
	public String getKategori() {
		return kategori;
	}
	
	public void setPris(double pris) {
		this.pris = pris;
	}
	
	public double getPris() {
		return pris;
	}
	
}
