package com.kursowaya.kurs_work.serviceImpl;

import com.kursowaya.kurs_work.dao.CustomerDao;
import com.kursowaya.kurs_work.model.Customer;
import com.kursowaya.kurs_work.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional
    @Override
    public void addCustomer(Customer customer) {
        if(customer.getPassword()!=null){
            String pass=customer.getPassword();
            customer.setPassword(passwordEncoder.encode(pass));
        }
        customerDao.save(customer);
    }

    @Transactional(readOnly = true)
    @Override
    public Customer findCustomerByUsername(String username) {
        return customerDao.findUserByUsername(username);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerDao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Customer> getCustomerByCustomerId(long customerId) {
        return customerDao.findById(customerId);
    }

    @Transactional(readOnly = true)
    @Override
    public Customer findCustomerByUsernameAndPassword(String username, String password) {
        return customerDao.findCustomerByUsernameAndPassword(username, password);
    }
}
