package biodiv.deshaw;

import java.util.List;

import javax.persistence.Query;

import biodiv.common.AbstractDao;
import biodiv.common.DaoInterface;

public class DataListingDao extends AbstractDao<DataListing,Long> implements DaoInterface<DataListing,Long>{

	@Override
	public DataListing findById(Long id) {
		DataListing entity = (DataListing) getCurrentSession().get(DataListing.class, id);
		return entity;
	}

	public List<DataListing> getList(String symbol) {
		
		symbol=symbol.trim();
		// TODO Auto-generated method stub
		String hql = "select dt.id from DataListing dt where dt.symbol = :symbol ";
		Query query = getCurrentSession().createQuery(hql).setParameter("symbol", symbol);
		List<DataListing> dataListings=query.getResultList();
		
		return dataListings;
	}

	public List<CompanyListing> getCompanyList() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String hql = "from CompanyListing)";
				Query query = getCurrentSession().createQuery(hql);
				List<CompanyListing> dataListings=query.getResultList();
		
				return dataListings;
	}

	
}
