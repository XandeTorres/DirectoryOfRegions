package com.company.directoryofregions.mapper;


import com.company.directoryofregions.domain.Region;
import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@Mapper
public interface RegionMapper {

    @Insert("INSERT INTO Regions(id, name, shortName) VALUES (#{id}, #{name}, #{shortName})")
    @Options(useGeneratedKeys=true, keyProperty="id")
    public String addRegion(Region region);

    @Select("SELECT * FROM Regions")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "Name"),
            @Result(property = "shortName", column = "ShortName")
    })
    public List<Region> getAllRegions();

    @Select("SELECT * FROM Regions WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "Name"),
            @Result(property = "shortName", column = "ShortName")
    })
    public Region getById(@Param("id") Long id);

    @Select("SELECT * FROM Regions WHERE Name = #{name}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "Name"),
            @Result(property = "shortName", column = "ShortName")
    })
    public Region getByName(@Param("name") String name);

    @Delete("DELETE FROM Regions WHERE name=#{name} ")
    public boolean deleteByName(@Param("Name") String name);

    @Delete("DELETE FROM Regions WHERE id=#{id} ")
    public boolean deleteById(@Param("id") Long id);





}
