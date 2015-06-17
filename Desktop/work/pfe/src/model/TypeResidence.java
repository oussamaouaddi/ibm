package model;

// Generated 28 avr. 2015 00:46:40 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TypeRedisence generated by hbm2java
 */
@Entity
@Table(name = "type_redisence", catalog = "ibm_pfe")
public class TypeResidence implements java.io.Serializable {

	private int idResidence;
	private String designation;
	private Set<CreditImmobilier> creditImmobiliers = new HashSet<CreditImmobilier>(
			0);

	public TypeResidence() {
	}

	public TypeResidence(int idResidence) {
		this.idResidence = idResidence;
	}

	public TypeResidence(int idResidence, String designation,
			Set<CreditImmobilier> creditImmobiliers) {
		this.idResidence = idResidence;
		this.designation = designation;
		this.creditImmobiliers = creditImmobiliers;
	}

	@Id
	@Column(name = "id_residence", unique = true, nullable = false)
	public int getIdResidence() {
		return this.idResidence;
	}

	public void setIdResidence(int idResidence) {
		this.idResidence = idResidence;
	}

	@Column(name = "designation", length = 254)
	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typeRedisence")
	public Set<CreditImmobilier> getCreditImmobiliers() {
		return this.creditImmobiliers;
	}

	public void setCreditImmobiliers(Set<CreditImmobilier> creditImmobiliers) {
		this.creditImmobiliers = creditImmobiliers;
	}

}
