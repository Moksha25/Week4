package Voting_System;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VotingSystemTest
{
    @Test
    public void testCastVote() {
        VotingSystem votingSystem = new VotingSystem();

        Candidate alice = new Candidate("Alice");
        Candidate bob = new Candidate("Bob");

        votingSystem.castVote(alice);
        votingSystem.castVote(bob);
        votingSystem.castVote(alice);

        Map<Candidate, Integer> expectedVotes = new HashMap<>();
        expectedVotes.put(alice, 2);
        expectedVotes.put(bob, 1);

        assertEquals(expectedVotes, votingSystem.getVotes());
    }

}
