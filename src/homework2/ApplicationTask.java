package homework2;

import java.util.UUID;

public class ApplicationTask {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        for (int i = 0; i < 16; i++) {
            notepad.add(i + " - " +UUID.randomUUID().toString());
        }
        notepad.print();
        notepad.del();
        notepad.print();


    }
}
