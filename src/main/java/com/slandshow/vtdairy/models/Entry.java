package com.slandshow.vtdairy.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "entry")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Entry {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "entry_date")
    private Date date;

    @Column(name = "title")
    private String title;

    @OneToOne()
    @JoinColumn(name = "content_id", referencedColumnName = "id")
    @JsonIgnore
    private Content content;

}
