package poo.encapsulamento.casaB;

import poo.encapsulamento.casaA.Ana;

public class Julia {

    void testeAcessos() {
        Ana sogra = new Ana();

//        System.out.println(sogra.segredo); // private
//        System.out.println(sogra.facoDentroDeCasa); // package (default)
//        System.out.println(sogra.formaDeFalar); // protected
        System.out.println(sogra.todosSabem); // public

    }
    
}
