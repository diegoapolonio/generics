package generics.common;

import generics.common.BaseModel;
import generics.common.BaseService;
import generics.hotel.ModelNaoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class BaseServiceImpl<T extends BaseModel> implements BaseService<T> {

    private List<T> list;

    public BaseServiceImpl() {
        this.list = new ArrayList<>();
    }

    @Override
    public T salvar(T model) {
        list.add(model);
        return model;
    }

    @Override
    public void excluir(T model) {
        list.remove(model);
    }

    @Override
    public List<T> listar() {
        return list;
    }

    @Override
    public T buscarPorId(long id) {
        return list.stream()
                .filter(m-> m.getId() == id)
                .findFirst().orElseThrow(()->new ModelNaoEncontradoException("modeel nao encontrado"));
    }
}
