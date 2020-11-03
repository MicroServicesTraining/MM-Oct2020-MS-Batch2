/**
 * 
 */
package com.mm.sb.client.ms.domain;

/**
 * @author dorak
 *
 */
public class Student {
	private Long rollNo;
	private String name;
	private Integer marks;
	
	
	public Student() {}
		
	/**
	 * @param rollNo
	 * @param name
	 * @param marks
	 */
	public Student(Long rollNo, String name, Integer marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	/**
	 * @return the rollNo
	 */
	public Long getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the marks
	 */
	public Integer getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
			
}
