package com.serv.market.persistence;

import com.serv.market.persistence.crud.ProductoCrudRepository;
import com.serv.market.persistence.entity.Producto;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import com.serv.market.domain.Product;
import com.serv.market.domain.repository.ProductRepository;
import com.serv.market.persistence.mapper.ProductMapper;

@Repository
public class ProductoRepository implements ProductRepository {
    @Autowired
    private ProductoCrudRepository productoCrudRepository;

    @Autowired
    private ProductMapper mapper;

    @Override
    public List<Product> getAll() {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<List<Product>> getByCategory(int idCategoria) {
        List<Producto> productos = productoCrudRepository.findByIdCategoria(idCategoria);
        return Optional.of(mapper.toProducts(productos));
    }

    @Override
    public Optional<List<Product>> getScarseProducts(int cantidadStock) {
        Optional<List<Producto>> productos = productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidadStock, true);
        return productos.map(prods -> mapper.toProducts(prods));
    }    

    @Override
    public Optional<Product> getProduct(int idProducto) {
        return productoCrudRepository.findById(idProducto).map(prod -> mapper.toProduct(prod));
    }

    @Override
    public Product save(Product product) {
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }

    @Override
    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }
}
