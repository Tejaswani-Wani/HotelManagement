package com.MiniProject.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MiniProject.models.AdminPannel;

public interface AdminPannelDaos  extends JpaRepository<AdminPannel, Long> {

}
