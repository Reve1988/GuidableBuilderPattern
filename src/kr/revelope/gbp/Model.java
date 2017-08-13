package kr.revelope.gbp;

public class Model {
	private String a;
	private int b;
	private String c;
	private String d;
	private String e;
	private String f;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
	}

	@Override
	public String toString() {
		return "Model{" +
				"a='" + a + '\'' +
				", b=" + b +
				", c='" + c + '\'' +
				", d='" + d + '\'' +
				", e='" + e + '\'' +
				", f='" + f + '\'' +
				'}';
	}
}
