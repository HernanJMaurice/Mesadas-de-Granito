package mesadaspackage;

public class Mesada {
	
	private int ladoA;
	private int ladoB;
	
	public Mesada(int a, int b) {
			this.ladoA=a;
			this.ladoB=b;	
	}
	
	private void rotar() {
		int aux = this.ladoA;
		this.ladoA= this.ladoB;
		this.ladoB =aux;
	}
	
	public boolean apilableEn(Mesada mes) {
		if(this.ladoA<=mes.ladoA && this.ladoB<=mes.ladoB) {
			return true;
		}
		this.rotar();
		if(this.ladoA<=mes.ladoA && this.ladoB<=mes.ladoB) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ladoA;
		result = prime * result + ladoB;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mesada other = (Mesada) obj;
		if (ladoA != other.ladoA)
			return false;
		if (ladoB != other.ladoB)
			return false;
		return true;
	}
	
	
	
	
}
