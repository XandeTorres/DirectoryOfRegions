package com.company.directoryofregions.service;

import com.company.directoryofregions.domain.Region;

import java.util.List;

public interface RegionService {

    Region addRegion(Region region);

    Region getByName(String name);

    Region getById(Long id);

    List<Region> getAllRegions();

   // Region updateRegion(Region region);

    boolean deleteByName(String name);

    boolean deleteById(Long id);

}
