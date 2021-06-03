package com.company.directoryofregions;

import com.company.directoryofregions.domain.Region;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes({Region.class})
@MapperScan("com.company.directoryofregions.mapper")
@SpringBootApplication
public class DirectoryOfRegionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DirectoryOfRegionsApplication.class, args);
	}

}
