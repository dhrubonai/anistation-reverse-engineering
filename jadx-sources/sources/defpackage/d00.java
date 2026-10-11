package defpackage;

import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class d00 implements wd2 {
    public static final d00 a;
    private static final aj5 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [wd2, d00, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        kq4 kq4Var = new kq4("com.anistation.repository.backup.BackupAnimeListItem", obj, 16);
        kq4Var.j("anistationId", true);
        kq4Var.j("anilistId", false);
        kq4Var.j("malId", false);
        kq4Var.j("title", false);
        kq4Var.j("coverImage", false);
        kq4Var.j("bannerImage", false);
        kq4Var.j("totalEpisodes", false);
        kq4Var.j("currentAiredEpisodes", false);
        kq4Var.j("mediaStatus", false);
        kq4Var.j("watchStatus", false);
        kq4Var.j("importedProgress", false);
        kq4Var.j("score", false);
        kq4Var.j("format", false);
        kq4Var.j("notes", false);
        kq4Var.j("createdAt", false);
        kq4Var.j("updatedAt", false);
        descriptor = kq4Var;
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        mz5 mz5Var = mz5.a;
        x73 a2 = jb0.a(mz5Var);
        i13 i13Var = i13.a;
        x73 a3 = jb0.a(i13Var);
        x73 a4 = jb0.a(mz5Var);
        x73 a5 = jb0.a(mz5Var);
        x73 a6 = jb0.a(i13Var);
        x73 a7 = jb0.a(mz5Var);
        x73 a8 = jb0.a(mz5Var);
        x73 a9 = jb0.a(mz5Var);
        ql3 ql3Var = ql3.a;
        return new x73[]{a2, i13Var, a3, mz5Var, a4, a5, a6, i13Var, a7, mz5Var, i13Var, i13Var, a8, a9, ql3Var, ql3Var};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00d2. Please report as an issue. */
    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        Integer num;
        String str;
        Integer num2;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        int i3;
        String str7;
        int i4;
        String str8;
        int i5;
        long j;
        long j2;
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        int i6 = 10;
        int i7 = 9;
        int i8 = 7;
        char c2 = 5;
        if (c.decodeSequentially()) {
            mz5 mz5Var = mz5.a;
            String str9 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5Var, null);
            int r = c.r(aj5Var, 1);
            i13 i13Var = i13.a;
            Integer num3 = (Integer) c.decodeNullableSerializableElement(aj5Var, 2, i13Var, null);
            String m = c.m(aj5Var, 3);
            String str10 = (String) c.decodeNullableSerializableElement(aj5Var, 4, mz5Var, null);
            String str11 = (String) c.decodeNullableSerializableElement(aj5Var, 5, mz5Var, null);
            Integer num4 = (Integer) c.decodeNullableSerializableElement(aj5Var, 6, i13Var, null);
            int r2 = c.r(aj5Var, 7);
            String str12 = (String) c.decodeNullableSerializableElement(aj5Var, 8, mz5Var, null);
            String m2 = c.m(aj5Var, 9);
            int r3 = c.r(aj5Var, 10);
            int r4 = c.r(aj5Var, 11);
            String str13 = (String) c.decodeNullableSerializableElement(aj5Var, 12, mz5Var, null);
            str2 = (String) c.decodeNullableSerializableElement(aj5Var, 13, mz5Var, null);
            i = 65535;
            i2 = r;
            str4 = str9;
            num = num4;
            i3 = r3;
            str7 = m2;
            i4 = r2;
            str5 = str12;
            str6 = str11;
            str8 = m;
            i5 = r4;
            str3 = str10;
            str = str13;
            num2 = num3;
            j = c.B(aj5Var, 14);
            j2 = c.B(aj5Var, 15);
        } else {
            int i9 = 15;
            boolean z = true;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            Integer num5 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            long j3 = 0;
            long j4 = 0;
            int i14 = 0;
            Integer num6 = null;
            while (z) {
                int i15 = c.i(aj5Var);
                switch (i15) {
                    case -1:
                        z = false;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c2 = 5;
                    case 0:
                        str18 = (String) c.decodeNullableSerializableElement(aj5Var, 0, mz5.a, str18);
                        i14 |= 1;
                        i9 = 15;
                        i6 = 10;
                        i7 = 9;
                        i8 = 7;
                        c2 = 5;
                    case 1:
                        i10 = c.r(aj5Var, 1);
                        i14 |= 2;
                        i9 = 15;
                        i6 = 10;
                        i7 = 9;
                        c2 = 5;
                    case 2:
                        num6 = (Integer) c.decodeNullableSerializableElement(aj5Var, 2, i13.a, num6);
                        i14 |= 4;
                        i9 = 15;
                        i6 = 10;
                        i7 = 9;
                        c2 = 5;
                    case 3:
                        str20 = c.m(aj5Var, 3);
                        i14 |= 8;
                        i9 = 15;
                        i6 = 10;
                        i7 = 9;
                        c2 = 5;
                    case 4:
                        str21 = (String) c.decodeNullableSerializableElement(aj5Var, 4, mz5.a, str21);
                        i14 |= 16;
                        i9 = 15;
                        i6 = 10;
                        i7 = 9;
                        c2 = 5;
                    case 5:
                        str17 = (String) c.decodeNullableSerializableElement(aj5Var, 5, mz5.a, str17);
                        i14 |= 32;
                        c2 = 5;
                        i9 = 15;
                        i6 = 10;
                    case 6:
                        num5 = (Integer) c.decodeNullableSerializableElement(aj5Var, 6, i13.a, num5);
                        i14 |= 64;
                        i9 = 15;
                        c2 = 5;
                    case 7:
                        i12 = c.r(aj5Var, i8);
                        i14 |= 128;
                        i9 = 15;
                        c2 = 5;
                    case 8:
                        str16 = (String) c.decodeNullableSerializableElement(aj5Var, 8, mz5.a, str16);
                        i14 |= 256;
                        i9 = 15;
                        c2 = 5;
                    case 9:
                        str19 = c.m(aj5Var, i7);
                        i14 |= 512;
                        i9 = 15;
                        c2 = 5;
                    case 10:
                        i11 = c.r(aj5Var, i6);
                        i14 |= 1024;
                        i9 = 15;
                        c2 = 5;
                    case 11:
                        i13 = c.r(aj5Var, 11);
                        i14 |= 2048;
                        i9 = 15;
                        c2 = 5;
                    case 12:
                        str14 = (String) c.decodeNullableSerializableElement(aj5Var, 12, mz5.a, str14);
                        i14 |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                        i9 = 15;
                        c2 = 5;
                    case 13:
                        str15 = (String) c.decodeNullableSerializableElement(aj5Var, 13, mz5.a, str15);
                        i14 |= 8192;
                        i9 = 15;
                        c2 = 5;
                    case 14:
                        j3 = c.B(aj5Var, 14);
                        i14 |= 16384;
                        i9 = 15;
                    case 15:
                        j4 = c.B(aj5Var, i9);
                        i14 |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                    default:
                        qi2.f(i15);
                        return null;
                }
            }
            num = num5;
            str = str14;
            num2 = num6;
            i = i14;
            str2 = str15;
            str3 = str21;
            str4 = str18;
            str5 = str16;
            str6 = str17;
            i2 = i10;
            i3 = i11;
            str7 = str19;
            i4 = i12;
            str8 = str20;
            i5 = i13;
            j = j3;
            j2 = j4;
        }
        c.a(aj5Var);
        return new f00(i, str4, i2, num2, str8, str3, str6, num, i4, str5, str7, i3, i5, str, str2, j, j2);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        f00 f00Var = (f00) obj;
        f00Var.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        String str = f00Var.a;
        if (str != null) {
            c.encodeNullableSerializableElement(aj5Var, 0, mz5.a, str);
        }
        v0 v0Var = (v0) c;
        v0Var.t(1, f00Var.b, aj5Var);
        i13 i13Var = i13.a;
        v0Var.encodeNullableSerializableElement(aj5Var, 2, i13Var, f00Var.c);
        v0Var.w(aj5Var, 3, f00Var.d);
        mz5 mz5Var = mz5.a;
        v0Var.encodeNullableSerializableElement(aj5Var, 4, mz5Var, f00Var.e);
        v0Var.encodeNullableSerializableElement(aj5Var, 5, mz5Var, f00Var.f);
        v0Var.encodeNullableSerializableElement(aj5Var, 6, i13Var, f00Var.g);
        v0Var.t(7, f00Var.h, aj5Var);
        v0Var.encodeNullableSerializableElement(aj5Var, 8, mz5Var, f00Var.i);
        v0Var.w(aj5Var, 9, f00Var.j);
        v0Var.t(10, f00Var.k, aj5Var);
        v0Var.t(11, f00Var.l, aj5Var);
        v0Var.encodeNullableSerializableElement(aj5Var, 12, mz5Var, f00Var.m);
        v0Var.encodeNullableSerializableElement(aj5Var, 13, mz5Var, f00Var.n);
        v0Var.u(aj5Var, 14, f00Var.o);
        v0Var.u(aj5Var, 15, f00Var.p);
        c.a(aj5Var);
    }
}
