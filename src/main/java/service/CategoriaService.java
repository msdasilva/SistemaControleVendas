package service;

import model.Categoria;
import org.springframework.stereotype.Service;
import repository.CategoriaRepository;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> getAllCategorias() {
        return this.categoriaRepository.findAll();
    }

    public List<Categoria> getCategoriaByNome(String categoria) {
        return this.categoriaRepository.findByNome(categoria);
    }
}
