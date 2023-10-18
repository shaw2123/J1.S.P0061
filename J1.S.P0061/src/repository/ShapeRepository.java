/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import DataAccess.ShapeDao;

/**
 *
 * @author ASUS
 */
public class ShapeRepository implements IShapeRepository {

    @Override
    public void calculate() {
        ShapeDao.Instance().display(
                ShapeDao.Instance().inputRectangle(),
                ShapeDao.Instance().inputCircle(),
                ShapeDao.Instance().inputTriangle());
    }
}
