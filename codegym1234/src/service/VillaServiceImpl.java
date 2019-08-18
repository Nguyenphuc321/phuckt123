package service;

import model.Villa;

public class VillaServiceImpl implements VillaService {

    @Override
    public void displayVilla() {
        Villa villa = new Villa();
        for (Villa vil:villa.getVillas()){
            System.out.println(vil.getName()+"mô tả về vila:"+vil.getDescription());
        }
    }
}
