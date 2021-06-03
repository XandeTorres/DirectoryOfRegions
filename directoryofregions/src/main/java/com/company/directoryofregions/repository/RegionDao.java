package com.company.directoryofregions.repository;

import com.company.directoryofregions.domain.Region;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RegionDao {

    Region addRegion(Region region);

    Region getById(Long id);

    Region getByName(String name);

    List<Region> getAllRegions();

    //Region updateRegion(Region region);

    boolean deleteByName(String name);

    boolean deleteById(Long id);
}
