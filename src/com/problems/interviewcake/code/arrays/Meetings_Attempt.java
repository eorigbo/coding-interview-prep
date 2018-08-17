package com.problems.interviewcake.code.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Meetings_Attempt{

    public static List<Meeting> mergeMeetings(List<Meeting> meetings){
        if(meetings.size() < 1) throw new IllegalArgumentException("meetings list should have at least one meeting.");

        List<Meeting> sortedMeetings = new ArrayList<>();

        sortedMeetings.addAll(meetings);

        sortedMeetings.sort(new Comparator<Meeting>(){
            public int compare(Meeting m1, Meeting m2){
                return m1.getStartTime() - m2.getStartTime();
            }
        });

        List<Meeting> mergedMeetings = new ArrayList<>();
        mergedMeetings.add(sortedMeetings.get(0));

        for(Meeting meeting: sortedMeetings){
            Meeting lastMerged = mergedMeetings.get(mergedMeetings.size()-1);
            if(lastMerged.getEndTime() >= meeting.getStartTime()){
                lastMerged.setEndTime(Math.max(lastMerged.getEndTime(), meeting.getEndTime()));
            }else{
                mergedMeetings.add(meeting);
            }
        }
        return mergedMeetings;
    }

}
