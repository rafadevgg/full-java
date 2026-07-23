package poo.encapsulamento.casaB;

import poo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {
//        System.out.println(segredo); // private
//        System.out.println(facoDentroDeCasa); // package (default)
        System.out.println(formaDeFalar); // protected
        System.out.println(todosSabem); // public
        System.out.println(new Ana().todosSabem); // public
    }
    
}
