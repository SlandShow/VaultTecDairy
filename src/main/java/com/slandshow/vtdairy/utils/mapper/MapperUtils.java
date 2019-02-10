package com.slandshow.vtdairy.utils.mapper;

import com.slandshow.vtdairy.models.Content;
import com.slandshow.vtdairy.models.Entry;
import com.slandshow.vtdairy.models.User;
import com.slandshow.vtdairy.models.dto.ContentDto;
import com.slandshow.vtdairy.models.dto.EntryDto;
import com.slandshow.vtdairy.models.dto.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MapperUtils {

    private final ModelMapper modelMapper = new ModelMapper();

    public EntryDto mapperToEntryDto(Entry entry) {
        return modelMapper.map(entry, EntryDto.class)
                .setContent(
                        mapperToContentDto(entry.getContent())
                );
    }

    public ContentDto mapperToContentDto(Content content) {
        return modelMapper.map(content, ContentDto.class);
    }

    public List<EntryDto> mapperToEntryDtoList(List<Entry> entries) {
        List<EntryDto> entryDtos = new ArrayList<>();

        entries.forEach(
                entry -> entryDtos.add(mapperToEntryDto(entry))
        );

        return entryDtos;
    }

    public UserDto mapperToUserDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }

}
