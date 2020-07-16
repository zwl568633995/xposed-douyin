package com.evan.dy.api.model;

import com.evan.dy.api.model.dy.DyGiftPage;

import java.util.ArrayList;
import java.util.List;

public class GiftPage {
    private List<Object> obj;
    private List<DyGiftPage> giftPages;
    private List<DyGiftPage.DyGift> gifts;

    public GiftPage(List<Object> obj) {
        this.obj = obj;
    }

    public List<DyGiftPage> getGiftPage() {
        if (giftPages == null) {
            if (obj != null) {
                giftPages = new ArrayList<>();
                for (Object o : obj) {
                    DyGiftPage giftPage = new DyGiftPage().parseFrom(o);
                    giftPages.add(giftPage);
                }
            }
        }
        return giftPages;
    }

    public List<DyGiftPage.DyGift> getGifts() {
        List<DyGiftPage> giftPage = getGiftPage();
        if (giftPage != null && giftPage.size() > 0) {
            gifts = new ArrayList<>();
            for (DyGiftPage dyGiftPage : giftPage) {
                if (dyGiftPage != null && dyGiftPage.gifts != null && dyGiftPage.gifts.size() > 0) {
                    for (Object gift : dyGiftPage.gifts) {
                        DyGiftPage.DyGift dyGift = new DyGiftPage.DyGift().parseFrom(gift);
                        gifts.add(dyGift);
                    }
                }
            }
        }
        return gifts;
    }
}
