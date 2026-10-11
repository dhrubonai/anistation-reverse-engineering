package defpackage;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ru {
    public static final ru i = new ru(0, 0, 1, 1, 0, false, true);
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public AudioAttributes h;

    static {
        String str = eq6.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
    }

    public ru(int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = z;
        this.g = z2;
    }

    public static ru a(Bundle bundle) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str = j;
        boolean z = false;
        if (bundle.containsKey(str)) {
            i2 = bundle.getInt(str);
        } else {
            i2 = 0;
        }
        String str2 = k;
        if (bundle.containsKey(str2)) {
            i3 = bundle.getInt(str2);
        } else {
            i3 = 0;
        }
        String str3 = l;
        boolean z2 = true;
        if (bundle.containsKey(str3)) {
            i4 = bundle.getInt(str3);
        } else {
            i4 = 1;
        }
        String str4 = m;
        if (bundle.containsKey(str4)) {
            i5 = bundle.getInt(str4);
        } else {
            i5 = 1;
        }
        String str5 = n;
        if (bundle.containsKey(str5)) {
            i6 = bundle.getInt(str5);
        } else {
            i6 = 0;
        }
        String str6 = o;
        if (bundle.containsKey(str6)) {
            z = bundle.getBoolean(str6);
        }
        boolean z3 = z;
        String str7 = p;
        if (bundle.containsKey(str7)) {
            z2 = bundle.getBoolean(str7);
        }
        return new ru(i2, i3, i4, i5, i6, z3, z2);
    }

    public final AudioAttributes b() {
        AudioAttributes audioAttributes = this.h;
        if (audioAttributes == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
            usage.setAllowedCapturePolicy(this.d);
            usage.setHapticChannelsMuted(this.g);
            if (Build.VERSION.SDK_INT >= 32) {
                z3.e(usage, this.e);
                z3.f(usage, this.f);
            }
            AudioAttributes build = usage.build();
            this.h = build;
            return build;
        }
        return audioAttributes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ru.class == obj.getClass()) {
            ru ruVar = (ru) obj;
            if (this.a == ruVar.a && this.b == ruVar.b && this.c == ruVar.c && this.d == ruVar.d && this.e == ruVar.e && this.f == ruVar.f && this.g == ruVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
