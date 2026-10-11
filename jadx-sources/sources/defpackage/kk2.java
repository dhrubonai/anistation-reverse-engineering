package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class kk2 extends qt0 {
    public final /* synthetic */ byte y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk2(byte b) {
        super((byte) 4);
        this.y = b;
    }

    @Override // defpackage.qt0
    public void E(String str) {
        switch (this.y) {
            case 0:
                str.getClass();
                List list = qq2.a;
                int i = 0;
                int i2 = 0;
                while (i < str.length()) {
                    int i3 = i2 + 1;
                    if (!rq2.a.a(str.charAt(i))) {
                        i++;
                        i2 = i3;
                    } else {
                        StringBuilder n = h11.n("Header name '", str, "' contains illegal character '");
                        n.append(str.charAt(i2));
                        n.append("' (code ");
                        throw new IllegalArgumentException(qx1.o(n, str.charAt(i2) & 255, ')'));
                    }
                }
                return;
            default:
                super.E(str);
                return;
        }
    }

    @Override // defpackage.qt0
    public void F(String str) {
        switch (this.y) {
            case 0:
                str.getClass();
                List list = qq2.a;
                int i = 0;
                int i2 = 0;
                while (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i3 = i2 + 1;
                    if (a34.D(charAt, 32) < 0 && charAt != '\t') {
                        StringBuilder n = h11.n("Header value '", str, "' contains illegal character '");
                        n.append(str.charAt(i2));
                        n.append("' (code ");
                        throw new IllegalArgumentException(qx1.o(n, str.charAt(i2) & 255, ')'));
                    }
                    i++;
                    i2 = i3;
                }
                return;
            default:
                super.F(str);
                return;
        }
    }
}
