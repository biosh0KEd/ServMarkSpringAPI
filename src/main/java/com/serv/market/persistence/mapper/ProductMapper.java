package com.serv.market.persistence.mapper;

import com.serv.market.domain.Product;
import com.serv.market.persistence.entity.Producto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.InheritInverseConfiguration;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mappings({
        @Mapping(source = "idProducto", target = "productId"),
        @Mapping(source = "nombre", target = "name"),
        @Mapping(source = "idCategoria", target = "categoryId"),
        @Mapping(source = "precioVenta", target = "price"),
        @Mapping(source = "cantidadStock", target = "stock"),
        @Mapping(source = "estado", target = "active"),
        @Mapping(source = "categoria", target = "category"),
    }) // Map the fields from Producto to Product
    Product toProduct(Producto producto); 
    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration // Inherit the configuration from the method toProduct
    @Mapping(target = "codigoBarras", ignore = true) // Ignore the field codigoBarras from Producto
    Producto toProducto(Product product);
}
