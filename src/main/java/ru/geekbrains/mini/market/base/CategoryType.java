package ru.geekbrains.mini.market.base;

import lombok.Getter;

public enum CategoryType {
    FOOD(1, "Food"),
    BOOK(2, "Electronic"), title();

    @Getter
    private final Integer id;
    @Getter
    public final <Stringtitle> Stringtitle

    <Stringtitle> CategoryType(int id, Stringtitle) {
        this.id = id;
        title = title;
    }
}