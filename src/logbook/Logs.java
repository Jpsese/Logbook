/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logbook;

/**
 *
 * @author mico
 */
public class Logs {

    private int logid;
    private String violation;

    private int id;
    private String studentname;
    private String date;
    private String time_in;
    private String time_out;

    public Logs(int logid, int id, String studentname, String date, String time_in, String time_out, String violation) {
        this.logid = logid;
        this.id = id;
        this.studentname = studentname;
        this.date = date;
        this.time_in = time_in;
        this.time_out = time_out;
        this.violation = violation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime_in() {
        return time_in;
    }

    public void setTime_in(String time_in) {
        this.time_in = time_in;
    }

    public String getTime_out() {
        return time_out;
    }

    public void setTime_out(String time_out) {
        this.time_out = time_out;
    }

    public int getLogid() {
        return logid;
    }

    public void setLogid(int logid) {
        this.logid = logid;
    }

    public String getViolation() {
        return violation;
    }

    public void setViolation(String violation) {
        this.violation = violation;
    }
}
