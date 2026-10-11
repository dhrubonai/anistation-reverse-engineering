package defpackage;

import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class n20 implements wd2 {
    public static final n20 a;
    private static final aj5 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [wd2, java.lang.Object, n20] */
    static {
        ?? obj = new Object();
        a = obj;
        kq4 kq4Var = new kq4("com.anistation.repository.backup.BackupWatchProgress", obj, 13);
        kq4Var.j("id", false);
        kq4Var.j("anistationId", true);
        kq4Var.j("anilistId", false);
        kq4Var.j("malId", false);
        kq4Var.j("animeTitle", false);
        kq4Var.j("episodeTitle", false);
        kq4Var.j("coverImage", false);
        kq4Var.j("thumbnailImage", false);
        kq4Var.j("episodeNumber", false);
        kq4Var.j("positionMs", false);
        kq4Var.j("durationMs", false);
        kq4Var.j("completed", false);
        kq4Var.j("updatedAt", false);
        descriptor = kq4Var;
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        mz5 mz5Var = mz5.a;
        x73 a2 = jb0.a(mz5Var);
        x73 a3 = jb0.a(mz5Var);
        x73 a4 = jb0.a(mz5Var);
        x73 a5 = jb0.a(mz5Var);
        i13 i13Var = i13.a;
        ql3 ql3Var = ql3.a;
        return new x73[]{mz5Var, a2, i13Var, i13Var, a3, mz5Var, a4, a5, i13Var, ql3Var, ql3Var, l70.a, ql3Var};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00a6. Please report as an issue. */
    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        boolean z;
        long j;
        int i2;
        String str5;
        int i3;
        int i4;
        long j2;
        long j3;
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        int i5 = 11;
        int i6 = 10;
        String str6 = null;
        if (c.decodeSequentially()) {
            String m = c.m(aj5Var, 0);
            mz5 mz5Var = mz5.a;
            String str7 = (String) c.decodeNullableSerializableElement(aj5Var, 1, mz5Var, null);
            int r = c.r(aj5Var, 2);
            int r2 = c.r(aj5Var, 3);
            String str8 = (String) c.decodeNullableSerializableElement(aj5Var, 4, mz5Var, null);
            String m2 = c.m(aj5Var, 5);
            String str9 = (String) c.decodeNullableSerializableElement(aj5Var, 6, mz5Var, null);
            str6 = (String) c.decodeNullableSerializableElement(aj5Var, 7, mz5Var, null);
            int r3 = c.r(aj5Var, 8);
            long B = c.B(aj5Var, 9);
            long B2 = c.B(aj5Var, 10);
            str4 = m;
            z = c.w(aj5Var, 11);
            j = B2;
            i2 = r3;
            str3 = str9;
            str5 = m2;
            i3 = r2;
            i = 8191;
            str2 = str8;
            i4 = r;
            str = str7;
            j2 = B;
            j3 = c.B(aj5Var, 12);
        } else {
            int i7 = 12;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            boolean z2 = true;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            long j4 = 0;
            long j5 = 0;
            long j6 = 0;
            String str13 = null;
            String str14 = null;
            boolean z3 = false;
            while (z2) {
                int i12 = c.i(aj5Var);
                switch (i12) {
                    case -1:
                        z2 = false;
                        i7 = 12;
                        i5 = 11;
                        i6 = 10;
                    case 0:
                        str14 = c.m(aj5Var, 0);
                        i8 |= 1;
                        i7 = 12;
                        i5 = 11;
                        i6 = 10;
                    case 1:
                        str12 = (String) c.decodeNullableSerializableElement(aj5Var, 1, mz5.a, str12);
                        i8 |= 2;
                        i7 = 12;
                        i5 = 11;
                        i6 = 10;
                    case 2:
                        i11 = c.r(aj5Var, 2);
                        i8 |= 4;
                        i7 = 12;
                    case 3:
                        i10 = c.r(aj5Var, 3);
                        i8 |= 8;
                        i7 = 12;
                    case 4:
                        str10 = (String) c.decodeNullableSerializableElement(aj5Var, 4, mz5.a, str10);
                        i8 |= 16;
                        i7 = 12;
                    case 5:
                        str11 = c.m(aj5Var, 5);
                        i8 |= 32;
                        i7 = 12;
                    case 6:
                        str13 = (String) c.decodeNullableSerializableElement(aj5Var, 6, mz5.a, str13);
                        i8 |= 64;
                        i7 = 12;
                    case 7:
                        str6 = (String) c.decodeNullableSerializableElement(aj5Var, 7, mz5.a, str6);
                        i8 |= 128;
                        i7 = 12;
                    case 8:
                        i9 = c.r(aj5Var, 8);
                        i8 |= 256;
                    case 9:
                        j5 = c.B(aj5Var, 9);
                        i8 |= 512;
                    case 10:
                        j4 = c.B(aj5Var, i6);
                        i8 |= 1024;
                    case 11:
                        z3 = c.w(aj5Var, i5);
                        i8 |= 2048;
                    case 12:
                        j6 = c.B(aj5Var, i7);
                        i8 |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
                    default:
                        qi2.f(i12);
                        return null;
                }
            }
            str = str12;
            str2 = str10;
            i = i8;
            str3 = str13;
            str4 = str14;
            z = z3;
            j = j4;
            i2 = i9;
            str5 = str11;
            i3 = i10;
            i4 = i11;
            j2 = j5;
            j3 = j6;
        }
        String str15 = str6;
        c.a(aj5Var);
        return new p20(i, str4, str, i4, i3, str2, str5, str3, str15, i2, j2, j, z, j3);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        p20 p20Var = (p20) obj;
        p20Var.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        v0 v0Var = (v0) c;
        v0Var.w(aj5Var, 0, p20Var.a);
        String str = p20Var.b;
        if (str != null) {
            v0Var.encodeNullableSerializableElement(aj5Var, 1, mz5.a, str);
        }
        v0Var.t(2, p20Var.c, aj5Var);
        v0Var.t(3, p20Var.d, aj5Var);
        mz5 mz5Var = mz5.a;
        v0Var.encodeNullableSerializableElement(aj5Var, 4, mz5Var, p20Var.e);
        v0Var.w(aj5Var, 5, p20Var.f);
        v0Var.encodeNullableSerializableElement(aj5Var, 6, mz5Var, p20Var.g);
        v0Var.encodeNullableSerializableElement(aj5Var, 7, mz5Var, p20Var.h);
        v0Var.t(8, p20Var.i, aj5Var);
        v0Var.u(aj5Var, 9, p20Var.j);
        v0Var.u(aj5Var, 10, p20Var.k);
        v0Var.p(aj5Var, 11, p20Var.l);
        v0Var.u(aj5Var, 12, p20Var.m);
        c.a(aj5Var);
    }
}
