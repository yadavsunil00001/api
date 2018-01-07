package biodiv.deshaw;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DataListingsId implements java.io.Serializable {
	private Date date;
	private String symbol;
	private Long open;
	private Long close;
	private Long low;
	private Long high;
	private Long volume;
	
	public DataListingsId(){
		
	}
	
	public DataListingsId(Date date, String symbol, Long open, Long close, Long low, Long high, Long volume) {
		super();
		this.date = date;
		this.symbol = symbol;
		this.open = open;
		this.close = close;
		this.low = low;
		this.high = high;
		this.volume = volume;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((close == null) ? 0 : close.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((high == null) ? 0 : high.hashCode());
		result = prime * result + ((low == null) ? 0 : low.hashCode());
		result = prime * result + ((open == null) ? 0 : open.hashCode());
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		result = prime * result + ((volume == null) ? 0 : volume.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataListingsId other = (DataListingsId) obj;
		if (close == null) {
			if (other.close != null)
				return false;
		} else if (!close.equals(other.close))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (high == null) {
			if (other.high != null)
				return false;
		} else if (!high.equals(other.high))
			return false;
		if (low == null) {
			if (other.low != null)
				return false;
		} else if (!low.equals(other.low))
			return false;
		if (open == null) {
			if (other.open != null)
				return false;
		} else if (!open.equals(other.open))
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		if (volume == null) {
			if (other.volume != null)
				return false;
		} else if (!volume.equals(other.volume))
			return false;
		return true;
	}
	@Column(name = "date", nullable = false)
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Column(name = "symbol", nullable = false)
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	@Column(name = "open", nullable = false)
	public Long getOpen() {
		return open;
	}
	public void setOpen(Long open) {
		this.open = open;
	}
	
	@Column(name = "close", nullable = false)
	public Long getClose() {
		return close;
	}
	public void setClose(Long close) {
		this.close = close;
	}
	
	@Column(name = "low", nullable = false)
	public Long getLow() {
		return low;
	}
	public void setLow(Long low) {
		this.low = low;
	}
	
	@Column(name = "high", nullable = false)
	public Long getHigh() {
		return high;
	}
	public void setHigh(Long high) {
		this.high = high;
	}
	
	@Column(name = "volume", nullable = false)
	public Long getVolume() {
		return volume;
	}
	public void setVolume(Long volume) {
		this.volume = volume;
	}
	
}
