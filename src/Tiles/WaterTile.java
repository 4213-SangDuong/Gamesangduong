package Tiles;


import ImageHelper.Assets;
import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TinhDk
 */
public class WaterTile extends Tile{
    
    public WaterTile(int id) {
        super(Assets.water, id);
    }
    @Override
     public boolean isSolid(){
        return true;
    }
}
