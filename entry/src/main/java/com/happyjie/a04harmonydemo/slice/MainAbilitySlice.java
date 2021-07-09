package com.happyjie.a04harmonydemo.slice;

import com.happyjie.a04harmonydemo.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;
import ohos.agp.components.Component;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
    }

    @Override
    public void onActive() {
        super.onActive();
        Button btn_lifecycle = (Button) findComponentById(ResourceTable.Id_btn_lifecycle);
        btn_lifecycle.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                startAbility("._01LifecycleAbility");
            }
        });
    }

    private void startAbility(String abilityName) {
        Intent intent = new Intent();
        Operation operation = new Intent.OperationBuilder()
                .withBundleName("com.happyjie.a04harmonydemo")
                .withAbilityName(abilityName)
                .build();
        intent.setOperation(operation);
        startAbility(intent);
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
