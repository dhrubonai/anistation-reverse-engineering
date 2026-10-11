package defpackage;

import android.text.TextUtils;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k47 implements b12 {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final tf6 b;
    public final w16 d;
    public final boolean e;
    public d12 f;
    public int h;
    public final zi4 c = new zi4();
    public byte[] g = new byte[1024];

    public k47(String str, tf6 tf6Var, w16 w16Var, boolean z) {
        this.a = str;
        this.b = tf6Var;
        this.d = w16Var;
        this.e = z;
    }

    @Override // defpackage.b12
    public final int a(c12 c12Var, d42 d42Var) {
        String n;
        int length;
        this.f.getClass();
        int p = (int) c12Var.p();
        int i2 = this.h;
        byte[] bArr = this.g;
        if (i2 == bArr.length) {
            if (p != -1) {
                length = p;
            } else {
                length = bArr.length;
            }
            bArr = Arrays.copyOf(bArr, (length * 3) / 2);
            this.g = bArr;
        }
        int i3 = this.h;
        int read = c12Var.read(bArr, i3, bArr.length - i3);
        if (read != -1) {
            int i4 = this.h + read;
            this.h = i4;
            if (p == -1 || i4 != p) {
                return 0;
            }
        }
        zi4 zi4Var = new zi4(this.g);
        l47.d(zi4Var);
        String n2 = zi4Var.n(StandardCharsets.UTF_8);
        long j2 = 0;
        long j3 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(n2)) {
                if (n2.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = i.matcher(n2);
                    if (matcher2.find()) {
                        Matcher matcher3 = j.matcher(n2);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j3 = l47.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            long parseLong = Long.parseLong(group2);
                            String str = eq6.a;
                            j2 = eq6.e0(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
                        } else {
                            throw bj4.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(n2), null);
                        }
                    } else {
                        throw bj4.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(n2), null);
                    }
                }
                n2 = zi4Var.n(StandardCharsets.UTF_8);
            } else {
                while (true) {
                    String n3 = zi4Var.n(StandardCharsets.UTF_8);
                    if (n3 == null) {
                        break;
                    }
                    if (l47.a.matcher(n3).matches()) {
                        do {
                            n = zi4Var.n(StandardCharsets.UTF_8);
                            if (n != null) {
                            }
                        } while (!n.isEmpty());
                    } else {
                        Matcher matcher4 = j47.a.matcher(n3);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    f(0L);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c = l47.c(group3);
                String str2 = eq6.a;
                long b = this.b.b(eq6.e0((j2 + c) - j3, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                bh6 f = f(b - c);
                byte[] bArr2 = this.g;
                int i5 = this.h;
                zi4 zi4Var2 = this.c;
                zi4Var2.L(i5, bArr2);
                f.e(this.h, zi4Var2);
                f.a(b, 1, this.h, 0, null);
                return -1;
            }
        }
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        p81 p81Var = (p81) c12Var;
        p81Var.j(this.g, 0, 6, false);
        byte[] bArr = this.g;
        zi4 zi4Var = this.c;
        zi4Var.L(6, bArr);
        if (l47.a(zi4Var)) {
            return true;
        }
        p81Var.j(this.g, 6, 3, false);
        zi4Var.L(9, this.g);
        return l47.a(zi4Var);
    }

    @Override // defpackage.b12
    public final void c(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        if (this.e) {
            d12Var = new tu(d12Var, this.d);
        }
        this.f = d12Var;
        d12Var.I(new zy(-9223372036854775807L));
    }

    public final bh6 f(long j2) {
        bh6 G = this.f.G(0, 3);
        da2 da2Var = new da2();
        da2Var.o = qy3.n("text/vtt");
        da2Var.d = this.a;
        da2Var.t = j2;
        zo5.q(da2Var, G);
        this.f.t();
        return G;
    }

    @Override // defpackage.b12
    public final void release() {
    }
}
