package com.company.directoryofregions.repository;

import com.company.directoryofregions.domain.Region;
import com.company.directoryofregions.mapper.RegionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionDaoImpl implements RegionDao{

    @Autowired
    RegionMapper regionMapper;

    @Override
    public Region addRegion(Region region) {
        String newRegion = regionMapper.addRegion(region);
        return getByName(region.getName());
    }

    @Override
    public Region getById(Long id) {
        return regionMapper.getById(id);
    }

    @Override
    public Region getByName(String name) {
        return regionMapper.getByName(name);
    }

    @Override
    public List<Region> getAllRegions() {
        return regionMapper.getAllRegions();
    }

    @Override
    public boolean deleteById(Long id) {
        return regionMapper.deleteById(id);
    }

    @Override
    public boolean deleteByName(String name) {
        return regionMapper.deleteByName(name);
    }


}
