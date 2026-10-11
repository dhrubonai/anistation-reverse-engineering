package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f1119f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1120a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f1121b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1122c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1123d;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f1124e;

    public o0(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f1120a = linkedHashMap;
        this.f1121b = new LinkedHashMap();
        this.f1122c = new LinkedHashMap();
        this.f1123d = new LinkedHashMap();
        this.f1124e = new n0(this, 0);
        linkedHashMap.putAll(hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Bundle a(androidx.lifecycle.o0 r10) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.o0.a(androidx.lifecycle.o0):android.os.Bundle");
    }

    public o0() {
        this.f1120a = new LinkedHashMap();
        this.f1121b = new LinkedHashMap();
        this.f1122c = new LinkedHashMap();
        this.f1123d = new LinkedHashMap();
        this.f1124e = new n0(this, 1);
    }
}
