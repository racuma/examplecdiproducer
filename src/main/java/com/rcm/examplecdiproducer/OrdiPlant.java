/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcm.examplecdiproducer;

import javax.inject.Named;

/**
 *
 * @author nuriailaia
 */
@Named("")
public class OrdiPlant implements IPlant {

    @Override
    public String getTypeName() {
        return "Has creat Ordi";
    }
    
}
