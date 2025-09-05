// Mark.java
package org.example;

public enum Mark
{
    X, O, EMPTY;

    @Override
    public String toString()
    {
        return switch (this)
        {
            case X -> "X";
            case O -> "O";
            case EMPTY -> " ";
        };
    }
}

//@Override
//public String toString() {
//    switch (this) {
//        case X:
//            return "X";
//        case O:
//            return "O";
//        case EMPTY:
//            return " ";
//        default:
//            throw new IllegalArgumentException("Unknown mark: " + this);
//    }
//}
