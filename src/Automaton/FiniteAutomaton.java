package Automaton;

public abstract class FiniteAutomaton{
    protected int stateCount;
    protected char [][]stateName;
    protected int initialState = 0;
    protected int []finalStates;
    protected int inputAlphabetMode = 0; // 0-Default Mode(No Restriction)
    protected int [][]transitionFunction;

    public abstract int stringAcceptance(char []inputStr);
}