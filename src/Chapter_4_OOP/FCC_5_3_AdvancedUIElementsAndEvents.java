package Chapter_4_OOP;

// interface for elemetns that respond to click events
interface OnClickListener {
    void onClick();
}

// abstract superclass defining a contract for all UI elements
abstract class UIElement {
    abstract void draw();
    abstract void setOnClickListener(OnClickListener listener);
}

// button is subclass of UIElement and implements OnClickListener
// demonstrates multiple polymorphism
class Button extends UIElement implements OnClickListener {
    private OnClickListener listener;

    @Override
    void draw() {
        System.out.println("Drawing a button...");
    }

    @Override
    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    // simulates a click event
    void click() {
        if (listener != null) {
            listener.onClick();
        }
    }

    @Override
    public void onClick() {
        System.out.println("Button was clicked!");
    }
}

// dropdown is another subclass of UIElement
// can maybe implement OnClickListener but for brevity is omitted here
class Dropdown extends UIElement {
    @Override
    void draw() {
        System.out.println("Drawing a dropdown...");
    }

    @Override
    public void setOnClickListener(OnClickListener listener) {
        // dropdown click can be implemented here
    }
}

public class FCC_5_3_AdvancedUIElementsAndEvents {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.draw();
        btn.setOnClickListener(btn);
        btn.click();
    }
}
