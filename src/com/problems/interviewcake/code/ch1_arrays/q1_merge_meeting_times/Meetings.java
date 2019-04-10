package com.problems.interviewcake.code.ch1_arrays.q1_merge_meeting_times;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Meetings{

    public static List<Meeting> mergeMeetings(List<Meeting> meetings){

        //make a copy of the List.
        List<Meeting> sortedMeetings = new ArrayList<>();

        sortedMeetings.addAll(meetings);

        //sort the copied List
        sortedMeetings.sort(new Comparator<Meeting>(){
            public int compare(Meeting m1, Meeting m2){
                return m1.getStartTime() - m2.getStartTime();
            }
        });

        //merge meetings where endTime of previous meeting >= startTime of current meeting
        List<Meeting> mergedMeetings = new ArrayList<>();

        //initialize mergedMeetings
        mergedMeetings.add(sortedMeetings.get(0));

        for(Meeting currentMeeting: sortedMeetings){
            Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size()-1);

            if(lastMergedMeeting.getEndTime() >= currentMeeting.getStartTime()){
                lastMergedMeeting.setEndTime(Math.max(lastMergedMeeting.getEndTime(),currentMeeting.getEndTime()));
            } else{
                mergedMeetings.add(currentMeeting);
            }

        }

        return mergedMeetings;

    }

}
