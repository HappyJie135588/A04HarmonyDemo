package com.happyjie.a04harmonydemo.part01.slice;

import com.happyjie.a04harmonydemo.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

public class _02NextOtherAbilitySlice extends AbilitySlice {
    private static final HiLogLabel LABEL = new HiLogLabel(HiLog.LOG_APP, 0x00201, "_02NextAbilitySlice");

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        HiLog.info(LABEL, "执行onStart方法------");
        super.setUIContent(ResourceTable.Layout_ability__02_next_other);
    }

}
