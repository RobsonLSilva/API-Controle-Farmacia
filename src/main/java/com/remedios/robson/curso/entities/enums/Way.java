package com.remedios.robson.curso.entities.enums;

public enum Way {
    ORAL(1),
    NASAL(2),
    VENAL(3),
    INTRAMUSCULAR(4),
    RETAL(5);

    private int code;

    Way(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Way valueOf(int code){
        for (Way value : Way.values()){
            if (value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid Way code");
    }
}
