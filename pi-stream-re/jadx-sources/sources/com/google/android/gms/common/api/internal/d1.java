package com.google.android.gms.common.api.internal;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes.dex */
public final class d1 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2394a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f2394a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return 0L;
            case 2:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(z8.b.f12137e);
                return simpleDateFormat;
        }
    }
}
