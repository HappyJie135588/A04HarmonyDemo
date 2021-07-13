package com.happyjie.a04harmonydemo.part01.slice;

import com.happyjie.a04harmonydemo.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

public class _01LifecycleAbilitySlice extends AbilitySlice {
    private static final HiLogLabel LABEL = new HiLogLabel(HiLog.LOG_APP, 0x00201, "_01LifecycleAbilitySlice");

    private Text tv_result;

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        HiLog.info(LABEL, "执行onStart方法------");
        super.setUIContent(ResourceTable.Layout_ability__01_lifecycle);

        Button btn_toslice = (Button) findComponentById(ResourceTable.Id_btn_toslice);
        btn_toslice.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                present(new _01NextLifecycleAbilitySlice(), new Intent());
            }
        });

        Button btn_topage = (Button) findComponentById(ResourceTable.Id_btn_topage);
        btn_topage.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                new AbilitySliceHelper().startAbility(_01LifecycleAbilitySlice.this, ".part01._02NextAbility");
            }
        });

        Button btn_pass_value = (Button) findComponentById(ResourceTable.Id_btn_pass_value);
        btn_pass_value.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent = new Intent();
                intent.setParam("id", 17);
                intent.setParam("name", "张三");
                present(new _01PassByValueAbilitySlice(), intent);
            }
        });

        Button btn_pass_return_value = (Button) findComponentById(ResourceTable.Id_btn_pass_return_value);
        tv_result = (Text) findComponentById(ResourceTable.Id_tv_result);
        btn_pass_return_value.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent = new Intent();
                intent.setParam("id", 27);
                intent.setParam("name", "李四的密码");
                presentForResult(new _01PassByValueAbilitySlice(), intent, 123);
            }
        });

        Button btn_to_other_slice = (Button) findComponentById(ResourceTable.Id_btn_to_other_slice);
        btn_to_other_slice.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent = new Intent();
                Operation operation = new Intent.OperationBuilder()
                        .withAction("action.other")
                        .build();
                intent.setOperation(operation);
                startAbility(intent);
            }
        });
    }

    @Override
    protected void onResult(int requestCode, Intent resultIntent) {
        super.onResult(requestCode, resultIntent);
        HiLog.info(LABEL, "执行onResult方法------");
        if (requestCode == 123 && resultIntent != null) {
            String pwd = resultIntent.getStringParam("pwd");
            tv_result.setText("返回的值：" + pwd);
        }
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
