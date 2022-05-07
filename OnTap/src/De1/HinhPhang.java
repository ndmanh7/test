package De1;

public abstract class HinhPhang {
	abstract public float tinhCV();
	abstract public float tinhDT();
	public String toString() {
		return ""+tinhDT()+tinhCV();
	}
}
