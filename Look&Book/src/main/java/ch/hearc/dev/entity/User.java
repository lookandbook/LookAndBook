package ch.hearc.dev.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column
    private Long id;
	
	@Column
	private String name;
	
	@Column
	private String right_type; // peut être à modifier en suivant l'exemple de cours de gestion de droit

	public User() {
		
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getRight_type() {
		return right_type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRight_type(String right_type) {
		this.right_type = right_type;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
