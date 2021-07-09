package com.happyjie.a04harmonydemo;

import com.happyjie.a04harmonydemo.slice._01LifecycleAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;

public class _01LifecycleAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(_01LifecycleAbilitySlice.class.getName());
    }
}
