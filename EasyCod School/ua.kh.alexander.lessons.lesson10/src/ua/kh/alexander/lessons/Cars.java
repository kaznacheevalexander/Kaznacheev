package ua.kh.alexander.lessons;

public class Cars {
	@Override
	public String toString() {
		return "Cars [model=" + model + ", make=" + make + ", color=" + color + ", release=" + release + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + release;
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
		Cars other = (Cars) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (release != other.release)
			return false;
		return true;
	}

	protected String model;
	protected String make;
	protected String color;
	private int release;

	public String getmodel() {
		return this.model;
	}

	public void setmodel(String m) {
		this.model = m;
	}

	public String getmake() {
		return this.make;
	}

	public void setmake(String n) {
		this.make = n;
	}

	public String getcolor() {
		return this.color;
	}

	public void setcolor(String c) {
		this.color = c;
	}

	public int getrelease() {
		return this.release;
	}

	public void setrelease(int release) {
		this.release = release;
	}

	public Cars() {
		model = "Toyota";
		release = 2010;
	}

	public Cars(String model, int r) {
		this.model = model;
		this.make = make;
		this.color = color;
		this.release = r;
	}
}
