package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kq extends wc7 {
    public final /* synthetic */ byte i;

    public /* synthetic */ kq(byte b) {
        this.i = b;
    }

    public static tw1 Y(zi4 zi4Var) {
        String v = zi4Var.v();
        v.getClass();
        String v2 = zi4Var.v();
        v2.getClass();
        return new tw1(v, v2, zi4Var.u(), zi4Var.u(), Arrays.copyOfRange(zi4Var.a, zi4Var.b, zi4Var.c));
    }

    @Override // defpackage.wc7
    public final fy3 n(hy3 hy3Var, ByteBuffer byteBuffer) {
        switch (this.i) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                yi0 yi0Var = new yi0(byteBuffer.limit(), byteBuffer.array());
                yi0Var.o(12);
                int d = (yi0Var.d() + yi0Var.g(12)) - 4;
                yi0Var.o(44);
                yi0Var.p(yi0Var.g(12));
                yi0Var.o(16);
                ArrayList arrayList = new ArrayList();
                while (yi0Var.d() < d) {
                    yi0Var.o(48);
                    int g = yi0Var.g(8);
                    yi0Var.o(4);
                    int d2 = yi0Var.d() + yi0Var.g(12);
                    String str = null;
                    String str2 = null;
                    while (yi0Var.d() < d2) {
                        int g2 = yi0Var.g(8);
                        int g3 = yi0Var.g(8);
                        int d3 = yi0Var.d() + g3;
                        if (g2 == 2) {
                            int g4 = yi0Var.g(16);
                            yi0Var.o(8);
                            if (g4 == 3) {
                                while (yi0Var.d() < d3) {
                                    int g5 = yi0Var.g(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[g5];
                                    yi0Var.j(g5, bArr);
                                    String str3 = new String(bArr, charset);
                                    int g6 = yi0Var.g(8);
                                    for (int i = 0; i < g6; i++) {
                                        yi0Var.p(yi0Var.g(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (g2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[g3];
                            yi0Var.j(g3, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        yi0Var.m(d3 * 8);
                    }
                    yi0Var.m(d2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new jq(g, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new fy3(arrayList);
            default:
                return new fy3(Y(new zi4(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
