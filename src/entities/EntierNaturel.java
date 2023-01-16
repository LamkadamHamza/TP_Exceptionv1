package entities;

import exception.NombreNegatifException;

public class EntierNaturel {

    private int val;

    public EntierNaturel(int val) throws NombreNegatifException {

        // if (val<0) throw new NombreNegatifException("le nombre doit etre positive!!!");

           // this.val = val;
        this.setVal(val);

    }


    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if (val<0) throw new NombreNegatifException("le nombre doit etre positive!!!");
        this.val = val;
    }


    public void decrementer() throws NombreNegatifException {
        this.val=this.val-1;

    }
}
