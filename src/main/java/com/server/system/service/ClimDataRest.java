package com.server.system.service;

import com.server.system.domain.ClimData;
import com.server.system.persistence.ClimDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/climDataService")
public class ClimDataRest {

    @Autowired
    private ClimDataRepo repo;

    @GetMapping("/{year}")
    public Iterable<ClimData> getByYear(@PathVariable("year") String year, @RequestHeader String tenantId) {
        return repo.getByYear(year);
    }

    @PostMapping
    public void save(@RequestBody ClimData entity, @RequestHeader String tenantId) {
        repo.save(entity);
    }


}
