package org.social.family.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
public class Person {
	
	@Id
	private Long personId;
	@Column
	private String name;
	@Column
	private String gender;
	@Column
	private Integer age;

}
