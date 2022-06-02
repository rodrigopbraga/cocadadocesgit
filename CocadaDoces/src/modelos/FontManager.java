package modelos;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

public class FontManager {
    public Font loadFont(String pCaminhoFonte, int tipoFonte, int pTamanho){
        Font mainFont=null;
        try{
            mainFont=Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream(pCaminhoFonte)).deriveFont(tipoFonte, pTamanho);
        }catch(IOException ex){
            ex.printStackTrace();
        }
        catch(FontFormatException ex){
            ex.printStackTrace();
        }
        return mainFont;
    }
}