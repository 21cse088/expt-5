package com;

import com.transact.*;
import com.loan.*;
public class Com {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        com.transact.bank obj=new com.transact.bank();
        obj.openAccount();
        obj.deposit();
        obj.withdrawal();
   }
    
}