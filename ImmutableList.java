public interface ImmutableList {
    //must implement
    public int length();
    public int sum(); // empty list sum is defined as 0
    public ImmutableList append(final ImmutableList other);
    public boolean contains(final int value);
    
    //examples
    // [1,2].addAmount(5) -> [6, 7]
    // [3, 1, 4].addAmount(2) -> [5, 3, 6]
    // [].addAmount(7) -> []

    //provided
    public boolean equals(final Object other);
    public String toString();
    public int hashCode();
} // ImmutableList
