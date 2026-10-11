package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n41 extends i30 {
    public v41 B;
    public byte[] C;
    public int D;
    public int E;

    @Override // defpackage.q41
    public final void close() {
        if (this.C != null) {
            this.C = null;
            b();
        }
        this.B = null;
    }

    @Override // defpackage.q41
    public final long h(v41 v41Var) {
        byte[] decode;
        c();
        this.B = v41Var;
        Uri uri = v41Var.a;
        long j = v41Var.g;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        io3.p("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = eq6.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str2 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    decode = Base64.decode(str2, 0);
                    this.C = decode;
                } catch (IllegalArgumentException e) {
                    throw new bj4(zo5.l("Error while parsing Base64 encoded string: ", str2), e, true, 0);
                }
            } else {
                decode = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
                this.C = decode;
            }
            long j2 = v41Var.f;
            if (j2 <= decode.length) {
                int i = (int) j2;
                this.D = i;
                int length = decode.length - i;
                this.E = length;
                if (j != -1) {
                    this.E = (int) Math.min(length, j);
                }
                d(v41Var);
                if (j != -1) {
                    return j;
                }
                return this.E;
            }
            this.C = null;
            throw new s41(2008);
        }
        throw new bj4("Unexpected URI format: " + normalizeScheme, null, true, 0);
    }

    @Override // defpackage.m41
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.E;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.C;
        String str = eq6.a;
        System.arraycopy(bArr2, this.D, bArr, i, min);
        this.D += min;
        this.E -= min;
        a(min);
        return min;
    }

    @Override // defpackage.q41
    public final Uri y() {
        v41 v41Var = this.B;
        if (v41Var != null) {
            return v41Var.a;
        }
        return null;
    }
}
