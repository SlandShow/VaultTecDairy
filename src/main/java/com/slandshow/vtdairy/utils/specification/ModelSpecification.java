package com.slandshow.vtdairy.utils.specification;

import javax.persistence.criteria.Predicate;
import com.slandshow.vtdairy.models.Entry;
import com.slandshow.vtdairy.models.dto.RequestEntry;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ModelSpecification {

    private ModelSpecification() {
    }

    public static Specification<Entry> criteriaForEntry(RequestEntry requestEntry) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            // Predicate title
            Optional.ofNullable(requestEntry.getTitle()).ifPresent(
                    title -> predicates.add(criteriaBuilder.like(root.get("title"), "%" + title + "%"))
            );


            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }

}
