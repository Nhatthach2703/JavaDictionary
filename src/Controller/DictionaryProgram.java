/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.DictionaryRepository;
import View.Menu;
import java.util.HashMap;

/**
 *
 * @author Xuan Vinh
 */
public class DictionaryProgram extends Menu<String> {
    static String[] mc = {"Add Word", "Delete Word", "Translate", "Exit"};
    DictionaryRepository program;
    HashMap<String, String> hm;

    public DictionaryProgram() {
        super("\nDictionary program", mc);
        program = new DictionaryRepository();
        hm = new HashMap<>();
        program.readFile(hm);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.addNewWord(hm);
                break;
            case 2:
                program.deleteWord(hm);
                break;
            case 3:
                program.translate(hm);
                break;
            case 4:
                System.exit(0);
        }
    }
}
