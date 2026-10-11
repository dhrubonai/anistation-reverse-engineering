package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class a extends e6.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f2849a;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f2849a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f2849a;
        if (isEmpty) {
            chipTextInputComboView.f2836a.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a10 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f2836a;
        if (TextUtils.isEmpty(a10)) {
            a10 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a10);
    }
}
