package org.localstorm.carpool;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class RideRequest {
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
	
	@Persistent
	private float fromX;
	@Persistent
	private float fromY;
	@Persistent
	private String fromName;
	
	@Persistent
	private float toX;
	@Persistent
	private float toY;
	@Persistent
	private String toName;
	
	@Persistent
	private Long userId; // id of user who requested the ride
	
	@Persistent
	private Date date;
	
	@Persistent
	private Long timeFlexibility; // in minutes

	public float getFromX() {
		return fromX;
	}

	public void setFromX(float fromX) {
		this.fromX = fromX;
	}

	public float getFromY() {
		return fromY;
	}

	public void setFromY(float fromY) {
		this.fromY = fromY;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public float getToX() {
		return toX;
	}

	public void setToX(float toX) {
		this.toX = toX;
	}

	public float getToY() {
		return toY;
	}

	public void setToY(float toY) {
		this.toY = toY;
	}

	public String getToName() {
		return toName;
	}

	public void setToName(String toName) {
		this.toName = toName;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getTimeFlexibility() {
		return timeFlexibility;
	}

	public void setTimeFlexibility(Long timeFlexibility) {
		this.timeFlexibility = timeFlexibility;
	}

	public Long getId() {
		return id;
	}
	
}
