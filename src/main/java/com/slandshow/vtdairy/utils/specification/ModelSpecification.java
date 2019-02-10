package com.slandshow.vtdairy.utils.specification;

import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import com.slandshow.vtdairy.models.Content;
import com.slandshow.vtdairy.models.Entry;
import com.slandshow.vtdairy.models.User;
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

            // Join and predicate contentText from Content
            Optional.ofNullable(requestEntry.getContentText()).ifPresent(
                    contentText -> {
                        Join<Content, Entry> joinedContent = root.join("content");
                        predicates.add(criteriaBuilder.like(joinedContent.get("contentText"), "%" + contentText + "%"));
                    }
            );

            // Join and predicate login from User
            Optional.ofNullable(requestEntry.getLogin()).ifPresent(
                    login -> {
                        Join<User, Entry> joinedUser = root.join("user");
                        predicates.add(criteriaBuilder.like(joinedUser.get("login"), "%" + login + "%"));
                    }
            );

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }

}
