package org.sang.service;

import org.sang.mapper.SystemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SystemService {
    @Autowired
    SystemMapper systemMapper;

}
