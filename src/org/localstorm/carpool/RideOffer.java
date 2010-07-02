package org.localstorm.carpool;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class RideOffer {
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
	
	@Persistent
	private double fromX;
	@Persistent
	private double fromY;
	@Persistent
	private String fromName;
	
	@Persistent
	private double toX;
	@Persistent
	private double toY;
	@Persistent
	private String toName;
	
	@Persistent
	private Long userId; // id of user who offered the ride
	
	@Persistent
	private Date date;
	
	@Persistent
	private Long timeFlexibility; // in minutes

	public double getFromX() {
		return fromX;
	}

	public void setFromX(double fromX) {
		this.fromX = fromX;
	}

	public double getFromY() {
		return fromY;
	}

	public void setFromY(double fromY) {
		this.fromY = fromY;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public double getToX() {
		return toX;
	}

	public void setToX(double toX) {
		this.toX = toX;
	}

	public double getToY() {
		return toY;
	}

	public void setToY(double toY) {
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

	public RideOffer(double fromX, double fromY, String fromName, double toX,
			double toY, String toName, Long userId, Date date,
			Long timeFlexibility) {
		super();
		this.fromX = fromX;
		this.fromY = fromY;
		this.fromName = fromName;
		this.toX = toX;
		this.toY = toY;
		this.toName = toName;
		this.userId = userId;
		this.date = date;
		this.timeFlexibility = timeFlexibility;
	}
	
	
}
