package com.sgrh.component;

import org.springframework.context.annotation.Scope;

@Scope("session")
public class Relation {
	private String relationName;
	private String relationAdharNumber;
	private String relationEducation;
	private String relationOccupation;
}
