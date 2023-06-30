package com.example.translation;

public class wordModal {
    private String englishword;
    private String kambaword;
    private int image;
    private int audio;

    public wordModal(String englishword, String kambaword, int image, int audio) {
        this.englishword = englishword;
        this.kambaword = kambaword;
        this.image = image;
        this.audio = audio;
    }

    public wordModal() {

    }



    public String getEnglishword() {
        return englishword;
    }

    public void setEnglishword(String englishword) {
        this.englishword = englishword;
    }

    public String getKambaword() {
        return kambaword;
    }

    public void setKambaword(String kambaword) {
        this.kambaword = kambaword;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getAudio() {
        return audio;
    }

    public void setAudio(int audio) {
        this.audio = audio;
    }
}
