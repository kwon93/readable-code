package cleancode.studycafe.tobe;

import cleancode.studycafe.tobe.io.provider.LockerPassFileHandler;
import cleancode.studycafe.tobe.io.provider.SeatPassFileReader;
import cleancode.studycafe.tobe.provider.LockerPassProvider;
import cleancode.studycafe.tobe.provider.SeatPassProvider;

public class StudyCafeApplication {

    public static void main(String[] args) {
        SeatPassProvider seatPassProvider = new SeatPassFileReader();
        LockerPassProvider lockerPassProvider = new LockerPassFileHandler();

        StudyCafePassMachine studyCafePassMachine = new StudyCafePassMachine(
                seatPassProvider, lockerPassProvider
        );

        studyCafePassMachine.run();
    }

}
