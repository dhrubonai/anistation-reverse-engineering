package p1;

import android.text.TextUtils;
import c1.r0;
import d2.g0;
import f1.y;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class w implements d2.p {

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f8533i = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f8534j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f8535a;

    /* renamed from: b, reason: collision with root package name */
    public final y f8536b;

    /* renamed from: d, reason: collision with root package name */
    public final y2.k f8538d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8539e;

    /* renamed from: f, reason: collision with root package name */
    public d2.r f8540f;

    /* renamed from: h, reason: collision with root package name */
    public int f8542h;

    /* renamed from: c, reason: collision with root package name */
    public final f1.t f8537c = new f1.t();

    /* renamed from: g, reason: collision with root package name */
    public byte[] f8541g = new byte[1024];

    public w(String str, y yVar, y2.k kVar, boolean z9) {
        this.f8535a = str;
        this.f8536b = yVar;
        this.f8538d = kVar;
        this.f8539e = z9;
    }

    @Override // d2.p
    public final void a() {
    }

    public final g0 b(long j4) {
        g0 i10 = this.f8540f.i(0, 3);
        c1.u k10 = a3.g.k("text/vtt");
        k10.f1900d = this.f8535a;
        k10.f1911p = j4;
        i10.b(new c1.v(k10));
        this.f8540f.b();
        return i10;
    }

    @Override // d2.p
    public final d2.p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        throw new IllegalStateException();
    }

    @Override // d2.p
    public final void f(d2.r rVar) {
        d2.r rVar2;
        if (this.f8539e) {
            rVar2 = new y2.n(rVar, this.f8538d);
        } else {
            rVar2 = rVar;
        }
        this.f8540f = rVar2;
        rVar.s(new d2.u(-9223372036854775807L));
    }

    @Override // d2.p
    public final boolean h(d2.q qVar) {
        qVar.k(this.f8541g, 0, 6, false);
        byte[] bArr = this.f8541g;
        f1.t tVar = this.f8537c;
        tVar.E(bArr, 6);
        if (g3.i.a(tVar)) {
            return true;
        }
        qVar.k(this.f8541g, 6, 3, false);
        tVar.E(this.f8541g, 9);
        return g3.i.a(tVar);
    }

    @Override // d2.p
    public final int i(d2.q qVar, d2.t tVar) {
        String g10;
        int length;
        this.f8540f.getClass();
        int c6 = (int) qVar.c();
        int i10 = this.f8542h;
        byte[] bArr = this.f8541g;
        if (i10 == bArr.length) {
            if (c6 != -1) {
                length = c6;
            } else {
                length = bArr.length;
            }
            this.f8541g = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f8541g;
        int i11 = this.f8542h;
        int p3 = qVar.p(bArr2, i11, bArr2.length - i11);
        if (p3 != -1) {
            int i12 = this.f8542h + p3;
            this.f8542h = i12;
            if (c6 == -1 || i12 != c6) {
                return 0;
            }
        }
        f1.t tVar2 = new f1.t(this.f8541g);
        g3.i.d(tVar2);
        String g11 = tVar2.g();
        long j4 = 0;
        long j10 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(g11)) {
                if (g11.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f8533i.matcher(g11);
                    if (matcher2.find()) {
                        Matcher matcher3 = f8534j.matcher(g11);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j10 = g3.i.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            j4 = (Long.parseLong(group2) * 1000000) / 90000;
                        } else {
                            throw r0.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(g11), null);
                        }
                    } else {
                        throw r0.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(g11), null);
                    }
                }
                g11 = tVar2.g();
            } else {
                while (true) {
                    String g12 = tVar2.g();
                    if (g12 == null) {
                        break;
                    }
                    if (g3.i.f4388a.matcher(g12).matches()) {
                        do {
                            g10 = tVar2.g();
                            if (g10 != null) {
                            }
                        } while (!g10.isEmpty());
                    } else {
                        Matcher matcher4 = g3.h.f4384a.matcher(g12);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    b(0L);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c10 = g3.i.c(group3);
                long b10 = this.f8536b.b(((((j4 + c10) - j10) * 90000) / 1000000) % 8589934592L);
                g0 b11 = b(b10 - c10);
                byte[] bArr3 = this.f8541g;
                int i13 = this.f8542h;
                f1.t tVar3 = this.f8537c;
                tVar3.E(bArr3, i13);
                b11.f(this.f8542h, tVar3);
                b11.d(b10, 1, this.f8542h, 0, null);
                return -1;
            }
        }
    }
}
