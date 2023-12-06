package com.serv.market.persistence.mapper;

import com.serv.market.persistence.entity.Categoria;
import com.serv.market.domain.Category;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.InheritInverseConfiguration;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
        @Mapping(source = "idCategoria", target = "categoryId"),
        @Mapping(source = "descripcion", target = "category"),
        @Mapping(source = "estado", target = "active"),
    }) // Map the fields from Categoria to Category
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration // Inherit the configuration from the method toCategory
    @Mapping(target = "productos", ignore = true) // Ignore the field productos from Categoria
    Categoria toCategoria(Category category); 
}
