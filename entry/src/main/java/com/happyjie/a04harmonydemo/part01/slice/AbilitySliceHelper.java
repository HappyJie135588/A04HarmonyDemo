package com.happyjie.a04harmonydemo.part01.slice;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;

public class AbilitySliceHelper {

    public void startAbility(AbilitySlice abilitySlice, String abilityName) {
        Intent intent = new Intent();
        Operation operation = new Intent.OperationBuilder()
                .withBundleName("com.happyjie.a04harmonydemo")
                .withAbilityName(abilityName)
                .build();
        intent.setOperation(operation);
        abilitySlice.startAbility(intent);
    }
}
