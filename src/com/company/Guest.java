package com.company;

public class Guest {

    private String guest, national, birth_date;
    private int how_old;

    public Guest() {
    }

    public String getGuest() {
        return guest;
    }

    public String getNational() {
        return national;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public int getHow_old() {
        return how_old;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public void setHow_old(int how_old) {
        this.how_old = how_old;
    }

    @Override
    public String toString() {
        return "Guest Name: " + guest + '\n' +
                "Nationality: " + national + '\n' +
                "Date of Birth: " + birth_date + '\n' +
                "Age: " + how_old;

    }
}
