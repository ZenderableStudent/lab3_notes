package pl.edu.utp.po.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Size(min = 1, max = 25)
	private String Importance;
	
	@Size(min = 1, max = 255)
	private String Text;
	
	@CreationTimestamp
	private Timestamp timestamp;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImportance() {
		return Importance;
	}

	public void setImportance(String importance) {
		Importance = importance;
	}

	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
}