package io.exemplo.lsp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ContaSalario extends ContaCorrenteComum {

    @Override
    public void rende() {
        try {
            throw new Exception("Essa conta não possui rendimento");
        } catch (Exception ex) {
            Logger.getLogger(ContaSalario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
