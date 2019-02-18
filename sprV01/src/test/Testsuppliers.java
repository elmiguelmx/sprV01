/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.SuppliersJpaController;
import java.sql.SQLException;
import entities.Suppliers;

/**
 *
 * @author Miguel
 */
public class Testsuppliers {

    public static void main(String[] args) throws SQLException {
        Suppliers s = new Suppliers(0, "Miguel", "Camacho", 21, "miguel.cam");

        SuppliersJpaController controller = new SuppliersJpaController();
        controller.create(s);
    }
}
