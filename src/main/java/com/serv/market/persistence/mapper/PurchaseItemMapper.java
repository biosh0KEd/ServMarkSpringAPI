package com.serv.market.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.Mapping;

import com.serv.market.persistence.entity.ComprasProducto;

import com.serv.market.domain.PurchaseItem;

@Mapper(componentModel = "spring", uses = {ProductMapper.class}) 
public interface PurchaseItemMapper {
    @Mappings({
        @Mapping(source = "id.idProducto", target = "productId"),
        @Mapping(source = "cantidad", target = "quantity"),
        //@Mapping(source = "total", target = "total"), No es necesario, ya que se llama igual
        @Mapping(source = "estado", target = "active")
    })
    PurchaseItem toPurchaseItem(ComprasProducto purchaseItem);

    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "compra", ignore = true),
        @Mapping(target = "producto", ignore = true),
        @Mapping(target = "id.idCompra", ignore = true)
    })
    ComprasProducto toComprasProducto(PurchaseItem purchaseItem);
}
