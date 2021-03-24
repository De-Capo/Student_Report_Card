package records;

import java.util.ArrayList;

public class Records {
    public ArrayList<RecordInfo> studentList = new ArrayList<>();

    public Records(){
        studentList.add(new RecordInfo("Mahadi", "193-15-13519", 527 ));
        studentList.add(new RecordInfo("Arafat", "193-15-13512", 530 ));
        studentList.add(new RecordInfo("Nayeem", "193-15-13434", 551 ));
        studentList.add(new RecordInfo("Sazidul", "193-15-13475", 534 ));
    }

    public void addRecord(){
        //TODO need to work
    }
}
