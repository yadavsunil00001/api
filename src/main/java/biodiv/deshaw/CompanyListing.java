package biodiv.deshaw;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "companydetails", schema = "public")
public class CompanyListing {
	
	
	private int id;
	private String symbol;
	private String name;
	private String marketcap;
	private String sector;
	private String industry;
	
	
	
	public CompanyListing() {
		super();
	}

	public CompanyListing(int id, String symbol, String name, String marketcap, String sector, String industry) {
		super();
		this.id = id;
		this.symbol = symbol;
		this.name = name;
		this.marketcap = marketcap;
		this.sector = sector;
		this.industry = industry;
	}
	
	@Id
	@Column(name = "id", nullable = false )
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	@Column(name = "symbol", nullable = false)
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	
	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "marketcap", nullable = false)
	public String getMarketcap() {
		return marketcap;
	}
	public void setMarketcap(String marketcap) {
		this.marketcap = marketcap;
	}
	@Column(name = "sector", nullable = false)
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	
	@Column(name = "industry", nullable = false)
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	
	
	
}
