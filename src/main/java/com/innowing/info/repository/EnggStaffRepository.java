package com.innowing.info.repository;

import com.innowing.info.entity.EnggStaff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface EnggStaffRepository extends JpaRepository<EnggStaff, Long> {
    EnggStaff findEnggStaffByUid(Long uid);
    List<EnggStaff> findByFirstNameIsContaining(String string);
    @Transactional
    void deleteByUid(Long uid);

}
