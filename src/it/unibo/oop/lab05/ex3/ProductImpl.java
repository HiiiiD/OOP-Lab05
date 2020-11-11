package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {

	private final String name;
	private final double quantity;
	
	public ProductImpl(String name, double quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getQuantity() {
		return this.quantity;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		ProductImpl other = (ProductImpl) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return String.format("%s -> %f", this.name, this.quantity);
	}
	
	

}
