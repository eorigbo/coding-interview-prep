package com.problems.interviewcake.code.arrays;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Meetings{

    public static List<Meeting> mergeMeetings(List<Meeting> meetings){

        //make a copy of the List
        List<Meeting> sortedMeetings = new ArrayList<>();

        for(Meeting meeting: meetings){

            Meeting meetingCopy = new Meeting(meeting.getStartTime(),meeting.getEndTime());
            sortedMeetings.add(meetingCopy);

        }

        //sort the copied List
        Collections.sort(sortedMeetings, new Comparator<Meeting>(){
            @Override
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
