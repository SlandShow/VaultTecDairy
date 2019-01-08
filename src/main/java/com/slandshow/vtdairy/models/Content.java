package com.slandshow.vtdairy.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "content")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Content {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "content_text")
    private String contentText;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "content")
    private Entry entry;

}
