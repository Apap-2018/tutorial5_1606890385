package com.apap.tutorial5.model;
import java.io.Serializable;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


	
	@Entity
	@Table(name="dealer")
	public class DealerModel implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	/*public DealerModel() {
		
	}*/
/*	public DealerModel(long id, @NotNull @Size(max = 50) String alamat, @NotNull @Size(max = 13) String noTelp,
			@NotNull @Size(max = 50) String nama, List<CarModel> listCar) {
		super();
		this.id = id;
		this.alamat = alamat;
		this.noTelp = noTelp;
		this.nama = nama;
		this.listCar = listCar;
	}*/

	@NotNull
	@Size(max=50)
	@Column(name= "alamat", nullable = false)
	private String alamat;
	
	@NotNull
	@Size(max=13)
	@Column(name="no_telp", nullable = false)
	private String noTelp;
	
	@NotNull
	@Size(max = 50)
	@Column(name = "nama", nullable = false)
	private String nama;
	
	
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNoTelp() {
		return noTelp;
	}

	public void setNoTelp(String noTelp) {
		this.noTelp = noTelp;
	}

	public List<CarModel> getListCar() {
		//Collections.sort(listCar, new SortByPrice());
		return listCar;
	}

	public void setListCar(List<CarModel> listCar) {
		
		this.listCar = listCar;
	}

	@OneToMany(mappedBy = "dealer", fetch = FetchType.LAZY, cascade= CascadeType.PERSIST)
	private List<CarModel> listCar;
	}
	
	
	class SortByPrice implements Comparator<CarModel> 
	{ 
	    // Used for sorting in ascending order of 
	    // roll number 
	    public int compare(CarModel a, CarModel b) 
	    { 
	        return Math.toIntExact(a.getPrice() - b.getPrice()); 
	    } 
	} 
	


