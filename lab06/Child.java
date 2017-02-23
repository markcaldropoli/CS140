package lab06;

public class Child extends Parent {
	@Override
	public boolean isChild() {
		return true;
	}

	@Override
	public String toString() {
		return "I am a child";
	}
}
