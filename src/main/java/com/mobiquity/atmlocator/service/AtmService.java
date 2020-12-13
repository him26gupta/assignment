package com.mobiquity.atmlocator.service;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobiquity.atmlocator.dao.AtmDAO;
import com.mobiquity.atmlocator.entity.AtmDetails;

/**
 * @author Himanshu Gupta
 *
 */
@Service
public class AtmService
{

  private final AtmDAO atmLocatorData;

  @Autowired
  public AtmService(AtmDAO atmLocatorData)
  {
    this.atmLocatorData = atmLocatorData;
  }

  public List<AtmDetails> getATM() throws Exception
  {
    return atmLocatorData.getATM();
  }

	/**
	 * @param city
	 * @return
	 * @throws Exception
	 */
	public List<AtmDetails> getATM(String city) throws Exception
  {
    return atmLocatorData.getATM().stream()
    		.filter(response -> response.getAddress().getCity().equalsIgnoreCase(city))
			.collect(toList());
}

}
