package com.happyjie.a04harmonydemo;

import com.happyjie.a04harmonydemo.slice._02NextAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class _02NextAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(_02NextAbilitySlice.class.getName());
    }
}
