package Base.src.Annoation;

public class Male implements Human {
    @Override
    public String toString() {
        return "Male";
    }

    @Override
    public String run(String a, String b) {
        return " Male is running.";
    }
}