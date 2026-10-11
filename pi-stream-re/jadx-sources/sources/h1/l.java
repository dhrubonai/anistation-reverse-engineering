package h1;

import android.net.Uri;
import c1.l0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f4596k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f4597a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4598b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4599c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4600d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f4601e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4602f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4603g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4604h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4605i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f4606j;

    static {
        l0.a("media3.datasource");
    }

    public l(Uri uri, long j4, int i10, byte[] bArr, Map map, long j10, long j11, String str, int i11, Object obj) {
        boolean z9;
        boolean z10;
        byte[] bArr2 = bArr;
        boolean z11 = true;
        if (j4 + j10 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7.b.g(z10);
        if (j11 <= 0 && j11 != -1) {
            z11 = false;
        }
        w7.b.g(z11);
        this.f4597a = uri;
        this.f4598b = j4;
        this.f4599c = i10;
        this.f4600d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f4601e = Collections.unmodifiableMap(new HashMap(map));
        this.f4602f = j10;
        this.f4603g = j11;
        this.f4604h = str;
        this.f4605i = i11;
        this.f4606j = obj;
    }

    public final l a(long j4) {
        long j10 = this.f4603g;
        long j11 = -1;
        if (j10 != -1) {
            j11 = j10 - j4;
        }
        long j12 = j11;
        if (j4 == 0 && j10 == j12) {
            return this;
        }
        return new l(this.f4597a, this.f4598b, this.f4599c, this.f4600d, this.f4601e, this.f4602f + j4, j12, this.f4604h, this.f4605i, this.f4606j);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i10 = this.f4599c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    str = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str = "POST";
            }
        } else {
            str = "GET";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f4597a);
        sb.append(", ");
        sb.append(this.f4602f);
        sb.append(", ");
        sb.append(this.f4603g);
        sb.append(", ");
        sb.append(this.f4604h);
        sb.append(", ");
        sb.append(this.f4605i);
        sb.append("]");
        return sb.toString();
    }
}
