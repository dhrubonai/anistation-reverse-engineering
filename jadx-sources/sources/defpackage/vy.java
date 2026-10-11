package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vy {
    public int a;
    public int b;
    public int c;
    public int d;
    public String e;

    public vy(int i, String str, int i2, int i3, int i4) {
        this.a = i;
        this.e = str;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static String a(int i, int i2, int i3, boolean z) {
        String str;
        StringBuilder s = qx1.s(i, "av01.", ".");
        Object[] objArr = {Integer.valueOf(i2)};
        String str2 = eq6.a;
        Locale locale = Locale.US;
        s.append(String.format(locale, "%02d", objArr));
        if (z) {
            str = "H";
        } else {
            str = "M";
        }
        s.append(str);
        s.append(".");
        s.append(String.format(locale, "%02d", Integer.valueOf(i3)));
        return s.toString();
    }

    public static vy b(byte[] bArr) {
        int i;
        int g;
        int g2;
        int i2;
        int i3;
        try {
            yi0 yi0Var = new yi0(bArr.length, bArr);
            yi0Var.n();
            int g3 = yi0Var.g(7);
            if (g3 != 1) {
                kb0.O("Av1Config", "Unsupported av1C version: " + g3);
                return null;
            }
            int g4 = yi0Var.g(3);
            int g5 = yi0Var.g(5);
            boolean f = yi0Var.f();
            boolean f2 = yi0Var.f();
            boolean f3 = yi0Var.f();
            if (f2) {
                if (f3) {
                    i3 = 12;
                } else {
                    i3 = 10;
                }
                i = i3;
            } else {
                i = 8;
            }
            yi0Var.o(13);
            String a = a(g4, g5, i, f);
            if (yi0Var.b() <= 0) {
                return new vy(i, a);
            }
            yi0Var.n();
            int g6 = yi0Var.g(4);
            if (g6 != 1) {
                kb0.B("Av1Config", "Unsupported obu_type: " + g6);
                return new vy(i, a);
            }
            if (yi0Var.f()) {
                kb0.B("Av1Config", "Unsupported obu_extension_flag");
                return new vy(i, a);
            }
            boolean f4 = yi0Var.f();
            yi0Var.n();
            if (f4 && yi0Var.g(8) > 127) {
                kb0.B("Av1Config", "Excessive obu_size");
                return new vy(i, a);
            }
            int g7 = yi0Var.g(3);
            yi0Var.n();
            if (yi0Var.f()) {
                kb0.B("Av1Config", "Unsupported reduced_still_picture_header");
                return new vy(i, a);
            }
            if (yi0Var.f()) {
                kb0.B("Av1Config", "Unsupported timing_info_present_flag");
                return new vy(i, a);
            }
            if (yi0Var.f()) {
                kb0.B("Av1Config", "Unsupported initial_display_delay_present_flag");
                return new vy(i, a);
            }
            int g8 = yi0Var.g(5);
            boolean z = false;
            for (int i4 = 0; i4 <= g8; i4++) {
                yi0Var.o(12);
                if (yi0Var.g(5) > 7) {
                    yi0Var.n();
                }
            }
            int g9 = yi0Var.g(4);
            int g10 = yi0Var.g(4);
            yi0Var.o(g9 + 1);
            yi0Var.o(g10 + 1);
            if (yi0Var.f()) {
                yi0Var.o(7);
            }
            yi0Var.o(7);
            boolean f5 = yi0Var.f();
            if (f5) {
                yi0Var.o(2);
            }
            if (yi0Var.f()) {
                g = 2;
            } else {
                g = yi0Var.g(1);
            }
            if (g > 0 && !yi0Var.f()) {
                yi0Var.o(1);
            }
            if (f5) {
                yi0Var.o(3);
            }
            yi0Var.o(3);
            boolean f6 = yi0Var.f();
            if (g7 == 2 && f6) {
                yi0Var.n();
            }
            if (g7 != 1 && yi0Var.f()) {
                z = true;
            }
            if (!yi0Var.f()) {
                return new vy(i, a);
            }
            int g11 = yi0Var.g(8);
            int g12 = yi0Var.g(8);
            int g13 = yi0Var.g(8);
            if (!z && g11 == 1 && g12 == 13 && g13 == 0) {
                g2 = 1;
            } else {
                g2 = yi0Var.g(1);
            }
            int i5 = hp0.i(g11);
            if (g2 == 1) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            return new vy(i, a, i5, i2, hp0.j(g12));
        } catch (RuntimeException e) {
            throw bj4.a("Error parsing AV1 config", e);
        }
    }

    public vy(int i, String str) {
        this(i, str, -1, -1, -1);
    }
}
