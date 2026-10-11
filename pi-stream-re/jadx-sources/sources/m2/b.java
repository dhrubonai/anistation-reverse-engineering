package m2;

import c1.p0;
import f1.s;
import f1.t;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import q6.e;
import r6.h0;

/* loaded from: classes.dex */
public final class b extends h0 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7145g;

    public /* synthetic */ b(int i10) {
        this.f7145g = i10;
    }

    public static n2.a g1(t tVar) {
        String p3 = tVar.p();
        p3.getClass();
        String p9 = tVar.p();
        p9.getClass();
        return new n2.a(p3, p9, tVar.o(), tVar.o(), Arrays.copyOfRange(tVar.f3858a, tVar.f3859b, tVar.f3860c));
    }

    @Override // r6.h0
    public final p0 H(l2.a aVar, ByteBuffer byteBuffer) {
        switch (this.f7145g) {
            case 0:
                if (byteBuffer.get() == 116) {
                    s sVar = new s(byteBuffer.array(), byteBuffer.limit());
                    int i10 = 12;
                    sVar.r(12);
                    int f10 = (sVar.f() + sVar.i(12)) - 4;
                    sVar.r(44);
                    sVar.s(sVar.i(12));
                    sVar.r(16);
                    ArrayList arrayList = new ArrayList();
                    while (sVar.f() < f10) {
                        sVar.r(48);
                        int i11 = sVar.i(8);
                        sVar.r(4);
                        int f11 = sVar.f() + sVar.i(i10);
                        String str = null;
                        String str2 = null;
                        while (sVar.f() < f11) {
                            int i12 = sVar.i(8);
                            int i13 = sVar.i(8);
                            int f12 = sVar.f() + i13;
                            if (i12 == 2) {
                                int i14 = sVar.i(16);
                                sVar.r(8);
                                if (i14 == 3) {
                                    while (sVar.f() < f12) {
                                        int i15 = sVar.i(8);
                                        Charset charset = e.f9205a;
                                        byte[] bArr = new byte[i15];
                                        sVar.k(bArr, i15);
                                        String str3 = new String(bArr, charset);
                                        int i16 = sVar.i(8);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            sVar.s(sVar.i(8));
                                        }
                                        str = str3;
                                    }
                                }
                            } else if (i12 == 21) {
                                Charset charset2 = e.f9205a;
                                byte[] bArr2 = new byte[i13];
                                sVar.k(bArr2, i13);
                                str2 = new String(bArr2, charset2);
                            }
                            sVar.o(f12 * 8);
                        }
                        sVar.o(f11 * 8);
                        if (str != null && str2 != null) {
                            arrayList.add(new a(i11, str.concat(str2)));
                        }
                        i10 = 12;
                    }
                    if (!arrayList.isEmpty()) {
                        return new p0(arrayList);
                    }
                }
                return null;
            default:
                return new p0(g1(new t(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
