package com.decarli.api_cloud_deploy.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String icon;
    String description;
}
