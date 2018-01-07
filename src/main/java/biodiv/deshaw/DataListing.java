package biodiv.deshaw;

import java.sql.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "price", schema = "public")
public class DataListing implements java.io.Serializable {
	private DataListingsId id;
	private Date date;
	private String symbol;
	private Long open;
	private Long close;
	private Long low;
	private Long high;
	private Long volume;
	
	public DataListing(){
		
	}
	
	public DataListing(DataListingsId id,Date date, String symbol, Long open, Long close, Long low, Long high, Long volume) {
		super();
		this.id=id;
		this.date = date;
		this.symbol = symbol;
		this.open = open;
		this.close = close;
		this.low = low;
		this.high = high;
		this.volume = volume;
	}
	@EmbeddedId
	@AttributeOverrides({
		@AttributeOverride(name = "date", column = @Column(name = "date", nullable = false)),
		@AttributeOverride(name = "symbol", column = @Column(name = "symbol", nullable = false)),
		@AttributeOverride(name = "open", column = @Column(name = "open", nullable = false)) ,
		@AttributeOverride(name = "close", column = @Column(name = "close", nullable = false)) ,
		@AttributeOverride(name = "low", column = @Column(name = "low", nullable = false)) ,
		@AttributeOverride(name = "high", column = @Column(name = "high", nullable = false)) ,
		@AttributeOverride(name = "volume", column = @Column(name = "volume", nullable = false)) 
		})
	public DataListingsId getId() {
		return id;
	}
	
	public void setId(DataListingsId id) {
		this.id = id;
	}
	
	
	@Column(name = "date", nullable = false, insertable=false,updatable=false )
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Column(name = "symbol", nullable = false, insertable=false,updatable=false )
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	@Column(name = "open", nullable = false, insertable=false,updatable=false )
	public Long getOpen() {
		return open;
	}
	public void setOpen(Long open) {
		this.open = open;
	}
	
	@Column(name = "close", nullable = false, insertable=false,updatable=false )
	public Long getClose() {
		return close;
	}
	public void setClose(Long close) {
		this.close = close;
	}
	
	@Column(name = "low", nullable = false, insertable=false,updatable=false )
	public Long getLow() {
		return low;
	}
	public void setLow(Long low) {
		this.low = low;
	}
	
	@Column(name = "high", nullable = false, insertable=false,updatable=false )
	public Long getHigh() {
		return high;
	}
	public void setHigh(Long high) {
		this.high = high;
	}
	@Column(name = "volume", nullable = false, insertable=false,updatable=false )
	public Long getVolume() {
		return volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}


}
