package generics.common;

import generics.common.BaseModel;

import java.util.List;

public interface BaseService<T extends BaseModel> {
    T salvar(T model);
    void excluir(T model);
    List<T> listar();
    T buscarPorId(long id);
}
