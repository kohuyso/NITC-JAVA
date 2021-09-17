package Lesson4_Hinh;

public class Rectangular extends Tu_giac{
	public double CV() {
		return (super.sd[0] + super.sd[1]) * 2;
	}
	public double DT() {
		return super.sd[0] * super.sd[0];
	}
}
