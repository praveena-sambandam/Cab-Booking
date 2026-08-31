package com.example.demowithcab.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demowithcab.entity.*;
public interface VehicleRepo extends JpaRepository<Vehicle,Integer>{

}
