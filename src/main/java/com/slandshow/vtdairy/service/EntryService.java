package com.slandshow.vtdairy.service;

import com.slandshow.vtdairy.models.Content;
import com.slandshow.vtdairy.models.Entry;
import com.slandshow.vtdairy.models.dto.EntryDto;
import com.slandshow.vtdairy.models.dto.RequestEntry;
import com.slandshow.vtdairy.repository.EntryRepository;
import com.slandshow.vtdairy.utils.mapper.MapperUtils;
import com.slandshow.vtdairy.utils.specification.ModelSpecification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EntryService {

    @Autowired
    private EntryRepository entryRepository;


    @Autowired
    private MapperUtils mapperUtils;

    public EntryDto getById(Long id) {
        log.debug("Retrieve entry from database via id = {}", id);

        Optional<Entry> optional = entryRepository.findById(id);
        return mapperUtils.mapperToEntryDto(
                optional.orElseThrow(
                        () -> new NullPointerException("SOSI")
                )
        );
    }

    public List<EntryDto> getAll() {
        log.debug("Retrieve all entries from database");
        return mapperUtils.mapperToEntryDtoList((List<Entry>) entryRepository.findAll());
    }

    public List<EntryDto> getEntryByCriteria(RequestEntry requestEntry) {
        log.debug("Retrieve entry = {} from database via criteria", requestEntry);

        List<Entry> entries = entryRepository.findAll(ModelSpecification.criteriaForEntry(requestEntry));
        return mapperUtils.mapperToEntryDtoList(entries);
    }

    public EntryDto saveEntry(RequestEntry requestEntry) {
        log.debug("Save entry in database via request params");

        Entry current = new Entry();
        current.setTitle(requestEntry.getTitle());
        Content content = new Content();
        content.setContentText(requestEntry.getContentText());
        current.setContent(content);

        return mapperUtils.mapperToEntryDto(entryRepository.save(current));
    }

}
