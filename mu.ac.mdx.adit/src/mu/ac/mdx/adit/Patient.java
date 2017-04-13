/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mu.ac.mdx.adit;

/**
 *
 * @author Adit Santokhee
 */
public class Patient {
    private int patientNumber;
    private String patientName;
    private int patientAge;
    private String patientIllness;

    public Patient(int patientNumber, String patientName, int patientAge, String patientIllness) {
        this.patientNumber = patientNumber;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientIllness = patientIllness;
    }

    public int getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(int patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientIllness() {
        return patientIllness;
    }

    public void setPatientIllness(String patientIllness) {
        this.patientIllness = patientIllness;
    }

    @Override
    public String toString() {
        return patientNumber + "," + patientName + "," + patientAge +  "," + patientIllness + ".";
    }
    
    
}
