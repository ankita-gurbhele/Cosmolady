package com.yas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.print.attribute.standard.Severity;
import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Component
public class HairCut {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column( nullable = false , unique = true)
	@NotEmpty(message = "Haircut Type Is required")
	private String haircutType;
	private int price;
	@Column(length = 2000)
	private String description;
	
	@Lob
	private byte[] image;
	
	@ManyToOne
	private Services service;
	

}
