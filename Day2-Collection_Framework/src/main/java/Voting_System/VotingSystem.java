package Voting_System;

import java.util.*;

public class VotingSystem
{
    private Map<Candidate, Integer> votes = new HashMap<>();

    public void castVote(Candidate candidate)
    {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
    }

    public void displayResultsSorted()
    {
        Map<Candidate, Integer> sortedVotes = new TreeMap<>(Comparator.comparing(Candidate::getName));
        sortedVotes.putAll(votes);
        sortedVotes.forEach((candidate, voteCount) ->
                System.out.println(candidate + ": " + voteCount + " votes"));
    }

    public void displayResultsInsertionOrder()
    {
        Map<Candidate, Integer> insertionOrderVotes = new LinkedHashMap<>(votes);
        insertionOrderVotes.forEach((candidate, voteCount) ->
                System.out.println(candidate + ": " + voteCount + " votes"));
    }

    public Map<Candidate, Integer> getVotes() {
        return new HashMap<>(votes);
    }

    public Map<Candidate, Integer> getSortedVotes() {
        Map<Candidate, Integer> sortedVotes = new TreeMap<>(Comparator.comparing(Candidate::getName));
        sortedVotes.putAll(votes);
        return sortedVotes;
    }

    public Map<Candidate, Integer> getInsertionOrderVotes() {
        return new LinkedHashMap<>(votes);
    }
}
