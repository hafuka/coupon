package coupon.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IUserFavorite implements Serializable {

	private static final long serialVersionUID = 1L;

	/** userIdプロパティ */
	@Id
	@Column(precision = 19, nullable = false, unique = false)
	public Long userId;

	/** shopIdプロパティ */
	@Id
	@Column(precision = 10, nullable = false, unique = false)
	public Integer shopId;

	/** insDatetimeプロパティ */
	@Column(nullable = false, unique = false)
	public Timestamp insDatetime;
}
