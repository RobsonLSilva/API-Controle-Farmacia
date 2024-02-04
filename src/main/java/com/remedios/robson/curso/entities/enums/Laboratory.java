package com.remedios.robson.curso.entities.enums;

public enum Laboratory {
    MEDLEY(1),
    ACHE(2);

    private int code;

    Laboratory(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Laboratory valueOf(int code){
        for (Laboratory value : Laboratory.values()){
            if (value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid Laboratory code");
    }
}
