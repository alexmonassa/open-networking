package org.gujavasc.opennetworking.domain.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.annotations.Expose;

@Entity
@XmlRootElement
public class Event implements Serializable {

	private static final long serialVersionUID = 6380125148649232157L;

	@Id
	@Expose
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false, nullable = false)
	private Long id = null;

	@Version
	@Column
	private int version = 0;

	@Column
	@Expose
	private String name;

	@Expose
	@Temporal(TemporalType.DATE)
	private Date startDate = new Date();

	@Expose
	@Temporal(TemporalType.DATE)
	private Date endDate = new Date();

	@Column
	@Expose
	private String detail;

	public Event() {
	}

	public Event(String name, String detail, Date startDate, Date endDate) {
		this.name = name;
		this.detail = detail;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}

		if (that == null) {
			return false;
		}

		if (getClass() != that.getClass()) {
			return false;
		}

		if (id != null) {
			return id.equals(((Event) that).id);
		}

		return super.equals(that);
	}

	@Override
	public int hashCode() {
		if (id != null) {
			return id.hashCode();
		}

		return super.hashCode();
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(final String detail) {
		this.detail = detail;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";

		if (name != null && !name.trim().isEmpty()) {
			result += "name: " + name;
		}

		if (detail != null && !detail.trim().isEmpty()) {
			result += ", detail: " + detail;
		}

		return result;
	}
}