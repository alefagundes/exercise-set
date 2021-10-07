package entities;

import java.util.Date;
import java.util.Objects;

public class Access{
	private String name;
	private Date instante;
	
	public Access() {
	}

	public Access(String name, Date instante) {
		this.name = name;
		this.instante=instante;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getInstante() {
		return instante;
	}
	
	public void setInstante(Date instante) {
		this.instante=instante;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Access other = (Access) obj;
		return Objects.equals(name, other.name);
	}
	
	

}
