package biodiv.deshaw;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import biodiv.Intercept;

@Path("/sample")
public class DataListingController {
	
	DataListingService dataListingService=new DataListingService();
	
	@GET 
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	@Intercept
	public List<DataListing> list(@QueryParam("symbol") String symbol){
		
		
	List<DataListing> dataListings=	dataListingService.getList(symbol);
		return dataListings;
	}

	
	@GET 
	@Path("/companylist")
	@Produces(MediaType.APPLICATION_JSON)
	@Intercept
	public List<CompanyListing> companyList(){
		
		
	List<CompanyListing> dataListings=	dataListingService.getCompanyList();
		return dataListings;
	}
}
