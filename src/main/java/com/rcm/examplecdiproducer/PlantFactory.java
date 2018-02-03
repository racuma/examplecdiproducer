/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rcm.examplecdiproducer;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;

/**
 *
 * @author nuriailaia
 */
@SessionScoped
public class PlantFactory implements Serializable {

    private static final long serialVersionUID = 1L;

    @Produces
    @Plants(PlantType.ORDI)
    public IPlant getOrdiPlant() {
        return new OrdiPlant();
    }

    @Produces
    @Plants(PlantType.BLAT)
    public IPlant getBlatPlant() {
        return new BlatPlant();
    }

}
