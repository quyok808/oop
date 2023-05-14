package introduce;

class Account {
	private String matk;
	private String tentk;
	private String sotien;
	public String getMatk() {
		return matk;
	}
	public void setMatk(String matk) {
		this.matk = matk;
	}
	public String getTentk() {
		return tentk;
	}
	public void setTentk(String tentk) {
		this.tentk = tentk;
	}
	public String getSotien() {
		return sotien;
	}
	public void setSotien(String sotien) {
		this.sotien = sotien;
	}
	public Account(String matk, String tentk, String sotien) {
		super();
		this.matk = matk;
		this.tentk = tentk;
		this.sotien = sotien;
		
	}
	public Account() {
		super();
		
	}
	public double sotien() {
		Double st = new Double(sotien);
		double y = st.doubleValue();
		return y;
	}
	public void output() {
		System.out.println(matk+"-"+tentk+" - "+sotien());
	}
}
