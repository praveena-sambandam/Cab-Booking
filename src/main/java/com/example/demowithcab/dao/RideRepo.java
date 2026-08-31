package com.example.demowithcab.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demowithcab.entity.Ride;

public interface RideRepo extends JpaRepository<Ride,Integer>{

    List<Ride> findByDriver_Id(int driverid);

    List<Ride> findByPassanger_Id(int passangerid);

}