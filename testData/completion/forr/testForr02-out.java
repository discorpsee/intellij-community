// Items: clone, length, arg, for, fori, forr, notnull, null
public class Foo {
    void m() {
        Integer[] xs = {1, 2, 3};
        for (int i = xs.length - 1; i >= 0; i--)<caret>
    }
}