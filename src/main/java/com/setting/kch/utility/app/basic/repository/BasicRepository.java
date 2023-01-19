package com.setting.kch.utility.app.basic.repository;

import com.setting.kch.utility.app.basic.entity.Basic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BasicRepository extends JpaRepository<Basic, Long> {
    Optional<Basic> findByName(String name);
}
