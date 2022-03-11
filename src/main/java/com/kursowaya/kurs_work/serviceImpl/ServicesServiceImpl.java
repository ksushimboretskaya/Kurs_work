package com.kursowaya.kurs_work.serviceImpl;

import com.kursowaya.kurs_work.dao.ServicesDao;
import com.kursowaya.kurs_work.model.Services;
import com.kursowaya.kurs_work.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServicesServiceImpl implements ServicesService {
    private static final int PAGE_ELEMENT_SIZE_ADMIN = 12;

    private static final int PAGE_ELEMENT_SIZE_CUSTOMER = 12;

    @Autowired
    private ServicesDao productDao;

    @Transactional()
    @Override
    public void addServices(Services services) {
        productDao.save(services);
    }

    @Transactional(readOnly = true)
    @Override
    public Services getServicesById(long servicesId) {
        return productDao.findOne(servicesId);
    }

    @Transactional()
    @Override
    public void updateServices(Services services) {
        productDao.save(services);
    }

    @Transactional()
    @Override
    public void deleteServices(long servicesId) {
        productDao.delete(servicesId);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Services> getAllServicesByCategory(String category) {
        return productDao.findAllServicesByServicesCategory(category);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Services> getAllServices() {
        return (List<Services>) productDao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Page<Services> getAllServices(Integer pageNumber) {
        PageRequest pageRequest = PageRequest.of(pageNumber - 1, PAGE_ELEMENT_SIZE_ADMIN);
        return productDao.findAll(pageRequest);
    }

    @Transactional(readOnly = true)
    @Override
    public Page<Services> getAllServicesByCategory(Integer pageNumber,String category) {
        Pageable pageable=createPageRequest(pageNumber-1,PAGE_ELEMENT_SIZE_CUSTOMER);
        return productDao.findAllServicesByServicesCategory(category,pageable);
    }

    private Pageable createPageRequest(int pageNumber,int size) {
        return PageRequest.of(pageNumber,size);
    }

    @Transactional(readOnly = true)
    @Override
    public Page<Services> getAllServicesByCategoryOrCostOrName(Integer pageNumber, String searchTerm) {
        Pageable pageable=createPageRequest(pageNumber-1, PAGE_ELEMENT_SIZE_ADMIN);
        return productDao.findAllServicesByNameOrCostOrCategory(searchTerm, pageable);
    }
}