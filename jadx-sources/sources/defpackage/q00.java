package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class q00 implements wd2 {
    public static final q00 a;
    private static final aj5 descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [q00, wd2, java.lang.Object] */
    static {
        ?? obj = new Object();
        a = obj;
        kq4 kq4Var = new kq4("com.anistation.repository.backup.BackupGlobalSettings", obj, 11);
        kq4Var.j("hapticsEnabled", false);
        kq4Var.j("adultEnabled", false);
        kq4Var.j("volumeBrightnessGestureEnabled", false);
        kq4Var.j("fullscreenSwipeGesturesEnabled", true);
        kq4Var.j("holdFastForwardEnabled", false);
        kq4Var.j("holdAction", true);
        kq4Var.j("doubleTapToSkipEnabled", false);
        kq4Var.j("showSkipEnabled", false);
        kq4Var.j("anilistUsername", true);
        kq4Var.j("malUsername", true);
        kq4Var.j("themeMode", true);
        descriptor = kq4Var;
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        l70 l70Var = l70.a;
        x73 a2 = jb0.a(l70Var);
        x73 a3 = jb0.a(l70Var);
        x73 a4 = jb0.a(l70Var);
        x73 a5 = jb0.a(l70Var);
        x73 a6 = jb0.a(l70Var);
        mz5 mz5Var = mz5.a;
        return new x73[]{a2, a3, a4, a5, a6, jb0.a(mz5Var), jb0.a(l70Var), jb0.a(l70Var), jb0.a(mz5Var), jb0.a(mz5Var), jb0.a(mz5Var)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x009a. Please report as an issue. */
    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        int i;
        String str;
        Boolean bool7;
        String str2;
        String str3;
        String str4;
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        int i6 = 5;
        int i7 = 8;
        char c2 = 4;
        String str5 = null;
        if (c.decodeSequentially()) {
            l70 l70Var = l70.a;
            Boolean bool8 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 0, l70Var, null);
            Boolean bool9 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 1, l70Var, null);
            Boolean bool10 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 2, l70Var, null);
            Boolean bool11 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 3, l70Var, null);
            Boolean bool12 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 4, l70Var, null);
            mz5 mz5Var = mz5.a;
            String str6 = (String) c.decodeNullableSerializableElement(aj5Var, 5, mz5Var, null);
            Boolean bool13 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 6, l70Var, null);
            bool = (Boolean) c.decodeNullableSerializableElement(aj5Var, 7, l70Var, null);
            String str7 = (String) c.decodeNullableSerializableElement(aj5Var, 8, mz5Var, null);
            String str8 = (String) c.decodeNullableSerializableElement(aj5Var, 9, mz5Var, null);
            str4 = (String) c.decodeNullableSerializableElement(aj5Var, 10, mz5Var, null);
            str3 = str8;
            str2 = str7;
            bool7 = bool13;
            str = str6;
            bool3 = bool11;
            i = 2047;
            bool2 = bool12;
            bool4 = bool10;
            bool5 = bool9;
            bool6 = bool8;
        } else {
            boolean z = true;
            int i8 = 0;
            bool = null;
            String str9 = null;
            Boolean bool14 = null;
            String str10 = null;
            String str11 = null;
            Boolean bool15 = null;
            Boolean bool16 = null;
            Boolean bool17 = null;
            Boolean bool18 = null;
            Boolean bool19 = null;
            while (z) {
                int i9 = c.i(aj5Var);
                switch (i9) {
                    case -1:
                        z = false;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        i7 = 8;
                    case 0:
                        bool19 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 0, l70.a, bool19);
                        i8 |= 1;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        i7 = 8;
                        c2 = 4;
                    case 1:
                        bool18 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 1, l70.a, bool18);
                        i8 |= 2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        i6 = 5;
                        c2 = 4;
                    case 2:
                        bool17 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 2, l70.a, bool17);
                        i8 |= 4;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                        c2 = 4;
                    case 3:
                        i8 |= 8;
                        bool15 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 3, l70.a, bool15);
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        c2 = 4;
                    case 4:
                        i8 |= 16;
                        bool16 = (Boolean) c.decodeNullableSerializableElement(aj5Var, 4, l70.a, bool16);
                        c2 = 4;
                        i2 = 10;
                        i3 = 9;
                    case 5:
                        str9 = (String) c.decodeNullableSerializableElement(aj5Var, i6, mz5.a, str9);
                        i8 |= 32;
                        c2 = 4;
                    case 6:
                        bool14 = (Boolean) c.decodeNullableSerializableElement(aj5Var, i5, l70.a, bool14);
                        i8 |= 64;
                        c2 = 4;
                    case 7:
                        bool = (Boolean) c.decodeNullableSerializableElement(aj5Var, i4, l70.a, bool);
                        i8 |= 128;
                        c2 = 4;
                    case 8:
                        str10 = (String) c.decodeNullableSerializableElement(aj5Var, i7, mz5.a, str10);
                        i8 |= 256;
                        c2 = 4;
                    case 9:
                        str5 = (String) c.decodeNullableSerializableElement(aj5Var, i3, mz5.a, str5);
                        i8 |= 512;
                        c2 = 4;
                    case 10:
                        str11 = (String) c.decodeNullableSerializableElement(aj5Var, i2, mz5.a, str11);
                        i8 |= 1024;
                        c2 = 4;
                    default:
                        qi2.f(i9);
                        return null;
                }
            }
            bool2 = bool16;
            bool3 = bool15;
            bool4 = bool17;
            bool5 = bool18;
            bool6 = bool19;
            i = i8;
            str = str9;
            bool7 = bool14;
            str2 = str10;
            str3 = str5;
            str4 = str11;
        }
        Boolean bool20 = bool;
        c.a(aj5Var);
        return new s00(i, bool6, bool5, bool4, bool3, bool2, str, bool7, bool20, str2, str3, str4);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        s00 s00Var = (s00) obj;
        s00Var.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        l70 l70Var = l70.a;
        Boolean bool = s00Var.a;
        String str = s00Var.j;
        String str2 = s00Var.i;
        c.encodeNullableSerializableElement(aj5Var, 0, l70Var, bool);
        c.encodeNullableSerializableElement(aj5Var, 1, l70Var, s00Var.b);
        c.encodeNullableSerializableElement(aj5Var, 2, l70Var, s00Var.c);
        Boolean bool2 = s00Var.d;
        if (bool2 != null) {
            c.encodeNullableSerializableElement(aj5Var, 3, l70Var, bool2);
        }
        c.encodeNullableSerializableElement(aj5Var, 4, l70Var, s00Var.e);
        String str3 = s00Var.f;
        if (str3 != null) {
            c.encodeNullableSerializableElement(aj5Var, 5, mz5.a, str3);
        }
        c.encodeNullableSerializableElement(aj5Var, 6, l70Var, s00Var.g);
        c.encodeNullableSerializableElement(aj5Var, 7, l70Var, s00Var.h);
        if (c.shouldEncodeElementDefault(aj5Var, 8) || str2 != null) {
            c.encodeNullableSerializableElement(aj5Var, 8, mz5.a, str2);
        }
        if (c.shouldEncodeElementDefault(aj5Var, 9) || str != null) {
            c.encodeNullableSerializableElement(aj5Var, 9, mz5.a, str);
        }
        String str4 = s00Var.k;
        if (str4 != null) {
            c.encodeNullableSerializableElement(aj5Var, 10, mz5.a, str4);
        }
        c.a(aj5Var);
    }
}
