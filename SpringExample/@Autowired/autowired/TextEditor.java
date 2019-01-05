package autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
    //MemberAutowired
    @Autowired
    private SpellChecker spellChecker;

    //SetterAutowired
//    @Autowired
//    public void setSpellChecker(SpellChecker spellChecker) {
//        this.spellChecker = spellChecker;
//    }

    //ConstructorAutowired
//    @Autowired
//    public TextEditor(SpellChecker spellChecker) {
//        this.spellChecker = spellChecker;
//        System.out.println("Inside TextEditor constructor.");
//    }

    public TextEditor() {
        System.out.println("Inside TextEditor constructor.");
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
