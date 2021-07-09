package com.happyjie.a04harmonydemo.part01.slice;

import com.happyjie.a04harmonydemo.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;

public class _01PassByValueAbilitySlice extends AbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability__01_pass_by_value);
        Text tv_value = (Text) findComponentById(ResourceTable.Id_tv_value);
        if (intent != null) {
            int id = intent.getIntParam("id", 0);
            String name = intent.getStringParam("name");
            tv_value.setText("学号：" + id + ",name:" + name);
        }
        Button btn_back = (Button) findComponentById(ResourceTable.Id_btn_back);
        btn_back.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent resultIntent = new Intent();
                resultIntent.setParam("pwd", "123456");
                setResult(resultIntent);
                terminate();
            }
        });
    }

    @Override
    protected void onBackPressed() {
        Intent resultIntent = new Intent();
        resultIntent.setParam("pwd", "0");
        setResult(resultIntent);
        super.onBackPressed();
    }
}
