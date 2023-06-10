public class Elemento {
    
    TipoSocio socio;
    Elemento sgte;//puntero siguiente
    
    public Elemento(TipoSocio e){//constructor de los nodos de la lista enlazada
        socio = e;
        sgte = null;
    }

    public TipoSocio getSocio() {
        return socio;
    }

    
}
