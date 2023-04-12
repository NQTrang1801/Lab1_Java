package Bai_03;

public class PhanSo {
	public int tu;
	public int mau;
	
	public PhanSo() {
		super();
		this.tu = 0;
		this.mau = 1;
	}
	public PhanSo(int tu, int mau) {
		super();
		this.tu = tu;
		this.mau = mau;
	}
	
	public int iUCLN(int tu, int mau) {
		while (tu != mau) {
			if (tu > mau) 
				tu -= mau;
			else
				mau -= tu;
		}
		return tu;
	}
	
	public void toiGianPS() {
		if (tu == 0)
			return;
		int uc = iUCLN(Math.abs(this.tu), Math.abs(this.mau));
		this.tu = this.tu / uc;
		this.mau = this.mau / uc;
	}
	
	public PhanSo congPS(PhanSo ps) {
		int t = this.tu * ps.mau + this.mau * ps.tu;
		int m = this.mau*ps.mau;
		PhanSo sum = new PhanSo(t, m);
		if (sum.mau == 0)
			return null;
		sum.toiGianPS();
		return sum;
	}
	
	public PhanSo truPS(PhanSo ps) {
		int t = this.tu * ps.mau - this.mau * ps.tu;
		int m = this.mau*ps.mau;
		PhanSo sub = new PhanSo(t, m);
		if (sub.mau == 0)
			return null;
		sub.toiGianPS();
		return sub;
	}
	
	public PhanSo nhanPS(PhanSo ps) {
		int t = this.tu * ps.tu;
		int m = this.mau * ps.mau;
		PhanSo mul = new PhanSo(t, m);
		if (mul.mau == 0)
			return null;
		mul.toiGianPS();
		return mul;
	}
	
	public PhanSo chiaPS(PhanSo ps) {
		if (ps.tu == 0)
			return null;
		int t = this.tu * ps.mau;
		int m = this.mau * ps.tu;
		PhanSo div = new PhanSo(t, m);
		if (div.mau == 0)
			return null;
		div.toiGianPS();
		return div;
	}
	 public void printPS() {
		 if (tu != 0)
			 System.out.println(tu + "/" + mau);
		 else
			 System.out.println("0");
	 }
}
