package homework2;

import java.util.Arrays;

public class Notepad {
    String [] notepad = new String[10];
    private static int count = 0;




    public void add(String s) {
        if (count >= notepad.length) {
            String [] newNotepad = Arrays.copyOf(notepad, notepad.length*2);
            notepad = newNotepad;
        }
        notepad[count] = s;
        count++;
    }

    public void del() {
        notepad[count-1] = null;
        count--;
    }

    public void print(){
        for (int i = 0; i < notepad.length; i++) {
            if (notepad[i] != null)
                System.out.println(notepad[i]);

        }
    }

}
