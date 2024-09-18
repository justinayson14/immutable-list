public class Nil implements ImmutableList {
    public Nil() {}


    //must implement
    public int length() {
        return 0;
    }
    public int sum() {
        return 0;
    } // empty list sum is defined as 0
    public ImmutableList append(final ImmutableList other) {
        return null;
    }
    public boolean contains(final int value) {
        return false;
    }

    public boolean equals(final Object other) {
        return other instanceof Nil;
    } // equals
    
    public String toString() {
        return "Nil";
    } // toString

    public int hashCode() {
        return 0;
    } // hashCode
} // Nil
    
