package w;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f10714a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f10715b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10716c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10717d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10718e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f10719f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f10720g;

    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(java.lang.String r12, android.app.PendingIntent r13) {
        /*
            r11 = this;
            r0 = 2131230870(0x7f080096, float:1.8077805E38)
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.b(r0)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r11.<init>()
            r2 = 1
            r11.f10717d = r2
            r11.f10715b = r0
            int r3 = r0.f789a
            r4 = -1
            if (r3 != r4) goto L77
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r5 = r0.f790b
            java.lang.String r6 = "Unable to get icon type "
            java.lang.String r7 = "IconCompat"
            r8 = 28
            if (r3 < r8) goto L2a
            int r3 = a0.f.c(r5)
            goto L77
        L2a:
            java.lang.Class r3 = r5.getClass()     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L66
            java.lang.String r8 = "getType"
            r9 = 0
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L66
            java.lang.reflect.Method r3 = r3.getMethod(r8, r10)     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L66
            java.lang.Object[] r8 = new java.lang.Object[r9]     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L66
            java.lang.Object r3 = r3.invoke(r5, r8)     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L66
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L66
            int r3 = r3.intValue()     // Catch: java.lang.NoSuchMethodException -> L44 java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L66
            goto L77
        L44:
            r3 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            android.util.Log.e(r7, r5, r3)
            goto L76
        L55:
            r3 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            android.util.Log.e(r7, r5, r3)
            goto L76
        L66:
            r3 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            android.util.Log.e(r7, r5, r3)
        L76:
            r3 = r4
        L77:
            r4 = 2
            if (r3 != r4) goto L80
            int r0 = r0.c()
            r11.f10718e = r0
        L80:
            java.lang.CharSequence r12 = w.s.c(r12)
            r11.f10719f = r12
            r11.f10720g = r13
            r11.f10714a = r1
            r11.f10716c = r2
            r11.f10717d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.q.<init>(java.lang.String, android.app.PendingIntent):void");
    }

    public final IconCompat a() {
        int i10;
        if (this.f10715b == null && (i10 = this.f10718e) != 0) {
            this.f10715b = IconCompat.b(i10);
        }
        return this.f10715b;
    }
}
