package service;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import model.House;

public class HouseServiceImpl implements HouseService {
    @Override
    public void displayHouse(){
        House house = new House();
        for(House hou: house.getHouses()){
            System.out.println(hou.getName()+"mô tả về house"+hou.getDescription());
        }
    }
}
