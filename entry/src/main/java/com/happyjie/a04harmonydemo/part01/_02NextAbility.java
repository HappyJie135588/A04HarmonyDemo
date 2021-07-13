package com.happyjie.a04harmonydemo.part01;

import com.happyjie.a04harmonydemo.part01.slice._02NextAbilitySlice;
import com.happyjie.a04harmonydemo.part01.slice._02NextOtherAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

public class _02NextAbility extends Ability {
    private static final HiLogLabel LABEL = new HiLogLabel(HiLog.LOG_APP, 0x00201, "_02NextAbility");

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        HiLog.info(LABEL, "执行onStart方法------");
        super.setMainRoute(_02NextAbilitySlice.class.getName());
        addActionRoute("action.other", _02NextOtherAbilitySlice.class.getName());
    }

    @Override
    public void onActive() {
        super.onActive();
        HiLog.info(LABEL, "执行onActive方法------");
    }

    @Override
    protected void onInactive() {
        super.onInactive();
        HiLog.info(LABEL, "执行onInactive方法------");
    }

    @Override
    protected void onBackground() {
        super.onBackground();
        HiLog.info(LABEL, "执行onBackground方法------");
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
        HiLog.info(LABEL, "执行onForeground方法------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        HiLog.info(LABEL, "执行onStop方法------");
    }
}
