package com.mobiquity.atmlocator.dao;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mobiquity.atmlocator.entity.AtmDetails;

/**
 * @author Himanshu Gupta
 *
 */
@Repository
public interface AtmDAO
{
  List<AtmDetails> getATM() throws IOException;
}
