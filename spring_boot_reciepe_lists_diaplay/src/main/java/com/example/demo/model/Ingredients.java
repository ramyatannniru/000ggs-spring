package com.example.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ingredients {
  
	public Ingredients( String amount, String decescription, Reciepe reciepe) {
		super();
		this.amount = amount;
		this.decescription = decescription;
		this.reciepe = reciepe;
	}

	public Ingredients() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ingredients( String amount, String decescription) {
		super();
		this.amount = amount;
		this.decescription = decescription;

	}


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String amount;
    private String decescription;
    
   @OneToOne
   private Reciepe reciepe;

   
    

   

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ingredients ingredients = (Ingredients) o;

        return id != null ? id.equals(ingredients.id) : ingredients.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

	@Override
	public String toString() {
		return "Ingredients [id=" + id + ", amount=" + amount + ", decescription=" + decescription + ", reciepe="
				+ reciepe + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDecescription() {
		return decescription;
	}

	public void setDecescription(String decescription) {
		this.decescription = decescription;
	}

	public Reciepe getReciepe() {
		return reciepe;
	}

	public void setReciepe(Reciepe reciepe) {
		this.reciepe = reciepe;
	}

	

	

   
}
