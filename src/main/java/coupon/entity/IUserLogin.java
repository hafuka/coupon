package coupon.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IUserLogin implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/** cookieValueプロパティ */
	@Id
	@Column(precision = 255, nullable = false, unique = false)
	public String cookieValue;
	
	@Column(precision = 19, nullable = false, unique = false)
    public Long userId;
	
	/** insDatetimeプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp insDatetime;
}
