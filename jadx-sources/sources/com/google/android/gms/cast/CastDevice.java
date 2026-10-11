package com.google.android.gms.cast;

import android.net.Network;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.aw7;
import defpackage.h11;
import defpackage.mm5;
import defpackage.oc7;
import defpackage.qi0;
import defpackage.y2;
import defpackage.z51;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class CastDevice extends y2 implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new aw7(16);
    public final String A;
    public final String B;
    public final String C;
    public final int D;
    public final List E;
    public final mm5 F;
    public final int G;
    public final String H;
    public final String I;
    public final int J;
    public final String K;
    public final byte[] L;
    public final String M;
    public final boolean N;
    public final oc7 O;
    public final Integer P;
    public final Boolean Q;
    public final Network R;
    public final String x;
    public final String y;
    public final InetAddress z;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, ArrayList arrayList, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9, boolean z, oc7 oc7Var, Integer num, Boolean bool, Network network) {
        this.x = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.y = str2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.z = InetAddress.getByName(str2);
            } catch (UnknownHostException e) {
                String str10 = this.y;
                String message = e.getMessage();
                Log.i("CastDevice", h11.l(new StringBuilder(str10.length() + 48 + String.valueOf(message).length()), "Unable to convert host address (", str10, ") to ipaddress: ", message));
            }
        }
        this.A = str3 == null ? "" : str3;
        this.B = str4 == null ? "" : str4;
        this.C = str5 == null ? "" : str5;
        this.D = i;
        this.E = arrayList == null ? new ArrayList() : arrayList;
        this.G = i3;
        this.H = str6 != null ? str6 : "";
        this.I = str7;
        this.J = i4;
        this.K = str8;
        this.L = bArr;
        this.M = str9;
        this.N = z;
        this.O = oc7Var;
        this.P = num;
        this.Q = bool;
        this.R = network;
        this.F = new mm5(i2);
    }

    public static CastDevice c(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle != null && (classLoader = CastDevice.class.getClassLoader()) != null) {
            bundle.setClassLoader(classLoader);
            return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
        }
        return null;
    }

    public final oc7 d() {
        oc7 oc7Var = this.O;
        if (oc7Var == null && this.F.e()) {
            return new oc7(1, false, false, null, null, null, null, null, false, false);
        }
        return oc7Var;
    }

    public final boolean equals(Object obj) {
        int i;
        byte[] bArr;
        boolean z;
        if (obj != this) {
            if (obj instanceof CastDevice) {
                CastDevice castDevice = (CastDevice) obj;
                byte[] bArr2 = castDevice.L;
                int i2 = castDevice.D;
                String str = castDevice.C;
                if (qi0.c(this.x, castDevice.x) && qi0.c(this.z, castDevice.z) && qi0.c(this.B, castDevice.B) && qi0.c(this.A, castDevice.A)) {
                    String str2 = this.C;
                    if (qi0.c(str2, str) && (i = this.D) == i2 && qi0.c(this.E, castDevice.E) && this.F.x == castDevice.F.x && this.G == castDevice.G && qi0.c(this.H, castDevice.H) && qi0.c(Integer.valueOf(this.J), Integer.valueOf(castDevice.J)) && qi0.c(this.K, castDevice.K) && qi0.c(this.I, castDevice.I) && qi0.c(str2, str) && i == i2 && ((((bArr = this.L) == null && bArr2 == null) || Arrays.equals(bArr, bArr2)) && qi0.c(this.M, castDevice.M) && this.N == castDevice.N && qi0.c(d(), castDevice.d()))) {
                        Boolean valueOf = Boolean.valueOf(g());
                        if (castDevice.g() && qi0.c(this.R, castDevice.R)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (qi0.c(valueOf, Boolean.valueOf(z))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int f() {
        mm5 mm5Var = this.F;
        if (!mm5Var.a(64)) {
            if (!mm5Var.d()) {
                if (mm5Var.e()) {
                    return 5;
                }
                if (!mm5Var.a(1)) {
                    return 1;
                }
                return 2;
            }
            return 3;
        }
        return 4;
    }

    public final boolean g() {
        Boolean bool = this.Q;
        if (bool != null) {
            return bool.booleanValue();
        }
        int i = this.G;
        if (i != -1 && (i & 2) > 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        String str;
        mm5 mm5Var = this.F;
        if (mm5Var.a(64)) {
            str = "[dynamic group]";
        } else if (mm5Var.d()) {
            str = "[static group]";
        } else if (mm5Var.e()) {
            str = "[speaker pair]";
        } else {
            str = "";
        }
        if (mm5Var.a(262144)) {
            str = str.concat("[cast connect]");
        }
        Locale locale = Locale.ROOT;
        Pattern pattern = qi0.a;
        String str2 = this.A;
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            if (length <= 2) {
                if (length == 2) {
                    str2 = "xx";
                } else {
                    str2 = "x";
                }
            } else {
                str2 = String.format(locale, "%c%d%c", Character.valueOf(str2.charAt(0)), Integer.valueOf(length - 2), Character.valueOf(str2.charAt(length - 1)));
            }
        }
        StringBuilder o = h11.o("\"", str2, "\" (", this.x, ") ");
        o.append(str);
        return o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 2, this.x);
        z51.m0(parcel, 3, this.y);
        z51.m0(parcel, 4, this.A);
        z51.m0(parcel, 5, this.B);
        z51.m0(parcel, 6, this.C);
        z51.r0(parcel, 7, 4);
        parcel.writeInt(this.D);
        z51.p0(parcel, 8, Collections.unmodifiableList(this.E));
        int i2 = this.F.x;
        z51.r0(parcel, 9, 4);
        parcel.writeInt(i2);
        z51.r0(parcel, 10, 4);
        parcel.writeInt(this.G);
        z51.m0(parcel, 11, this.H);
        z51.m0(parcel, 12, this.I);
        z51.r0(parcel, 13, 4);
        parcel.writeInt(this.J);
        z51.m0(parcel, 14, this.K);
        z51.a0(parcel, 15, this.L);
        z51.m0(parcel, 16, this.M);
        z51.r0(parcel, 17, 4);
        parcel.writeInt(this.N ? 1 : 0);
        z51.l0(parcel, 18, d(), i);
        z51.f0(parcel, 19, this.P);
        z51.Y(parcel, 20, Boolean.valueOf(g()));
        z51.l0(parcel, 21, this.R, i);
        z51.t0(parcel, s0);
    }
}
