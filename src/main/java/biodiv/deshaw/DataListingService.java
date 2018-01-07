package biodiv.deshaw;

import java.util.List;

import biodiv.Intercept;
import biodiv.common.AbstractDao;
import biodiv.common.AbstractService;
import biodiv.util.HibernateUtil;

public class DataListingService extends AbstractService<DataListing> {

private DataListingDao dataListingDao;
	
	public DataListingService(){
		this.dataListingDao = new DataListingDao();
	}
	
	
	@Override
	public DataListingDao getDao(){
		return dataListingDao;
	}
	
	@Intercept
	public List<DataListing> getList(String symbol) {
		List<DataListing> dataListings;
		try{
			//HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			 dataListings=getDao().getList(symbol);
			return dataListings;
		}catch(Exception e){
			//HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().rollback();
			throw e;
		}finally{
			//HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		}
		
		
	}

	@Intercept
	public List<CompanyListing> getCompanyList() {
		// TODO Auto-generated method stub
		
		List<CompanyListing> companyListings;
		try{
			//HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
			 companyListings=getDao().getCompanyList();
			return companyListings;
		}catch(Exception e){
			//HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().rollback();
			throw e;
		}finally{
			//HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
		}
		
		
	}

}
