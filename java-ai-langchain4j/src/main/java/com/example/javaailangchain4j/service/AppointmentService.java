package com.example.javaailangchain4j.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.javaailangchain4j.model.Appointment;

public interface AppointmentService extends IService<Appointment> {
Appointment getOne(Appointment appointment);
}