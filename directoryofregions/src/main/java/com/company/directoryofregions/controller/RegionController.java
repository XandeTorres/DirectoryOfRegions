package com.company.directoryofregions.controller;

import com.company.directoryofregions.domain.Region;
import com.company.directoryofregions.mapper.RegionMapper;
import com.company.directoryofregions.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.hateoas.MediaTypes;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/region")
public class RegionController {

    @Autowired
    RegionService regionService;

    @Autowired
    RegionMapper regionMapper;


    @RequestMapping(value="/addRegion", method = RequestMethod.POST)
    public Region addRegion(@RequestBody Region region){

        return regionService.addRegion(region);
    }

    @RequestMapping(value="/getByName/{name}",method = RequestMethod.GET)
    public Region getByName(@PathVariable String name ){

        return regionService.getByName(name);
    }

    @RequestMapping(value="/getById/{id}",method = RequestMethod.GET)
    public Region getById(@PathVariable Long id){

        return regionService.getById(id);
    }


    @GetMapping(value="/getAllRegions", produces= MediaTypes.HAL_JSON_VALUE)
    public List<Region> getAllRegions(){
        List<Region> regionsWithLinks= new ArrayList<>();
        List<Region> regions = regionService.getAllRegions();
        if(!CollectionUtils.isEmpty(regions) ){
            for(Region region : regions){

                Link getRegionLink = WebMvcLinkBuilder.linkTo(RegionController.class).slash("getRegion").slash(region.getId()).withSelfRel();
                Link deleteRegionLink = WebMvcLinkBuilder.linkTo(RegionController.class).slash("delete")
                        .slash(region.getId()).withRel("delete region").withMedia("PUT").withTitle("delete region");

                region.add(getRegionLink);
                region.add(deleteRegionLink);
                regionsWithLinks.add(region);
            }
        }
        return regionsWithLinks;
    }

    @RequestMapping(value="/deleteByName/{name}", method = RequestMethod.PUT )
    public boolean deleteByName(@PathVariable String name){

        return regionService.deleteByName(name);
    }

    @RequestMapping(value="/deleteById/{id}", method = RequestMethod.PUT )
    public boolean deleteById(@PathVariable Long id){

        return regionService.deleteById(id);
    }


}
