package h1;

import android.net.Uri;
import android.util.Base64;
import c1.r0;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: e, reason: collision with root package name */
    public l f4569e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f4570f;

    /* renamed from: g, reason: collision with root package name */
    public int f4571g;

    /* renamed from: h, reason: collision with root package name */
    public int f4572h;

    public f() {
        super(false);
    }

    @Override // h1.h
    public final void close() {
        if (this.f4570f != null) {
            this.f4570f = null;
            s();
        }
        this.f4569e = null;
    }

    @Override // h1.h
    public final Uri j() {
        l lVar = this.f4569e;
        if (lVar != null) {
            return lVar.f4597a;
        }
        return null;
    }

    @Override // h1.h
    public final long m(l lVar) {
        t();
        this.f4569e = lVar;
        Uri normalizeScheme = lVar.f4597a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        w7.b.f("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i10 = f1.b0.f3799a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f4570f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw new r0(r.f.d("Error while parsing Base64 encoded string: ", str), e10, true, 0);
                }
            } else {
                this.f4570f = f1.b0.G(URLDecoder.decode(str, q6.e.f9205a.name()));
            }
            byte[] bArr = this.f4570f;
            long length = bArr.length;
            long j4 = lVar.f4602f;
            if (j4 <= length) {
                int i11 = (int) j4;
                this.f4571g = i11;
                int length2 = bArr.length - i11;
                this.f4572h = length2;
                long j10 = lVar.f4603g;
                if (j10 != -1) {
                    this.f4572h = (int) Math.min(length2, j10);
                }
                u(lVar);
                if (j10 == -1) {
                    return this.f4572h;
                }
                return j10;
            }
            this.f4570f = null;
            throw new i(2008);
        }
        throw new r0("Unexpected URI format: " + normalizeScheme, null, true, 0);
    }

    @Override // c1.l
    public final int p(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f4572h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        byte[] bArr2 = this.f4570f;
        int i13 = f1.b0.f3799a;
        System.arraycopy(bArr2, this.f4571g, bArr, i10, min);
        this.f4571g += min;
        this.f4572h -= min;
        r(min);
        return min;
    }
}
