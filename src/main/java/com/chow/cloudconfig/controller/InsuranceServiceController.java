package com.chow.cloudconfig.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/insurance-service")
public class InsuranceServiceController {

   @GetMapping("/getUpdatePlans")
   public List<String> getAllPlans() {
      return Stream.of("Premium", "Gold", " Normal").collect(Collectors.toList());
   }
}
