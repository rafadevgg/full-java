package generics;

import java.util.Objects;

public class Par<C, V> {

    private C chave;
    private V valor;

    public Par() {

    }

    public Par(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Par<?, ?> par = (Par<?, ?>) o;
        return Objects.equals(getChave(), par.getChave());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getChave());
    }

    public void setChave(C chave) {
        this.chave = chave;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    public C getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }

}
