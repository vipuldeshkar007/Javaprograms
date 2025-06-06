package Stream.Student;

import java.util.Objects;

class Student {

    private int studId;
    private String deptId;
    private String studentName;

    public Student(int studId, String deptId, String studentName) {
        this.studId = studId;
        this.deptId = deptId;
        this.studentName = studentName;
    }


    public String getDeptId() {
        return deptId;
    }

    @Override
    public String toString() {
        return "stud_id:" + studId + ", deptId:" + deptId + ", studentName:" + studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student std)) return false;
        return Objects.equals(this.studentName, std.studentName) &&
                Objects.equals(this.studId, std.studId) &&
                Objects.equals(this.deptId, std.deptId);
    }
}
