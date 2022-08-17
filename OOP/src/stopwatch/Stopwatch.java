package stopwatch;

import java.time.LocalTime;

public class Stopwatch {

        private LocalTime startTime, endTime;

        public void StopWatch() {
            this.startTime = LocalTime.now();
        }

        public void StopWatch(LocalTime startTime, LocalTime endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

    public Stopwatch(LocalTime start, LocalTime end) {

    }

    public LocalTime getStartTime() {
            return this.startTime;
        }

        public LocalTime getEndTime() {
            return this.endTime;
        }

        public void start() {
            this.startTime = LocalTime.now();
        }

        public void stop() {
            this.endTime = LocalTime.now();
        }

        public int getElapsedTime(){
            int i;
            i = (((endTime.getHour() - startTime.getHour()) * 3600) * 1000) + (((endTime.getMinute() - startTime.getMinute()) * 60) * 1000) + ((endTime.getSecond() - startTime.getSecond()) * 1000);
            return i;
        }
}
