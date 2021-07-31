package com.vanshajgirotra;


import lombok.Getter;

public class Greeter {
    @Getter
    private final long id;
    @Getter
    private final String content;
    public Greeter(long id, String content) {
        this.content = content;
        this.id = id;
    }
}
