package defpackage;

import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class k20 implements wd2 {
    public static final k20 a;
    private static final aj5 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [wd2, k20, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        kq4 kq4Var = new kq4("com.anistation.repository.backup.BackupVideoSettings", obj, 17);
        kq4Var.j("dubEnabled", false);
        kq4Var.j("selectedQuality", false);
        kq4Var.j("autoPlayEnabled", false);
        kq4Var.j("autoNextEnabled", false);
        kq4Var.j("autoSkipEnabled", false);
        kq4Var.j("subtitlesEnabled", false);
        kq4Var.j("subtitleLanguage", false);
        kq4Var.j("server", false);
        kq4Var.j("selectedContentScale", false);
        kq4Var.j("subtitleFontScale", false);
        kq4Var.j("subtitleVerticalPosition", false);
        kq4Var.j("subtitleOutlineWidthDp", false);
        kq4Var.j("subtitleTextColorArgb", false);
        kq4Var.j("subtitleOutlineColorArgb", false);
        kq4Var.j("subtitleFontFamily", false);
        kq4Var.j("audioLanguage", true);
        kq4Var.j("subtitleIsBold", true);
        descriptor = kq4Var;
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        l70 l70Var = l70.a;
        x73 a2 = jb0.a(l70Var);
        mz5 mz5Var = mz5.a;
        x73 a3 = jb0.a(mz5Var);
        x73 a4 = jb0.a(l70Var);
        x73 a5 = jb0.a(l70Var);
        x73 a6 = jb0.a(l70Var);
        x73 a7 = jb0.a(l70Var);
        x73 a8 = jb0.a(mz5Var);
        x73 a9 = jb0.a(mz5Var);
        x73 a10 = jb0.a(mz5Var);
        x73 a11 = jb0.a(mz5Var);
        r42 r42Var = r42.a;
        i13 i13Var = i13.a;
        return new x73[]{a2, a3, a4, a5, a6, a7, a8, a9, a10, r42Var, r42Var, r42Var, i13Var, i13Var, mz5Var, a11, l70Var};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00e5. Please report as an issue. */
    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        Boolean bool;
        String str;
        int i;
        String str2;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        String str3;
        Boolean bool5;
        String str4;
        String str5;
        int i2;
        String str6;
        boolean z;
        int i3;
        float f;
        float f2;
        float f3;
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        int i4 = 10;
        int i5 = 9;
        int i6 = 7;
        int i7 = 6;
        char c2 = 5;
        if (c.decodeSequentially()) {
            l70 l70Var = l70.a;
            Boolean bool6 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 0, l70Var, null);
            mz5 mz5Var = mz5.a;
            String str7 = (String) c.decodeNullableSerializableElement(aj5Var, 1, mz5Var, null);
            Boolean bool7 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 2, l70Var, null);
            Boolean bool8 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 3, l70Var, null);
            Boolean bool9 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 4, l70Var, null);
            Boolean bool10 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 5, l70Var, null);
            String str8 = (String) c.decodeNullableSerializableElement(aj5Var, 6, mz5Var, null);
            String str9 = (String) c.decodeNullableSerializableElement(aj5Var, 7, mz5Var, null);
            String str10 = (String) c.decodeNullableSerializableElement(aj5Var, 8, mz5Var, null);
            float h = c.h(aj5Var, 9);
            float h2 = c.h(aj5Var, 10);
            float h3 = c.h(aj5Var, 11);
            int r = c.r(aj5Var, 12);
            int r2 = c.r(aj5Var, 13);
            String m = c.m(aj5Var, 14);
            bool5 = bool6;
            str2 = (String) c.decodeNullableSerializableElement(aj5Var, 15, mz5Var, null);
            bool = bool7;
            str3 = str7;
            z = c.w(aj5Var, 16);
            i3 = r;
            i = 131071;
            f = h2;
            f2 = h;
            str = str9;
            str4 = str8;
            str5 = str10;
            bool4 = bool8;
            bool3 = bool9;
            f3 = h3;
            str6 = m;
            i2 = r2;
            bool2 = bool10;
        } else {
            String str11 = null;
            int i8 = 16;
            int i9 = 0;
            boolean z2 = false;
            int i10 = 0;
            boolean z3 = true;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            Boolean bool11 = null;
            Boolean bool12 = null;
            Boolean bool13 = null;
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            int i11 = 0;
            Boolean bool14 = null;
            Boolean bool15 = null;
            while (z3) {
                int i12 = c.i(aj5Var);
                switch (i12) {
                    case -1:
                        z3 = false;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        c2 = 5;
                    case 0:
                        bool11 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 0, l70.a, bool11);
                        i11 |= 1;
                        i8 = 16;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        c2 = 5;
                    case 1:
                        i11 |= 2;
                        str16 = (String) c.decodeNullableSerializableElement(aj5Var, 1, mz5.a, str16);
                        i8 = 16;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        c2 = 5;
                    case 2:
                        bool14 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 2, l70.a, bool14);
                        i11 |= 4;
                        i8 = 16;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        c2 = 5;
                    case 3:
                        bool12 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 3, l70.a, bool12);
                        i11 |= 8;
                        i8 = 16;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        c2 = 5;
                    case 4:
                        bool13 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 4, l70.a, bool13);
                        i11 |= 16;
                        i8 = 16;
                        i4 = 10;
                        i5 = 9;
                        c2 = 5;
                    case 5:
                        bool15 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 5, l70.a, bool15);
                        i11 |= 32;
                        c2 = 5;
                        i8 = 16;
                        i4 = 10;
                    case 6:
                        str13 = (String) c.decodeNullableSerializableElement(aj5Var, i7, mz5.a, str13);
                        i11 |= 64;
                        i8 = 16;
                        c2 = 5;
                    case 7:
                        str12 = (String) c.decodeNullableSerializableElement(aj5Var, i6, mz5.a, str12);
                        i11 |= 128;
                        i8 = 16;
                        c2 = 5;
                    case 8:
                        str14 = (String) c.decodeNullableSerializableElement(aj5Var, 8, mz5.a, str14);
                        i11 |= 256;
                        i8 = 16;
                        c2 = 5;
                    case 9:
                        f5 = c.h(aj5Var, i5);
                        i11 |= 512;
                        i8 = 16;
                        c2 = 5;
                    case 10:
                        f4 = c.h(aj5Var, i4);
                        i11 |= 1024;
                        i8 = 16;
                        c2 = 5;
                    case 11:
                        f6 = c.h(aj5Var, 11);
                        i11 |= 2048;
                        i8 = 16;
                        c2 = 5;
                    case 12:
                        i10 = c.r(aj5Var, 12);
                        i11 |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                        i8 = 16;
                        c2 = 5;
                    case 13:
                        i9 = c.r(aj5Var, 13);
                        i11 |= 8192;
                        i8 = 16;
                        c2 = 5;
                    case 14:
                        str15 = c.m(aj5Var, 14);
                        i11 |= 16384;
                        i8 = 16;
                        c2 = 5;
                    case 15:
                        str11 = (String) c.decodeNullableSerializableElement(aj5Var, 15, mz5.a, str11);
                        i11 |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                        i8 = 16;
                        c2 = 5;
                    case 16:
                        z2 = c.w(aj5Var, i8);
                        i11 |= 65536;
                    default:
                        qi2.f(i12);
                        return null;
                }
            }
            bool = bool14;
            str = str12;
            i = i11;
            str2 = str11;
            bool2 = bool15;
            bool3 = bool13;
            bool4 = bool12;
            str3 = str16;
            bool5 = bool11;
            str4 = str13;
            str5 = str14;
            i2 = i9;
            str6 = str15;
            z = z2;
            i3 = i10;
            f = f4;
            f2 = f5;
            f3 = f6;
        }
        c.a(aj5Var);
        return new m20(i, bool5, str3, bool, bool4, bool3, bool2, str4, str, str5, f2, f, f3, i3, i2, str6, str2, z);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        m20 m20Var = (m20) obj;
        m20Var.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        l70 l70Var = l70.a;
        c.encodeNullableSerializableElement(aj5Var, 0, l70Var, m20Var.a);
        mz5 mz5Var = mz5.a;
        c.encodeNullableSerializableElement(aj5Var, 1, mz5Var, m20Var.b);
        c.encodeNullableSerializableElement(aj5Var, 2, l70Var, m20Var.c);
        c.encodeNullableSerializableElement(aj5Var, 3, l70Var, m20Var.d);
        c.encodeNullableSerializableElement(aj5Var, 4, l70Var, m20Var.e);
        c.encodeNullableSerializableElement(aj5Var, 5, l70Var, m20Var.f);
        c.encodeNullableSerializableElement(aj5Var, 6, mz5Var, m20Var.g);
        c.encodeNullableSerializableElement(aj5Var, 7, mz5Var, m20Var.h);
        c.encodeNullableSerializableElement(aj5Var, 8, mz5Var, m20Var.i);
        v0 v0Var = (v0) c;
        v0Var.r(aj5Var, 9, m20Var.j);
        v0Var.r(aj5Var, 10, m20Var.k);
        v0Var.r(aj5Var, 11, m20Var.l);
        v0Var.t(12, m20Var.m, aj5Var);
        v0Var.t(13, m20Var.n, aj5Var);
        v0Var.w(aj5Var, 14, m20Var.o);
        String str = m20Var.p;
        if (str != null) {
            c.encodeNullableSerializableElement(aj5Var, 15, mz5Var, str);
        }
        boolean z = m20Var.q;
        if (!z) {
            v0Var.p(aj5Var, 16, z);
        }
        c.a(aj5Var);
    }
}
