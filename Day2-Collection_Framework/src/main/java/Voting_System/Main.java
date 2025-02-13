package Voting_System;

public class Main
{
    public static void main(String[] args)
    {
        VotingSystem votingSystem = new VotingSystem();

        Candidate alice = new Candidate("Alice");
        Candidate bob = new Candidate("Bob");
        Candidate carol = new Candidate("Carol");

        votingSystem.castVote(alice);
        votingSystem.castVote(bob);
        votingSystem.castVote(alice);
        votingSystem.castVote(carol);
        votingSystem.castVote(bob);
        votingSystem.castVote(bob);

        System.out.println("Results in Sorted Order:");
        votingSystem.displayResultsSorted();

        System.out.println("\nResults in Insertion Order:");
        votingSystem.displayResultsInsertionOrder();
    }
}
