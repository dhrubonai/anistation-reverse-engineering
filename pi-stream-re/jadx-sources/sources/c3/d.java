package c3;

import android.graphics.Color;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import f1.o;
import r.f;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2052a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2053b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f2054c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f2055d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2056e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2057f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2058g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2059h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2060i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2061j;

    public d(String str, int i10, Integer num, Integer num2, float f10, boolean z9, boolean z10, boolean z11, boolean z12, int i11) {
        this.f2052a = str;
        this.f2053b = i10;
        this.f2054c = num;
        this.f2055d = num2;
        this.f2056e = f10;
        this.f2057f = z9;
        this.f2058g = z10;
        this.f2059h = z11;
        this.f2060i = z12;
        this.f2061j = i11;
    }

    public static int a(String str) {
        boolean z9;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case zzaja.zze.zzg /* 7 */:
                case 8:
                case 9:
                    z9 = true;
                    break;
                default:
                    z9 = false;
                    break;
            }
            if (z9) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        f.j("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e10) {
            o.g("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static Integer c(String str) {
        long parseLong;
        boolean z9;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z9 = true;
            } else {
                z9 = false;
            }
            w7.b.g(z9);
            return Integer.valueOf(Color.argb(com.bumptech.glide.d.m(((parseLong >> 24) & 255) ^ 255), com.bumptech.glide.d.m(parseLong & 255), com.bumptech.glide.d.m((parseLong >> 8) & 255), com.bumptech.glide.d.m((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            o.g("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}
