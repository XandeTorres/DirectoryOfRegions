package com.company.directoryofregions.service;

import com.company.directoryofregions.domain.Region;
import com.company.directoryofregions.repository.RegionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService{

    @Autowired
    RegionDao regionDao;


    @Override
    public Region addRegion(Region region) {
        return regionDao.addRegion(region);
    }

    @Override
    public Region getByName(String name) {
        return regionDao.getByName(name);
    }

    @Override
    public Region getById(Long id) {
        return regionDao.getById(id);
    }

    @Override
    public List<Region> getAllRegions() {
        return regionDao.getAllRegions();
    }



    @Override
    public boolean deleteByName(String name) {
        return regionDao.deleteByName(name);
    }

    @Override
    public boolean deleteById(Long id) {
        return regionDao.deleteById(id);
    }
}
