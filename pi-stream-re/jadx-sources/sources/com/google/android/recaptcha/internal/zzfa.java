package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import r6.h0;
import w6.b;

/* loaded from: classes.dex */
public final class zzfa {
    public static final zzfa zza = new zzfa();

    private zzfa() {
    }

    public static final Map zza() {
        b[] bVarArr = {new b(-4, zzl.zzz), new b(-12, zzl.zzA), new b(-6, zzl.zzv), new b(-11, zzl.zzx), new b(-13, zzl.zzB), new b(-14, zzl.zzC), new b(-2, zzl.zzw), new b(-7, zzl.zzD), new b(-5, zzl.zzE), new b(-9, zzl.zzF), new b(-8, zzl.zzP), new b(-15, zzl.zzy), new b(-1, zzl.zzG), new b(-3, zzl.zzI), new b(-10, zzl.zzJ)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(h0.m0(15));
        for (int i10 = 0; i10 < 15; i10++) {
            b bVar = bVarArr[i10];
            linkedHashMap.put(bVar.f11012a, bVar.f11013b);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            linkedHashMap.put(-16, zzl.zzH);
        }
        if (i11 >= 27) {
            linkedHashMap.put(1, zzl.zzL);
            linkedHashMap.put(2, zzl.zzM);
            linkedHashMap.put(0, zzl.zzN);
            linkedHashMap.put(3, zzl.zzO);
        }
        if (i11 >= 29) {
            linkedHashMap.put(4, zzl.zzK);
        }
        return linkedHashMap;
    }
}
