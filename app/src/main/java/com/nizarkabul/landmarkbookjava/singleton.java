package com.nizarkabul.landmarkbookjava;

public class singleton {

    private Landmark sentLandmark;
    private static singleton Singleton;
    private singleton(){

    }

    public Landmark getSentLandmark(){
        return sentLandmark;
    }
    public void setSentLandmark(Landmark setLandmark){
        this.sentLandmark=setLandmark;
    }

    public static singleton getInstance() {
        if (Singleton == null) {
            Singleton = new singleton();
        }
      return Singleton;

    }

}
