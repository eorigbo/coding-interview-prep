package com.problems.interviewcake.code.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Meetings_Attempt{

    public static List<Meeting> mergeMeetings(List<Meeting> meetings){

        //create a copy of original array
        List<Meeting> sortedMeetings = new ArrayList<>();

        for(Meeting meeting: meetings){
            Meeting meetingCopy = new Meeting(meeting.getStartTime(),meeting.getEndTime());
            sortedMeetings.add(meetingCopy);

        }

        //sort new array
        Collections.sort(sortedMeetings, new Comparator<Meeting>(){

            public int compare(Meeting m1, Meeting m2){
                return m1.getStartTime() - m2.getStartTime();
            }
        });

        //create and initialize a new array for merging meetings
        List<Meeting> mergedMeetings = new ArrayList<>();
        mergedMeetings.add(sortedMeetings.get(0));

        //merging logic: merge meetings where end time of current meeting >= start time of current meeting
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
