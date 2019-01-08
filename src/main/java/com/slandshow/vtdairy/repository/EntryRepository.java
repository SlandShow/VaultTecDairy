package com.slandshow.vtdairy.repository;

import com.slandshow.vtdairy.models.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EntryRepository extends JpaRepository<Entry, Long>, JpaSpecificationExecutor<Entry> {
}
