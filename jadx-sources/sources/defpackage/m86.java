package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class m86 extends xg4 {
    public final String a;
    public final jz0 b;
    public final byte[] c;

    public m86(String str, jz0 jz0Var) {
        str.getClass();
        jz0Var.getClass();
        this.a = str;
        this.b = jz0Var;
        Charset a = mz0.a(jz0Var);
        this.c = et5.l(str, a == null ? kl0.a : a);
    }

    @Override // defpackage.yg4
    public final Long a() {
        return Long.valueOf(this.c.length);
    }

    @Override // defpackage.yg4
    public final jz0 b() {
        return this.b;
    }

    @Override // defpackage.xg4
    public final byte[] d() {
        return this.c;
    }

    public final String toString() {
        return "TextContent[" + this.b + "] \"" + uz5.u0(30, this.a) + '\"';
    }
}
