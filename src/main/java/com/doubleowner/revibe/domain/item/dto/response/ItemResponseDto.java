package com.doubleowner.revibe.domain.item.dto.response;

import com.doubleowner.revibe.domain.item.entity.Category;
import com.doubleowner.revibe.domain.item.entity.Item;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ItemResponseDto {

    private Long itemId;

    private String name;

    private String description;

    private String category;

    private String image;

    private String brandName;

    private String adminName;

    private Long likeCount;

    public ItemResponseDto(Long itemId, String name, String description, Category category, String image, String brandName, String adminName, Long likeCount) {
        this.itemId = itemId;
        this.name = name;
        this.description = description;
        this.category = category.name();
        this.image = image;
        this.brandName = brandName;
        this.adminName = adminName;
        this.likeCount = likeCount;
    }

    public static ItemResponseDto toDto(Item item) {
        return new ItemResponseDto(
                item.getId(),
                item.getName(),
                item.getDescription(),
                item.getCategory(),
                item.getImage(),
                item.getBrand().getName(),
                item.getUser().getNickname(),
                item.getLikeCount()
        );
    }

}