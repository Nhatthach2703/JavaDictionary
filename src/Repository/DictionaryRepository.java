/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAcess.DictionaryDAO;
import java.util.HashMap;

/**
 *
 * @author Xuan Vinh
 */
public class DictionaryRepository implements IDictionaryRepository{
    @Override
    public void addNewWord(HashMap<String, String> hm) {
        DictionaryDAO.Instance().addNewWord(hm);
    }

    @Override
    public void deleteWord(HashMap<String, String> hm) {
        DictionaryDAO.Instance().deleteWord(hm);
    }

    @Override
    public void translate(HashMap<String, String> hm) {
        DictionaryDAO.Instance().translate(hm);
    }

    @Override
    public void readFile(HashMap<String, String> hm) {
        DictionaryDAO.Instance().readFile(hm);
    }
}
