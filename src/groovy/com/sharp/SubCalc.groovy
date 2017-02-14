
package com.sharp

import groovy.transform.CompileStatic;

@CompileStatic
public class SubCalc implements Calc {
    SharpConstant contstant;

    SharpConstant getContstant() {
        return contstant
    }

    void setContstant(SharpConstant contstant) {
        this.contstant = contstant
    }

    @Override
    public int calc(int a, int b) {
        return a - b + contstant.val;
    }
}
