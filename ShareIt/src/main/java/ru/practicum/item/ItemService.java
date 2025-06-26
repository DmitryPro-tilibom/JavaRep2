package ru.practicum.item;

import java.util.List;

public interface ItemService {
    List<Item> findUserById(long userId);
    Item save(Item item);
    void deleteByUserIdAndItemId(long userId, long itemId);
}
