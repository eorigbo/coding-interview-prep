package com.problems.interviewcake.scratch_pad;

public class Meeting {
        public int startTime;
        public int endTime;

        public Meeting(int startTime, int endTime){
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public int getStartTime(){
            return startTime;
        }

        public int getEndTime(){
            return endTime;
        }

        public void setEndTime(int endTime){
            this.endTime = endTime;
        }

        public void setStartTime(int startTime){
            this.startTime = startTime;
        }

        @Override
        public boolean equals(Object o){
            if(o == this) return true;
            if(!(o instanceof Meeting)) return false;

            Meeting meeting = (Meeting)o;
            return this.startTime == meeting.startTime && this.endTime == meeting.endTime;
        }
}
