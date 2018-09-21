package com.anyft.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anyft.DAO.TourDAO;
import com.anyft.Service.TourService;

@Service
@Transactional
public class TourServiceImpl implements TourService {
	
	@Autowired
	private TourDAO tourDAO;

}
