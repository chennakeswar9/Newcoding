package com.springdatajpa.springdatajpa.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides({@AttributeOverride(name = "name",
				column = @Column(name = "guradian_name")),
	
				@AttributeOverride(name = "Email",
					column = @Column(name = "guradian_Email")),
					})
public class Guardian {
	
	private String guardianName;
	private String guardianEmail;
	private String Mobile;
}
